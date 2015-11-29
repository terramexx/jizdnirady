package jizdnirady.jdf.mapper;

import jizdnirady.jdf.JdfVerzeEnum;
import jizdnirady.jdf.dto.*;
import org.junit.Assert;
import org.junit.Test;

public class JdfObjectMapperFactoryTest {

    @Test
    public void createMapper_v1_9_test() {
        JdfObjectMapper mapper;

        mapper = JdfObjectMapperFactory.createMapper(JdfVerzeEnum.JDF_1_9, JdfCasovyKod.class);
        Assert.assertTrue(mapper instanceof jizdnirady.jdf.mapper.v1_9.JdfCasovyKodMapper);

        mapper = JdfObjectMapperFactory.createMapper(JdfVerzeEnum.JDF_1_9, JdfDopravce.class);
        Assert.assertTrue(mapper instanceof jizdnirady.jdf.mapper.v1_9.JdfDopravceMapper);

        mapper = JdfObjectMapperFactory.createMapper(JdfVerzeEnum.JDF_1_9, JdfLinka.class);
        Assert.assertTrue(mapper instanceof jizdnirady.jdf.mapper.v1_9.JdfLinkaMapper);

        mapper = JdfObjectMapperFactory.createMapper(JdfVerzeEnum.JDF_1_9, JdfPevnyKod.class);
        Assert.assertTrue(mapper instanceof jizdnirady.jdf.mapper.v1_9.JdfPevnyKodMapper);

        mapper = JdfObjectMapperFactory.createMapper(JdfVerzeEnum.JDF_1_9, JdfSpoj.class);
        Assert.assertTrue(mapper instanceof jizdnirady.jdf.mapper.v1_9.JdfSpojMapper);

        mapper = JdfObjectMapperFactory.createMapper(JdfVerzeEnum.JDF_1_9, JdfUdaj.class);
        Assert.assertTrue(mapper instanceof jizdnirady.jdf.mapper.v1_9.JdfUdajMapper);

        mapper = JdfObjectMapperFactory.createMapper(JdfVerzeEnum.JDF_1_9, JdfZastavkaLinky.class);
        Assert.assertTrue(mapper instanceof jizdnirady.jdf.mapper.v1_9.JdfZastavkaLinkyMapper);

        mapper = JdfObjectMapperFactory.createMapper(JdfVerzeEnum.JDF_1_9, JdfZastavka.class);
        Assert.assertTrue(mapper instanceof jizdnirady.jdf.mapper.v1_9.JdfZastavkaMapper);

        mapper = JdfObjectMapperFactory.createMapper(JdfVerzeEnum.JDF_1_9, JdfZastavkaSpoj.class);
        Assert.assertTrue(mapper instanceof jizdnirady.jdf.mapper.v1_9.JdfZastavkaSpojMapper);
    }

    @Test
    public void createMapper_v1_10_test() {
        JdfObjectMapper mapper;

        mapper = JdfObjectMapperFactory.createMapper(JdfVerzeEnum.JDF_1_10, JdfCasovyKod.class);
        Assert.assertTrue(mapper instanceof jizdnirady.jdf.mapper.v1_10.JdfCasovyKodMapper);

        mapper = JdfObjectMapperFactory.createMapper(JdfVerzeEnum.JDF_1_10, JdfDopravce.class);
        Assert.assertTrue(mapper instanceof jizdnirady.jdf.mapper.v1_10.JdfDopravceMapper);

        mapper = JdfObjectMapperFactory.createMapper(JdfVerzeEnum.JDF_1_10, JdfLinka.class);
        Assert.assertTrue(mapper instanceof jizdnirady.jdf.mapper.v1_10.JdfLinkaMapper);

        mapper = JdfObjectMapperFactory.createMapper(JdfVerzeEnum.JDF_1_10, JdfPevnyKod.class);
        Assert.assertTrue(mapper instanceof jizdnirady.jdf.mapper.v1_10.JdfPevnyKodMapper);

        mapper = JdfObjectMapperFactory.createMapper(JdfVerzeEnum.JDF_1_10, JdfSpoj.class);
        Assert.assertTrue(mapper instanceof jizdnirady.jdf.mapper.v1_10.JdfSpojMapper);

        mapper = JdfObjectMapperFactory.createMapper(JdfVerzeEnum.JDF_1_10, JdfUdaj.class);
        Assert.assertTrue(mapper instanceof jizdnirady.jdf.mapper.v1_10.JdfUdajMapper);

        mapper = JdfObjectMapperFactory.createMapper(JdfVerzeEnum.JDF_1_10, JdfZastavkaLinky.class);
        Assert.assertTrue(mapper instanceof jizdnirady.jdf.mapper.v1_10.JdfZastavkaLinkyMapper);

        mapper = JdfObjectMapperFactory.createMapper(JdfVerzeEnum.JDF_1_10, JdfZastavka.class);
        Assert.assertTrue(mapper instanceof jizdnirady.jdf.mapper.v1_10.JdfZastavkaMapper);

        mapper = JdfObjectMapperFactory.createMapper(JdfVerzeEnum.JDF_1_10, JdfZastavkaSpoj.class);
        Assert.assertTrue(mapper instanceof jizdnirady.jdf.mapper.v1_10.JdfZastavkaSpojMapper);

        mapper = JdfObjectMapperFactory.createMapper(JdfVerzeEnum.JDF_1_10, JdfVerze.class);
        Assert.assertTrue(mapper instanceof jizdnirady.jdf.mapper.v1_10.JdfVerzeMapper);
    }

