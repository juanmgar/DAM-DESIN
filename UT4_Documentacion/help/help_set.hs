<?xml version='1.0' encoding='ISO-8859-1' ?>
<!DOCTYPE helpset
  PUBLIC "-//Sun Microsystems Inc.//DTD JavaHelp HelpSet Version 2.0//EN"
         "http://java.sun.com/products/javahelp/helpset_2_0.dtd">
<helpset version="2.0">
	<title>Ejemplo de ayuda Helpset</title>
	<maps>
		<homeID>calculadora</homeID>
		<mapref location="map_file.jhm" />
	</maps>
	<view>
		<name>Tabla contenidos</name>
		<label>Tabla de contenidos </label>
		<type>javax.help.TOCView</type>
		<data>toc.xml</data>
	</view>
	<view>
		<name>Indice</name>
		<label>El índice</label>
		<type>javax.help.IndexView</type>
		<data>indice.xml</data>
	</view>
</helpset>