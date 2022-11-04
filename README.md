# pdftool

Java based pdf CLI tools (and pdf library overview).

## java

### itext 7 based

* https://itextpdf.com/resources/downloads

* https://kb.itextpdf.com/home/it7kb/examples/digital-signatures-chapter-4
  + https://itextpdf.com/resources/books/addendum-digital-signatures-pdf-documents
* https://itextpdf.com/blog/technical-notes/using-itext-7-and-aws-kms-digitally-sign-pdf-document

* https://stackoverflow.com/questions/37268384/convert-pdf-to-pdf-a-using-itext-library
* https://kb.itextpdf.com/home/it7kb/ebooks/itext-7-jump-start-tutorial-for-java/chapter-7-creating-pdf-ua-and-pdf-a-documents

* https://kb.itextpdf.com/home/it7kb/ebooks/itext-7-converting-html-to-pdf-with-pdfhtml

#### itext 7 distro

* itext 7 community https://github.com/itext/itext7
* https://github.com/itext/i7j-pdfhtml html to pdf
* https://github.com/itext/i7j-rups view pdf structure in swing UI

### opendpf based

* https://github.com/LibrePDF/OpenPDF
  + https://github.com/LibrePDF/OpenPDF/tree/master/pdf-toolbox/src/main/java/com/lowagie/tools

#### openpdf distro

* openpdf
* openpdf-fonts-extra
* pdf-toolbox
* pdf-swing

### pdfbox based

* https://github.com/ETDA some _very_ interesting examples
* https://github.com/apache/pdfbox/tree/trunk/examples/src/main/java/org/apache/pdfbox/examples/signature

* https://stackoverflow.com/questions/38973430/apache-pdfbox-and-pdf-a-3

#### pdfbox 3 

* https://pdfbox.apache.org/3.0/migration.html

#### pdf distro

* Apache Preflight - library is an open source Java tool that implements a parser compliant with the ISO-19005 (PDF/A) specification. Preflight is a subproject of Apache PDFBox.
* Apache Pdfbox tools - commandline tools using Apache PDFBox
  + https://pdfbox.apache.org/2.0/commandline.html
    - decrypt, encrypt, extract images, extract text, overlay pdf, pdf debugger (extra jar), 
      pdf merge, pdf split, pdf to image, print pdf, text to pdf, write decoded doc (decompress)
* Apache Pdf Debugger
* Apache XmpBox library is an open source Java tool that implements Adobe's XMP(TM) specification. It can be used to parse, validate and create xmp contents. It is mainly used by subproject preflight of Apache PDFBox. XmpBox is a subproject of Apache PDFBox.
* Apache FontBox library is an open source Java tool to obtain low level information from font files. FontBox is a subproject of Apache PDFBox.

### sejda based

* https://github.com/torakiki/sejda/wiki/Tasks
  + https://sejda.org/ pdf tools for
    - merge, split, extract, compress, crop, encrypt, decrypt, convert, attachments, header/footers

### external tools

* https://verapdf.org/ - PDF/A validator
* https://www.adobe.com/devnet/xmp.html Adobe XMP Toolkit SDK (xmp-core.jar, ...)
* https://github.com/intoolswetrust/jsignpdf sign pdf
  + https://jsignpdf.sourceforge.net/
* https://github.com/LibrePDF/OpenPDF
* https://github.com/esig/dss Digital Signature Service includes pdf signing
  + https://ec.europa.eu/digital-building-blocks/DSS/webapp-demo
  + https://github.com/nowina-solutions/nexu/ - java (applets) smartcard support
* https://www.e-iceblue.com/Download/pdf-for-java-free.html
  + https://www.e-iceblue.com/Introduce/pdf-for-java.html (non-free)

### external services

* https://pdfcandy.com

## other languages

* https://github.com/pdfcpu/pdfcpu go
* [LocalSigner](https://www.e-service.admin.ch/wiki/display/openegovdoc/LocalSigner+Download)
* https://podofo.sourceforge.net/index.html c++
  + https://podofo.sourceforge.net/about.html
  + https://podofo.sourceforge.net/doc/html/classPoDoFo_1_1PdfAction.html
  + https://github.com/pdfmm/pdfmm

## TSA Time Services

* https://www.bit.admin.ch/bit/de/home/subsites/allgemeines-zur-swiss-government-pki/tsa-service.html
* https://www.pki.dfn.de/zeitstempeldienst/
  + https://www.pki.dfn.de/faqpki/faq-zeitstempel
  + https://doku.tid.dfn.de/de:dfnpki:dfnpki_root_certs