    @Test
    public void createMapper_v1_11_test() {
        JdfObjectMapper mapper;

        mapper = JdfObjectMapperFactory.createMapper(JdfVerzeEnum.JDF_1_11, JdfCasovyKod.class);
        Assert.assertTrue(mapper instanceof jizdnirady.jdf.mapper.v1_11.JdfCasovyKodMapper);

        mapper = JdfObjectMapperFactory.createMapper(JdfVerzeEnum.JDF_1_11, JdfDopravce.class);
        Assert.assertTrue(mapper instanceof jizdnirady.jdf.mapper.v1_11.JdfDopravceMapper);

        mapper = JdfObjectMapperFactory.createMapper(JdfVerzeEnum.JDF_1_11, JdfLinka.class);
        Assert.assertTrue(mapper instanceof jizdnirady.jdf.mapper.v1_11.JdfLinkaMapper);

        mapper = JdfObjectMapperFactory.createMapper(JdfVerzeEnum.JDF_1_11, JdfPevnyKod.class);
        Assert.assertTrue(mapper instanceof jizdnirady.jdf.mapper.v1_11.JdfPevnyKodMapper);

        mapper = JdfObjectMapperFactory.createMapper(JdfVerzeEnum.JDF_1_11, JdfSpoj.class);
        Assert.assertTrue(mapper instanceof jizdnirady.jdf.mapper.v1_11.JdfSpojMapper);

        mapper = JdfObjectMapperFactory.createMapper(JdfVerzeEnum.JDF_1_11, JdfUdaj.class);
        Assert.assertTrue(mapper instanceof jizdnirady.jdf.mapper.v1_11.JdfUdajMapper);

        mapper = JdfObjectMapperFactory.createMapper(JdfVerzeEnum.JDF_1_11, JdfZastavkaLinky.class);
        Assert.assertTrue(mapper instanceof jizdnirady.jdf.mapper.v1_11.JdfZastavkaLinkyMapper);

        mapper = JdfObjectMapperFactory.createMapper(JdfVerzeEnum.JDF_1_11, JdfZastavka.class);
        Assert.assertTrue(mapper instanceof jizdnirady.jdf.mapper.v1_11.JdfZastavkaMapper);

        mapper = JdfObjectMapperFactory.createMapper(JdfVerzeEnum.JDF_1_11, JdfZastavkaSpoj.class);
        Assert.assertTrue(mapper instanceof jizdnirady.jdf.mapper.v1_11.JdfZastavkaSpojMapper);

        mapper = JdfObjectMapperFactory.createMapper(JdfVerzeEnum.JDF_1_11, JdfVerze.class);
        Assert.assertTrue(mapper instanceof jizdnirady.jdf.mapper.v1_11.JdfVerzeMapper);
    }

    @Test
    public void getMapper_v1_9_test() {
        JdfObjectMapper mapper1 = JdfObjectMapperFactory.getMapper_v1_9(JdfCasovyKod.class);
        Assert.assertTrue(mapper1 instanceof jizdnirady.jdf.mapper.v1_9.JdfCasovyKodMapper);
        for (int i=0; i<10; i++) {
            JdfObjectMapper mapper2 = JdfObjectMapperFactory.getMapper_v1_9(JdfCasovyKod.class);
            Assert.assertTrue(mapper1.equals(mapper2));
        }
    }

    @Test
    public void getMapper_v1_10_test() {
        JdfObjectMapper mapper1 = JdfObjectMapperFactory.getMapper_v1_10(JdfCasovyKod.class);
        Assert.assertTrue(mapper1 instanceof jizdnirady.jdf.mapper.v1_10.JdfCasovyKodMapper);
        for (int i=0; i<10; i++) {
            JdfObjectMapper mapper2 = JdfObjectMapperFactory.getMapper_v1_10(JdfCasovyKod.class);
            Assert.assertTrue(mapper1.equals(mapper2));
        }
    }

    @Test
    public void getMapper_v1_11_test() {
        JdfObjectMapper mapper1 = JdfObjectMapperFactory.getMapper_v1_11(JdfCasovyKod.class);
        Assert.assertTrue(mapper1 instanceof jizdnirady.jdf.mapper.v1_11.JdfCasovyKodMapper);
        for (int i=0; i<10; i++) {
            JdfObjectMapper mapper2 = JdfObjectMapperFactory.getMapper_v1_11(JdfCasovyKod.class);
            Assert.assertTrue(mapper1.equals(mapper2));
        }
    }

    @Test
    public void getMapperTest() {
        JdfObjectMapper mapper_v1_9 = JdfObjectMapperFactory.getMapper(JdfVerzeEnum.JDF_1_9, JdfCasovyKod.class);
        Assert.assertTrue(mapper_v1_9 instanceof jizdnirady.jdf.mapper.v1_9.JdfCasovyKodMapper);

        JdfObjectMapper mapper_v1_10 = JdfObjectMapperFactory.getMapper(JdfVerzeEnum.JDF_1_10, JdfCasovyKod.class);
        Assert.assertTrue(mapper_v1_10 instanceof jizdnirady.jdf.mapper.v1_10.JdfCasovyKodMapper);

        JdfObjectMapper mapper_v1_11 = JdfObjectMapperFactory.getMapper(JdfVerzeEnum.JDF_1_11, JdfCasovyKod.class);
        Assert.assertTrue(mapper_v1_11 instanceof jizdnirady.jdf.mapper.v1_11.JdfCasovyKodMapper);
    }

}
