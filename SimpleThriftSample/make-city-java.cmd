@echo off

set indir=%~dp0thrift
set outdir=%~dp0java-output

echo INDIR : %indir%
echo OUTDIR: %outdir%

echo Cleaning and recreating output directory
if exist "%outdir%\" (
	rmdir /S /Q "%outdir%\"
) 

mkdir "%outdir%\"

"%~dp0..\bin\thrift\thrift-0.9.2.exe" --gen java -out "%outdir%" "%indir%\city.thrift"

