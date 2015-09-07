-- Table: "AltLinky"

-- DROP TABLE "AltLinky";

CREATE TABLE "AltLinky"
(
  "CisloLinky" bigint,
  "AltCisloLinky" character varying(20),
  "Stat" character varying(3),
  "RozliseniLinky" bigint
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "AltLinky"
  OWNER TO postgres;


-- Table: "Altdop"

-- DROP TABLE "Altdop";

CREATE TABLE "Altdop"
(
  "CisloLinky" bigint,
  "CisloSpoje" bigint,
  "ICDopravce" character varying(10),
  "PevnyKod1" character varying(5),
  "PevnyKod2" character varying(5),
  "PevnyKod3" character varying(5),
  "PevnyKod4" character varying(5),
  "PevnyKod5" character varying(5),
  "PevnyKod6" character varying(5),
  "TypCasovehoKodu" character varying(1),
  "Rezerva" character varying(254),
  "DatumOd" date,
  "DatumDo" date,
  "RozliseniDopravce" bigint,
  "RozliseniLinky" bigint
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "Altdop"
  OWNER TO postgres;


-- Table: "Caskody"

-- DROP TABLE "Caskody";

CREATE TABLE "Caskody"
(
  "CisloLinky" bigint,
  "CisloSpoje" bigint,
  "CisloCajovehoKodu" bigint,
  "OznaceniCasovehoKodu" character varying(2),
  "TypCasovehoKodu" character varying(1),
  "DatumOd" date,
  "DatumDo" date,
  "Poznamka" character varying(254),
  "RozliseniLinky" bigint
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "Caskody"
  OWNER TO postgres;


-- Table: "Dopravci"

-- DROP TABLE "Dopravci";

CREATE TABLE "Dopravci"
(
  "IC" character varying(10),
  "DIC" character varying(14),
  "Obchodni jmeno" character varying(254),
  "DruhFirmy" bigint,
  "JmenoFyzickeOsoby" character varying(254),
  "SidloAdresa" character varying(254),
  "TelefonSidla" character varying(48),
  "TelefonDispecink" character varying(48),
  "TelefonInformace" character varying(48),
  "Fax" character varying(48),
  "Email" character varying(48),
  wwww character varying(48),
  "RozliseniDopravce" character varying(48)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "Dopravci"
  OWNER TO postgres;


-- Table: "LinExt"

-- DROP TABLE "LinExt";

CREATE TABLE "LinExt"
(
  "CisloLinky" bigint,
  "Poradi" bigint,
  "KodDopravy" bigint,
  "OznaceniLinky" character varying(10),
  "PreferenceOznaceni" bit(1),
  "Rezerva" character varying(254),
  "RozliseniLinky" bigint
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "LinExt"
  OWNER TO postgres;


-- Table: "Linky"

-- DROP TABLE "Linky";

CREATE TABLE "Linky"
(
  "CisloLinky" bigint,
  "NazevLinky" character varying(254),
  "ICDopravce" character varying(10),
  "TypLinky" character varying(1),
  "DopravniProstredek" character varying(1),
  "ObjizdkovyJR" bit(1),
  "SeskupeniSpoju" bit(1),
  "PouzitiOznacniku" bit(1),
  "Rezerva" character varying(5),
  "CisloLicence" character varying(48),
  "PlatnostLicenceOd" date,
  "PlatnostLicenceDo" date,
  "PlatnostJROd" date,
  "PlatnostJRDo" date,
  "RozliseniDopravce" bigint,
  "RozliseniLinky" bigint
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "Linky"
  OWNER TO postgres;


-- Table: "Mistenky"

-- DROP TABLE "Mistenky";

CREATE TABLE "Mistenky"
(
  "CisloLinky" bigint,
  "CisloSpoje" bigint,
  "TextInformace" character varying(254),
  "RozliseniLinky" bigint
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "Mistenky"
  OWNER TO postgres;


-- Table: "Navaznosti"

-- DROP TABLE "Navaznosti";

CREATE TABLE "Navaznosti"
(
  "TypNavaznosti" character varying(1),
  "CisloLinky" bigint,
  "CisloSpoje" bigint,
  "CisloTarifni" bigint,
  "CisloPrestupniLinky" bigint,
  "CisloZastavkyPrestupniLinky" bigint,
  "KodOznaceniPrestupniLinky" bigint,
  "CisloVychoziKoncoveZastavkySpojePrestupniLinky" bigint,
  "KodVychozihoKoncovehoOznaceniSpojePrestupniLinky" bigint,
  "DobaCekani" bigint,
  "RozliseniLinky" bigint
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "Navaznosti"
  OWNER TO postgres;


-- Table: "Oznacniky"

-- DROP TABLE "Oznacniky";

CREATE TABLE "Oznacniky"
(
  "CisloZastavky" bigint,
  "KodOznacniku" bigint,
  "Nazev" character varying(48),
  "SmerPopis" character varying(48),
  "Stanoviste" character varying(12),
  "Rezerva1" character varying(254),
  "Rezerva2" character varying(254)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "Oznacniky"
  OWNER TO postgres;


-- Table: "PevnyKod"

-- DROP TABLE "PevnyKod";

CREATE TABLE "PevnyKod"
(
  "CisloPevnehoKodu" character varying(5),
  "OznaceniPevnehoKodu" character varying(1),
  "Rezerva" character varying(254)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "PevnyKod"
  OWNER TO postgres;


-- Table: "SpojSkup"

-- DROP TABLE "SpojSkup";

CREATE TABLE "SpojSkup"
(
  "KodSkupinySpoju" bigint,
  "Poradi" bigint,
  "Nazev" character varying(48),
  "Popis" character varying(254),
  "Rezerva" character varying(254)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "SpojSkup"
  OWNER TO postgres;


-- Table: "Spoje"

-- DROP TABLE "Spoje";

CREATE TABLE "Spoje"
(
  "CisloLinky" bigint,
  "CisloSpoje" bigint,
  "PevKod1" character varying(5),
  "PevKod2" character varying(5),
  "PevKod3" character varying(5),
  "PevKod4" character varying(5),
  "PevKod5" character varying(5),
  "PevKod6" character varying(5),
  "PevKod7" character varying(5),
  "PevKod8" character varying(5),
  "PevKod9" character varying(5),
  "PevKod10" character varying(5),
  "KodSkupinySpoju" bigint,
  "RozliseniLinky" bigint
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "Spoje"
  OWNER TO postgres;


-- Table: "Udaje"

-- DROP TABLE "Udaje";

CREATE TABLE "Udaje"
(
  "CisloLinky" bigint,
  "CisloUdaje" bigint,
  "Text" character varying(254),
  "RozliseniLinky" bigint
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "Udaje"
  OWNER TO postgres;


-- Table: "VerzeJDF"

-- DROP TABLE "VerzeJDF";

CREATE TABLE "VerzeJDF"
(
  "CisloVerzeJDF" integer,
  "CisloDU" bigint,
  "OkresKraj" character varying(2),
  "IdentifikaceDavky" character varying(20),
  "DatumVyrobyDavky" date,
  "Jmeno" character varying(60)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "VerzeJDF"
  OWNER TO postgres;


-- Table: "Zaslinky"

-- DROP TABLE "Zaslinky";

CREATE TABLE "Zaslinky"
(
  "CisloLinky" bigint,
  "CisloTarifni" bigint,
  "TarifniPasmo" character varying(50),
  "CisloZastavky" bigint,
  "PrumernaDoba" character varying(5),
  "PevKod1" character varying(5),
  "PevKod2" character varying(5),
  "PevKod3" character varying(5),
  "RozliseniLinky" bigint
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "Zaslinky"
  OWNER TO postgres;


-- Table: "Zasspoje"

-- DROP TABLE "Zasspoje";

CREATE TABLE "Zasspoje"
(
  "CisloLinky" bigint,
  "CisloSpoje" bigint,
  "CisloTarifni" bigint,
  "CisloZastavky" bigint,
  "KodOznacniku" bigint,
  "CisloStanoviste" character varying(48),
  "PevKod1" character varying(5),
  "PevKod2" character varying(5),
  "Kilometry" integer,
  "CasPrijezdu" character varying(5),
  "CasOdjezdu" character varying(5),
  "RozliseniLinky" bigint
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "Zasspoje"
  OWNER TO postgres;


-- Table: "Zastavky"

-- DROP TABLE "Zastavky";

CREATE TABLE "Zastavky"
(
  "CisloZastavky" bigint,
  "NazevObce" character varying(48),
  "CastObce" character varying(48),
  "BlizsiMisto" character varying(48),
  "BlizkaObec" character varying(48),
  "Stat" character varying(3),
  "PevKod1" character varying(5),
  "PevKod2" character varying(5),
  "PevKod3" character varying(5),
  "PevKod4" character varying(5),
  "PevKod5" character varying(5),
  "PevKod6" character varying(5)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "Zastavky"
  OWNER TO postgres;
