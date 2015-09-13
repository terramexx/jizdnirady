-- Schema pro JDF format verze 1.11

DROP SCHEMA IF EXISTS jizdnirady;
CREATE SCHEMA jizdnirady;
SET SCHEMA jizdnirady;



-- VERZEJDF
DROP TABLE IF EXISTS verzejdf;

CREATE TABLE verzejdf (
  cislo_verze         VARCHAR(5) NOT NULL,
  cislo_du            BIGINT,
  okres_kraj          VARCHAR(2),
  identifikace_davky  VARCHAR(20),
  datum_vytvoreni     DATE NOT NULL,
  jmeno               VARCHAR(60)
);


-- ZASTAVKY
DROP TABLE IF EXISTS zastavky;

CREATE TABLE zastavky (
  cislo_zastavky      BIGINT NOT NULL PRIMARY KEY,
  nazev_obce          VARCHAR(48) NOT NULL,
  cast_obce           VARCHAR(48),
  blizsi_misto        VARCHAR(48),
  blizka_obec         VARCHAR(3) NOT NULL,
  stat                VARCHAR(3) NOT NULL,
  pevny_kod1          VARCHAR(5),
  pevny_kod2          VARCHAR(5),
  pevny_kod3          VARCHAR(5),
  pevny_kod4          VARCHAR(5),
  pevny_kod5          VARCHAR(5),
  pevny_kod6          VARCHAR(5)
);


-- OZNACNIKY
DROP TABLE IF EXISTS oznacniky;

CREATE TABLE oznacniky (
  cislo_zastavky      BIGINT NOT NULL,
  kod_oznacniku       BIGINT NOT NULL,
  nazev               VARCHAR(48),
  smer_popis          VARCHAR(48),
  stanoviste          VARCHAR(12),
  rezerva1            VARCHAR(254),
  rezerva2            VARCHAR(254)
);


-- PEVNYKOD
DROP TABLE IF EXISTS pevnykod;

CREATE TABLE pevnykod (
  cislo_pevneho_kodu    VARCHAR(5) NOT NULL,
  oznaceni_pevneho_kodu VARCHAR(1) NOT NULL,
  rezerva               VARCHAR(254)
);



-- DOPRAVCI
DROP TABLE IF EXISTS dopravci;

CREATE TABLE dopravci (
  ic                    VARCHAR(10) NOT NULL,
  dic                   VARCHAR(14),
  obchodni_jmeno        VARCHAR(254) NOT NULL,
  druh_firmy            BIGINT NOT NULL, -- 1 – právnická osoba, 2 – fyzická osoba
  jmeno_fyzicke_osoby   VARCHAR(254) NOT NULL,
  sidlo_adresa          VARCHAR(254) NOT NULL,
  telefon_sidla         VARCHAR(48) NOT NULL,
  telefon_dispecink     VARCHAR(48),
  telefon_informace     VARCHAR(48),
  fax                   VARCHAR(48),
  email                 VARCHAR(48),
  www                   VARCHAR(48),
  rozliseni_dopravce    BIGINT NOT NULL
);



-- LINKY
DROP TABLE IF EXISTS linky;

CREATE TABLE linky (
  cislo_linky           BIGINT NOT NULL,
  nazev_linky           VARCHAR(254) NOT NULL,
  ic_dopravce           VARCHAR(10) NOT NULL,
  typ_linky             VARCHAR(1) NOT NULL,
  dopravni_prostredek   VARCHAR(1) NOT NULL,
  vylukovy_jr           BIT NOT NULL,
  seskupeni_spoju       BIT NOT NULL,
  pouziti_oznacniku     BIT NOT NULL,
  jednosmerny_jr        BIT NOT NULL,
  rezerva               VARCHAR(5),
  cislo_licence         VARCHAR(48),
  platnost_licence_od   DATE,
  platnost_licence_do   DATE,
  platnost_jr_od        DATE NOT NULL,
  platnost_jr_do        DATE NOT NULL,
  rozliseni_dopravce    BIGINT NOT NULL,
  rozliseni_linky       BIGINT NOT NULL
);



-- LINEXT
DROP TABLE IF EXISTS linext;

CREATE TABLE linext (
  cislo_linky           BIGINT NOT NULL,
  poradi                BIGINT NOT NULL,
  kod_dopravy           BIGINT NOT NULL,
  oznaceni_linky        VARCHAR(10) NOT NULL,
  preference_oznaceni   BIT NOT NULL,
  rezerva               VARCHAR(254),
  rozliseni_linky       BIGINT NOT NULL
);



-- SPOJE
DROP TABLE IF EXISTS spoje;

CREATE TABLE spoje (
  cislo_linky           BIGINT NOT NULL,
  cislo_spoje           BIGINT NOT NULL,
  pevny_kod1            VARCHAR(5),
  pevny_kod2            VARCHAR(5),
  pevny_kod3            VARCHAR(5),
  pevny_kod4            VARCHAR(5),
  pevny_kod5            VARCHAR(5),
  pevny_kod6            VARCHAR(5),
  pevny_kod7            VARCHAR(5),
  pevny_kod8            VARCHAR(5),
  pevny_kod9            VARCHAR(5),
  pevny_kod10           VARCHAR(5),
  kod_skupiny_spoju     BIGINT NOT NULL,
  rozliseni_linky       BIGINT NOT NULL
);



