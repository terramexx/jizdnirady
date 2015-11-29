package jizdnirady.jdf.mapper;

import jizdnirady.jdf.JdfVerzeEnum;
import jizdnirady.jdf.dto.*;

import java.util.Hashtable;
import java.util.Map;

public class JdfObjectMapperFactory {

    private static final Map<Class<? extends JdfObject>, JdfObjectMapper> map_v1_11 = new Hashtable<>();
    private static final Map<Class<? extends JdfObject>, JdfObjectMapper> map_v1_10 = new Hashtable<>();
    private static final Map<Class<? extends JdfObject>, JdfObjectMapper> map_v1_9 = new Hashtable<>();
    private static final Object lock = new Object();

    public static JdfObjectMapper getMapper(JdfVerzeEnum jdfVerzeEnum, Class<? extends JdfObject> clazz) {
        if (JdfVerzeEnum.JDF_1_11.equals(jdfVerzeEnum)) {
            return getMapper_v1_11(clazz);
        } else if (JdfVerzeEnum.JDF_1_10.equals(jdfVerzeEnum)) {
            return getMapper_v1_10(clazz);
        } else if (JdfVerzeEnum.JDF_1_9.equals(jdfVerzeEnum)) {
            return getMapper_v1_9(clazz);
        } else {
            return null;
        }
    }

    protected static JdfObjectMapper getMapper_v1_9(Class<? extends JdfObject> clazz) {
        JdfObjectMapper mapper = map_v1_9.get(clazz);
        if (mapper == null) {
            synchronized (lock) {
                mapper = createMapper(JdfVerzeEnum.JDF_1_9, clazz);
                if (mapper != null) {
                    map_v1_9.put(clazz, mapper);
                }
            }
        }
        return mapper;
    }

    protected static JdfObjectMapper getMapper_v1_10(Class<? extends JdfObject> clazz) {
        JdfObjectMapper mapper = map_v1_10.get(clazz);
        if (mapper == null) {
            synchronized (lock) {
                mapper = createMapper(JdfVerzeEnum.JDF_1_10, clazz);
                if (mapper != null) {
                    map_v1_10.put(clazz, mapper);
                }
            }
        }
        return mapper;
    }

    protected static JdfObjectMapper getMapper_v1_11(Class<? extends JdfObject> clazz) {
        JdfObjectMapper mapper = map_v1_11.get(clazz);
        if (mapper == null) {
            synchronized (lock) {
                mapper = createMapper(JdfVerzeEnum.JDF_1_11, clazz);
                if (mapper != null) {
                    map_v1_11.put(clazz, mapper);
                }
            }
        }
        return mapper;
    }

