rem @echo off

set indir=%~dp0proto
set outdir=%~dp0dotnet\ProtobufClient\Generated

echo INDIR : %indir%
echo OUTDIR: %outdir%

echo Cleaning output directory
if not exist "%outdir%\" (
	mkdir "%outdir%\"
) else (
	del /S /F /Q "%outdir%\*.cs"
)

"%~dp0..\bin\protobuf\protogen.exe" --proto_path="%indir%" -output_directory="%outdir%"  "%indir%\descriptor.proto" "%indir%\csharp_options.proto" "%indir%\city.proto"
