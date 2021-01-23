from nbconvert import SlidesExporter

exporter = SlidesExporter()
body, _ = exporter.from_filename("presentation.ipynb")

# stores an interactive slideshow of this presentation
with open("./slides/index.html", "w", encoding="utf8") as f:
    f.write(body)