    protected static JdfObjectMapper createMapper(JdfVerzeEnum jdfVerzeEnum, Class<? extends JdfObject> clazz) {
        if (JdfVerzeEnum.JDF_1_9.equals(jdfVerzeEnum)) {
            if (JdfCasovyKod.class.equals(clazz)) {
                return new jizdnirady.jdf.mapper.v1_9.JdfCasovyKodMapper();
            } else if (JdfDopravce.class.equals(clazz)) {
                return new jizdnirady.jdf.mapper.v1_9.JdfDopravceMapper();
            } else if (JdfLinka.class.equals(clazz)) {
                return new jizdnirady.jdf.mapper.v1_9.JdfLinkaMapper();
            } else if (JdfPevnyKod.class.equals(clazz)) {
                return new jizdnirady.jdf.mapper.v1_9.JdfPevnyKodMapper();
            } else if (JdfSpoj.class.equals(clazz)) {
                return new jizdnirady.jdf.mapper.v1_9.JdfSpojMapper();
            } else if (JdfUdaj.class.equals(clazz)) {
                return new jizdnirady.jdf.mapper.v1_9.JdfUdajMapper();
            } else if (JdfZastavkaLinky.class.equals(clazz)) {
                return new jizdnirady.jdf.mapper.v1_9.JdfZastavkaLinkyMapper();
            } else if (JdfZastavka.class.equals(clazz)) {
                return new jizdnirady.jdf.mapper.v1_9.JdfZastavkaMapper();
            } else if (JdfZastavkaSpoj.class.equals(clazz)) {
                return new jizdnirady.jdf.mapper.v1_9.JdfZastavkaSpojMapper();
            } else if (JdfVerze.class.equals(clazz)) {
                return new jizdnirady.jdf.mapper.v1_9.JdfVerzeMapper();
            }
        } else if (JdfVerzeEnum.JDF_1_10.equals(jdfVerzeEnum)) {
            if (JdfCasovyKod.class.equals(clazz)) {
                return new jizdnirady.jdf.mapper.v1_10.JdfCasovyKodMapper();
            } else if (JdfDopravce.class.equals(clazz)) {
                return new jizdnirady.jdf.mapper.v1_10.JdfDopravceMapper();
            } else if (JdfLinka.class.equals(clazz)) {
                return new jizdnirady.jdf.mapper.v1_10.JdfLinkaMapper();
            } else if (JdfPevnyKod.class.equals(clazz)) {
                return new jizdnirady.jdf.mapper.v1_10.JdfPevnyKodMapper();
            } else if (JdfSpoj.class.equals(clazz)) {
                return new jizdnirady.jdf.mapper.v1_10.JdfSpojMapper();
            } else if (JdfUdaj.class.equals(clazz)) {
                return new jizdnirady.jdf.mapper.v1_10.JdfUdajMapper();
            } else if (JdfZastavkaLinky.class.equals(clazz)) {
                return new jizdnirady.jdf.mapper.v1_10.JdfZastavkaLinkyMapper();
            } else if (JdfZastavka.class.equals(clazz)) {
                return new jizdnirady.jdf.mapper.v1_10.JdfZastavkaMapper();
            } else if (JdfZastavkaSpoj.class.equals(clazz)) {
                return new jizdnirady.jdf.mapper.v1_10.JdfZastavkaSpojMapper();
            } else if (JdfVerze.class.equals(clazz)) {
                return new jizdnirady.jdf.mapper.v1_10.JdfVerzeMapper();
            }
        } else if (JdfVerzeEnum.JDF_1_11.equals(jdfVerzeEnum)) {
            if (JdfCasovyKod.class.equals(clazz)) {
                return new jizdnirady.jdf.mapper.v1_11.JdfCasovyKodMapper();
            } else if (JdfDopravce.class.equals(clazz)) {
                return new jizdnirady.jdf.mapper.v1_11.JdfDopravceMapper();
            } else if (JdfLinka.class.equals(clazz)) {
                return new jizdnirady.jdf.mapper.v1_11.JdfLinkaMapper();
            } else if (JdfPevnyKod.class.equals(clazz)) {
                return new jizdnirady.jdf.mapper.v1_11.JdfPevnyKodMapper();
            } else if (JdfSpoj.class.equals(clazz)) {
                return new jizdnirady.jdf.mapper.v1_11.JdfSpojMapper();
            } else if (JdfUdaj.class.equals(clazz)) {
                return new jizdnirady.jdf.mapper.v1_11.JdfUdajMapper();
            } else if (JdfZastavkaLinky.class.equals(clazz)) {
                return new jizdnirady.jdf.mapper.v1_11.JdfZastavkaLinkyMapper();
            } else if (JdfZastavka.class.equals(clazz)) {
                return new jizdnirady.jdf.mapper.v1_11.JdfZastavkaMapper();
            } else if (JdfZastavkaSpoj.class.equals(clazz)) {
                return new jizdnirady.jdf.mapper.v1_11.JdfZastavkaSpojMapper();
            } else if (JdfVerze.class.equals(clazz)) {
                return new jizdnirady.jdf.mapper.v1_11.JdfVerzeMapper();
            }
        }

        return null;
    }

}