-- SPOJSKUP
DROP TABLE IF EXISTS spojskup;

CREATE TABLE spojskup (
  kod_skupiny_spoju     BIGINT NOT NULL,
  poradi                BIGINT NOT NULL,
  nazev                 VARCHAR(48) NOT NULL,
  popis                 VARCHAR(254),
  rezerva               VARCHAR(254)
);



-- ZASLINKY
DROP TABLE IF EXISTS zaslinky;

CREATE TABLE zaslinky (
  cislo_linky           BIGINT NOT NULL,
  cislo_tarifni         BIGINT NOT NULL,
  tarifni_pasmo         VARCHAR(50),
  cislo_zastavky        BIGINT NOT NULL,
  prumerna_doba         VARCHAR(5),
  pevny_kod1            VARCHAR(5),
  pevny_kod2            VARCHAR(5),
  pevny_kod3            VARCHAR(5),
  rozliseni_linky       BIGINT NOT NULL
);



-- ZASSPOJE
DROP TABLE IF EXISTS zasspoje;

CREATE TABLE zasspoje (
  cislo_linky           BIGINT NOT NULL,
  cislo_spoje           BIGINT NOT NULL,
  cislo_tarifni         BIGINT NOT NULL,
  cislo_zastavky        BIGINT NOT NULL,
  kod_oznacniku         BIGINT NOT NULL,
  cislo_stanoviste      VARCHAR(48),
  pevny_kod1            VARCHAR(5),
  pevny_kod2            VARCHAR(5),
  pevny_kod3            VARCHAR(5),
  kilometry             DECIMAL NOT NULL,
  cas_prijezdu          VARCHAR(5) NOT NULL,
  cas_odjezdu           VARCHAR(5),
  cas_prijezdu_min      VARCHAR(5) NOT NULL,
  cas_odjezdu_max       VARCHAR(5) NOT NULL,
  rozliseni_linky       BIGINT NOT NULL
);



-- UDAJE
DROP TABLE IF EXISTS udaje;

CREATE TABLE udaje (
  cislo_linky           BIGINT NOT NULL,
  cislo_udaje           BIGINT NOT NULL,
  text                  VARCHAR(254) NOT NULL,
  rozliseni_linky       BIGINT
);



-- CASKODY
DROP TABLE IF EXISTS caskody;

CREATE TABLE caskody (
  cislo_linky             BIGINT NOT NULL,
  cislo_spoje             BIGINT NOT NULL,
  cislo_casoveho_kodu     BIGINT NOT NULL,
  oznaceni_casoveho_kodu  VARCHAR(2) NOT NULL,
  typ_casoveho_kodu       VARCHAR(1),
  datum_od                DATE,
  datum_do                DATE,
  poznamka                VARCHAR(254),
  rozliseni_linky         BIGINT
);



-- NAVAZNOSTI
DROP TABLE IF EXISTS navaznosti;

CREATE TABLE navaznosti (
  typ_navaznosti                        VARCHAR(1) NOT NULL,
  cislo_linky                           BIGINT NOT NULL,
  cislo_spoje                           BIGINT NOT NULL,
  cislo_tarifni                         BIGINT NOT NULL,
  cislo_prestupni_linky                 BIGINT NOT NULL,
  cislo_zastavky_prestupni_linky        BIGINT NOT NULL,
  kod_oznacniku_prestupni_linky         BIGINT,
  cislo_vk_zastavky_prest_linky         BIGINT NOT NULL,
  kod_vk_oznacniku_prest_linky          BIGINT,
  doba_cekani                           BIGINT NOT NULL,
  poznamka                              VARCHAR(254),
  rozliseni_linky                       BIGINT NOT NULL
);



-- ALTDOP
DROP TABLE IF EXISTS altdop;

CREATE TABLE altdop (
  cislo_linky               BIGINT NOT NULL,
  cislo_spoje               BIGINT NOT NULL,
  ic_dopravce               BIGINT NOT NULL,
  pevny_kod1                VARCHAR(5),
  pevny_kod2                VARCHAR(5),
  pevny_kod3                VARCHAR(5),
  pevny_kod4                VARCHAR(5),
  pevny_kod5                VARCHAR(5),
  pevny_kod6                VARCHAR(5),
  typ_casoveho_kodu         VARCHAR(1),
  rezerva                   VARCHAR(254),
  datum_od                  DATE,
  datum_do                  DATE,
  rozliseni_dopravce        BIGINT NOT NULL,
  rozliseni_linky           BIGINT NOT NULL
);



-- ALTLINKY
DROP TABLE IF EXISTS altlinky;

CREATE TABLE altlinky (
  cislo_linky               BIGINT NOT NULL,
  alt_cislo_linky           BIGINT NOT NULL,
  stat                      VARCHAR(3) NOT NULL,
  rozliseni_linky           BIGINT
);



-- MISTENKY
DROP TABLE IF EXISTS mistenky;

CREATE TABLE mistenky (
  cislo_linky               BIGINT NOT NULL,
  cislo_spoje               BIGINT NOT NULL,
  text_informace            VARCHAR(254) NOT NULL,
  rozliseni_linky           BIGINT
);


COMMIT;