<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN"
	"http://www.w3.org/TR/html4/strict.dtd">
<html>
	<head>
		<meta http-equiv="Content-type" content="text/html; charset=utf-8">
		<title>DataTables - TableTools</title>
		
		<link rel="shortcut icon" type="image/ico" href="/media/images/favicon.ico">
		<link rel="alternate" type="application/rss+xml" title="RSS 2.0" href="http://www.datatables.net/rss.xml">
		
		<style type="text/css" media="screen">
			@import "/static/css/TableTools.css";
			div.dataTables_wrapper { font-size: 13px; }
			table.display thead th, table.display td { font-size: 13px; }
		</style>
		
		<script type="text/javascript" src="/static/js/complete.min.js"></script>
		<script type="text/javascript" src="/static/js/jquery.dataTables.js"></script>
		<script type="text/javascript" src="/static/js/TableTools.min.js"></script>
		<script type="text/javascript" charset="utf-8">
			$(document).ready( function () {
				$('#example').dataTable( {
					"sDom": 'T<"clear">lfrtip',
					TableToolsInit.sTitle = "whatever";
					"oTableTools": {
						"sSwfPath": "/release-datatables/extras/TableTools/media/swf/copy_csv_xls_pdf.swf"
					}
				} );
			} );
		</script>
	</head>
	<body class="grid_1_2">
		<div id="fw_container">
			
			


			<div id="fw_header">
				<h1>
					<a href="/index">
						<img src="/media/images/DataTables.jpg" alt="DataTables logo">
						DataTables
					</a>
				</h1>
				<ul>
					<li><a  href="/usage">Usage</a></li>
					<li><a  href="/examples">Examples</a></li>
					<li><a  href="/styling">Styling</a></li>
					<li><a  href="/api">API</a></li>
					<li><a  href="/development">Development</a></li>
					<li><a  href="http://editor.datatables.net">Editor</a></li>
					<li><a class="active" href="/extras">Extras</a></li>
					<li><a  href="/plug-ins">Plug-ins</a></li>
					<li><a  href="/blog">Blog</a></li>
					<li><a  href="/faqs">FAQs</a></li>
					<li><a  href="/forums">Forums</a></li>
									</ul>
				<div class="css_clear"></div>
									<ul class="submenu submenu_extras">
						<li><a  href="/extras">Overview</a></li>
						<li><a  href="/extras/autofill">AutoFill</a></li>
						<li><a  href="/extras/colreorder">ColReorder</a></li>
						<li><a  href="/extras/colvis">ColVis</a></li>
						<li><a  href="/extras/fixedcolumns">FixedColumns</a></li>
						<li><a  href="/extras/fixedheader">FixedHeader</a></li>
						<li><a  href="/extras/keytable">KeyTable</a></li>
						<li><a  href="/extras/scroller">Scroller</a></li>
						<li><a class="active" href="/extras/tabletools">TableTools</a></li>
					</ul>
					<div class="css_clear"></div>
								
									<ul class="subsubmenu subsubmenu_tabletools">
						<li><a class="active" href="/extras/tabletools">Introduction</a></li>
						<li><a  href="/extras/tabletools/examples">Examples</a></li>
						<li><a  href="/extras/tabletools/initialisation">Initialisation</a></li>
						<li><a  href="/extras/tabletools/buttons">Buttons</a></li>
						<li><a  href="/extras/tabletools/button_options">Button options</a></li>
						<li><a  href="/extras/tabletools/api">API</a></li>
						<li><a  href="/extras/tabletools/plug-ins">Plug-ins</a></li>
					</ul>
					<div class="css_clear"></div>
								
				
				<div id="header_options">
					<div id="options_donate" class="option">
						<a href="/donate">
							<table cellpadding="0" cellspacing="0" border="0">
								<tr>
									<td>
										<img src="/media/images/beer.png" alt="Donate icon">
									</td>
									<td style="line-height:16px;">
										Donate <br><span class="css_vsmall"></span>
									</td>
								</tr>
							</table>
						</a>
					</div>
					<div id="options_download" class="option">
						<a href="/download">
							<table cellpadding="0" cellspacing="0" border="0">
								<tr>
									<td>
										<img src="/media/images/download.png" alt="Download icon">
									</td>
									<td style="line-height:16px;">
										Download <br><span class="css_vsmall">v1.9.4</span>
									</td>
								</tr>
							</table>
						</a>
					</div>
					<div id="options_support" class="option">
						<a href="/support">
							<table cellpadding="0" cellspacing="0" border="0">
								<tr>
									<td>
										<img src="/media/images/support.png" alt="Support icon">
									</td>
									<td style="line-height: 16px;">
										Support<br><span class="css_vsmall">3h 11m avg response</span>
									</td>
								</tr>
							</table>
						</a>
					</div>
			 		<div id="options_search" class="option">
			 			<form action="http://datatables.net/search" id="cse-search-box">
			 				<img src="/media/images/search.png" alt="Search icon">
		   				<input type="hidden" name="cx" value="004673356914326163298:bcgejkcchl4" />
			 				<input type="hidden" name="cof" value="FORID:9" />
			 				<input type="hidden" name="ie" value="UTF-8" />
			 				<input type="text" name="q" size="31" />
			 				<input type="submit" name="sa" value="Search" />
			 			</form>
			 			<script type="text/javascript" src="http://www.google.com/cse/brand?form=cse-search-box&lang=en"></script>
			 		</div>
				</div>
				
				<div id="header_advert">
					<script type="text/javascript" src="//cdn.adpacks.com/adpacks.js?legacyid=1266180&zoneid=1386&key=4b4cb470d035b673ad498e2a46300b4d&serve=C6SD52Y&placement=datatablesnet&circle=dev" id="_adpacks_js"></script>
									</div>
			</div>
			
						
			<div id="fw_content">
				
				<h2>Introduction</h2>
				<div class="grid_column_1">
					<p>TableTools is a plug-in for the <a href="/">DataTables</a> HTML table enhancer, which adds a highly customisable button toolbar to a DataTable. Key features include:</p>
					<ul class="limit_length">
						<li>Copy to clipboard</li>
						<li>Save table data as CSV, XLS or PDF files</li>
						<li>Print view for clean printing</li>
						<li>Row selection options</li>
						<li>Easy use predefined buttons</li>
						<li>Simple customisation of buttons</li>
						<li>Well defined API for advanced control</li>
					</ul>
				</div>
				
				<div class="grid_column_2">
					<p>Keen to dive right in? Initialising TableTools with DataTables:</p>
					<pre class="brush: js; font-size: 75%">/*
 * Example initialisation
 */
$(document).ready( function () {
	$('#example').dataTable( {
		"sDom": 'T&lt;"clear"&gt;lfrtip',
		"oTableTools": {
			"sSwfPath": "/swf/copy_csv_xls_pdf.swf"
		}
	} );
} );</pre>
				</div>
				<div class="css_clear css_spacing"></div>


				<h3>Example</h3>
				<div class="full_width">
<table cellpadding="0" cellspacing="0" border="0" class="display" id="example" style="width:980px">
	<thead>
		<tr>
			<th>Rendering engine</th>
			<th>Browser</th>
			<th>Platform(s)</th>
			<th>Engine version</th>
			<th>CSS grade</th>
		</tr>
	</thead>
	<tbody>
		<tr class="gradeX">
			<td>Trident</td>
			<td>Internet
				 Explorer 4.0</td>
			<td>Win 95+</td>
			<td class="center">4</td>
			<td class="center">X</td>
		</tr>
		<tr class="gradeC">
			<td>Trident</td>
			<td>Internet
				 Explorer 5.0</td>
			<td>Win 95+</td>
			<td class="center">5</td>
			<td class="center">C</td>
		</tr>
		<tr class="gradeA">
			<td>Trident</td>
			<td>Internet
				 Explorer 5.5</td>
			<td>Win 95+</td>
			<td class="center">5.5</td>
			<td class="center">A</td>
		</tr>
		<tr class="gradeA">
			<td>Trident</td>
			<td>Internet
				 Explorer 6</td>
			<td>Win 98+</td>
			<td class="center">6</td>
			<td class="center">A</td>
		</tr>
		<tr class="gradeA">
			<td>Trident</td>
			<td>Internet Explorer 7</td>
			<td>Win XP SP2+</td>
			<td class="center">7</td>
			<td class="center">A</td>
		</tr>
		<tr class="gradeA">
			<td>Trident</td>
			<td>AOL browser (AOL desktop)</td>
			<td>Win XP</td>
			<td class="center">6</td>
			<td class="center">A</td>
		</tr>
		<tr class="gradeA">
			<td>Gecko</td>
			<td>Firefox 1.0</td>
			<td>Win 98+ / OSX.2+</td>
			<td class="center">1.7</td>
			<td class="center">A</td>
		</tr>
		<tr class="gradeA">
			<td>Gecko</td>
			<td>Firefox 1.5</td>
			<td>Win 98+ / OSX.2+</td>
			<td class="center">1.8</td>
			<td class="center">A</td>
		</tr>
		<tr class="gradeA">
			<td>Gecko</td>
			<td>Firefox 2.0</td>
			<td>Win 98+ / OSX.2+</td>
			<td class="center">1.8</td>
			<td class="center">A</td>
		</tr>
		<tr class="gradeA">
			<td>Gecko</td>
			<td>Firefox 3.0</td>
			<td>Win 2k+ / OSX.3+</td>
			<td class="center">1.9</td>
			<td class="center">A</td>
		</tr>
		<tr class="gradeA">
			<td>Gecko</td>
			<td>Camino 1.0</td>
			<td>OSX.2+</td>
			<td class="center">1.8</td>
			<td class="center">A</td>
		</tr>
		<tr class="gradeA">
			<td>Gecko</td>
			<td>Camino 1.5</td>
			<td>OSX.3+</td>
			<td class="center">1.8</td>
			<td class="center">A</td>
		</tr>
		<tr class="gradeA">
			<td>Gecko</td>
			<td>Netscape 7.2</td>
			<td>Win 95+ / Mac OS 8.6-9.2</td>
			<td class="center">1.7</td>
			<td class="center">A</td>
		</tr>
		<tr class="gradeA">
			<td>Gecko</td>
			<td>Netscape Browser 8</td>
			<td>Win 98SE+</td>
			<td class="center">1.7</td>
			<td class="center">A</td>
		</tr>
		<tr class="gradeA">
			<td>Gecko</td>
			<td>Netscape Navigator 9</td>
			<td>Win 98+ / OSX.2+</td>
			<td class="center">1.8</td>
			<td class="center">A</td>
		</tr>
		<tr class="gradeA">
			<td>Gecko</td>
			<td>Mozilla 1.0</td>
			<td>Win 95+ / OSX.1+</td>
			<td class="center">1</td>
			<td class="center">A</td>
		</tr>
		<tr class="gradeA">
			<td>Gecko</td>
			<td>Mozilla 1.1</td>
			<td>Win 95+ / OSX.1+</td>
			<td class="center">1.1</td>
			<td class="center">A</td>
		</tr>
		<tr class="gradeA">
			<td>Gecko</td>
			<td>Mozilla 1.2</td>
			<td>Win 95+ / OSX.1+</td>
			<td class="center">1.2</td>
			<td class="center">A</td>
		</tr>
		<tr class="gradeA">
			<td>Gecko</td>
			<td>Mozilla 1.3</td>
			<td>Win 95+ / OSX.1+</td>
			<td class="center">1.3</td>
			<td class="center">A</td>
		</tr>
		<tr class="gradeA">
			<td>Gecko</td>
			<td>Mozilla 1.4</td>
			<td>Win 95+ / OSX.1+</td>
			<td class="center">1.4</td>
			<td class="center">A</td>
		</tr>
		<tr class="gradeA">
			<td>Gecko</td>
			<td>Mozilla 1.5</td>
			<td>Win 95+ / OSX.1+</td>
			<td class="center">1.5</td>
			<td class="center">A</td>
		</tr>
		<tr class="gradeA">
			<td>Gecko</td>
			<td>Mozilla 1.6</td>
			<td>Win 95+ / OSX.1+</td>
			<td class="center">1.6</td>
			<td class="center">A</td>
		</tr>
		<tr class="gradeA">
			<td>Gecko</td>
			<td>Mozilla 1.7</td>
			<td>Win 98+ / OSX.1+</td>
			<td class="center">1.7</td>
			<td class="center">A</td>
		</tr>
		<tr class="gradeA">
			<td>Gecko</td>
			<td>Mozilla 1.8</td>
			<td>Win 98+ / OSX.1+</td>
			<td class="center">1.8</td>
			<td class="center">A</td>
		</tr>
		<tr class="gradeA">
			<td>Gecko</td>
			<td>Seamonkey 1.1</td>
			<td>Win 98+ / OSX.2+</td>
			<td class="center">1.8</td>
			<td class="center">A</td>
		</tr>
		<tr class="gradeA">
			<td>Gecko</td>
			<td>Epiphany 2.20</td>
			<td>Gnome</td>
			<td class="center">1.8</td>
			<td class="center">A</td>
		</tr>
		<tr class="gradeA">
			<td>Webkit</td>
			<td>Safari 1.2</td>
			<td>OSX.3</td>
			<td class="center">125.5</td>
			<td class="center">A</td>
		</tr>
		<tr class="gradeA">
			<td>Webkit</td>
			<td>Safari 1.3</td>
			<td>OSX.3</td>
			<td class="center">312.8</td>
			<td class="center">A</td>
		</tr>
		<tr class="gradeA">
			<td>Webkit</td>
			<td>Safari 2.0</td>
			<td>OSX.4+</td>
			<td class="center">419.3</td>
			<td class="center">A</td>
		</tr>
		<tr class="gradeA">
			<td>Webkit</td>
			<td>Safari 3.0</td>
			<td>OSX.4+</td>
			<td class="center">522.1</td>
			<td class="center">A</td>
		</tr>
		<tr class="gradeA">
			<td>Webkit</td>
			<td>Google Chrome 1.0</td>
			<td>Win XP+</td>
			<td class="center">525</td>
			<td class="center">A</td>
		</tr>
		<tr class="gradeA">
			<td>Webkit</td>
			<td>OmniWeb 5.5</td>
			<td>OSX.4+</td>
			<td class="center">420</td>
			<td class="center">A</td>
		</tr>
		<tr class="gradeA">
			<td>Webkit</td>
			<td>iPod Touch / iPhone</td>
			<td>iPod</td>
			<td class="center">420.1</td>
			<td class="center">A</td>
		</tr>
		<tr class="gradeA">
			<td>Webkit</td>
			<td>S60</td>
			<td>S60</td>
			<td class="center">413</td>
			<td class="center">A</td>
		</tr>
		<tr class="gradeA">
			<td>Presto</td>
			<td>Opera 7.0</td>
			<td>Win 95+ / OSX.1+</td>
			<td class="center">-</td>
			<td class="center">A</td>
		</tr>
		<tr class="gradeA">
			<td>Presto</td>
			<td>Opera 7.5</td>
			<td>Win 95+ / OSX.2+</td>
			<td class="center">-</td>
			<td class="center">A</td>
		</tr>
		<tr class="gradeA">
			<td>Presto</td>
			<td>Opera 8.0</td>
			<td>Win 95+ / OSX.2+</td>
			<td class="center">-</td>
			<td class="center">A</td>
		</tr>
		<tr class="gradeA">
			<td>Presto</td>
			<td>Opera 8.5</td>
			<td>Win 95+ / OSX.2+</td>
			<td class="center">-</td>
			<td class="center">A</td>
		</tr>
		<tr class="gradeA">
			<td>Presto</td>
			<td>Opera 9.0</td>
			<td>Win 95+ / OSX.3+</td>
			<td class="center">-</td>
			<td class="center">A</td>
		</tr>
		<tr class="gradeA">
			<td>Presto</td>
			<td>Opera 9.2</td>
			<td>Win 88+ / OSX.3+</td>
			<td class="center">-</td>
			<td class="center">A</td>
		</tr>
		<tr class="gradeA">
			<td>Presto</td>
			<td>Opera 9.5</td>
			<td>Win 88+ / OSX.3+</td>
			<td class="center">-</td>
			<td class="center">A</td>
		</tr>
		<tr class="gradeA">
			<td>Presto</td>
			<td>Opera for Wii</td>
			<td>Wii</td>
			<td class="center">-</td>
			<td class="center">A</td>
		</tr>
		<tr class="gradeA">
			<td>Presto</td>
			<td>Nokia N800</td>
			<td>N800</td>
			<td class="center">-</td>
			<td class="center">A</td>
		</tr>
		<tr class="gradeA">
			<td>Presto</td>
			<td>Nintendo DS browser</td>
			<td>Nintendo DS</td>
			<td class="center">8.5</td>
			<td class="center">C/A<sup>1</sup></td>
		</tr>
		<tr class="gradeC">
			<td>KHTML</td>
			<td>Konqureror 3.1</td>
			<td>KDE 3.1</td>
			<td class="center">3.1</td>
			<td class="center">C</td>
		</tr>
		<tr class="gradeA">
			<td>KHTML</td>
			<td>Konqureror 3.3</td>
			<td>KDE 3.3</td>
			<td class="center">3.3</td>
			<td class="center">A</td>
		</tr>
		<tr class="gradeA">
			<td>KHTML</td>
			<td>Konqureror 3.5</td>
			<td>KDE 3.5</td>
			<td class="center">3.5</td>
			<td class="center">A</td>
		</tr>
		<tr class="gradeX">
			<td>Tasman</td>
			<td>Internet Explorer 4.5</td>
			<td>Mac OS 8-9</td>
			<td class="center">-</td>
			<td class="center">X</td>
		</tr>
		<tr class="gradeC">
			<td>Tasman</td>
			<td>Internet Explorer 5.1</td>
			<td>Mac OS 7.6-9</td>
			<td class="center">1</td>
			<td class="center">C</td>
		</tr>
		<tr class="gradeC">
			<td>Tasman</td>
			<td>Internet Explorer 5.2</td>
			<td>Mac OS 8-X</td>
			<td class="center">1</td>
			<td class="center">C</td>
		</tr>
		<tr class="gradeA">
			<td>Misc</td>
			<td>NetFront 3.1</td>
			<td>Embedded devices</td>
			<td class="center">-</td>
			<td class="center">C</td>
		</tr>
		<tr class="gradeA">
			<td>Misc</td>
			<td>NetFront 3.4</td>
			<td>Embedded devices</td>
			<td class="center">-</td>
			<td class="center">A</td>
		</tr>
		<tr class="gradeX">
			<td>Misc</td>
			<td>Dillo 0.8</td>
			<td>Embedded devices</td>
			<td class="center">-</td>
			<td class="center">X</td>
		</tr>
		<tr class="gradeX">
			<td>Misc</td>
			<td>Links</td>
			<td>Text only</td>
			<td class="center">-</td>
			<td class="center">X</td>
		</tr>
		<tr class="gradeX">
			<td>Misc</td>
			<td>Lynx</td>
			<td>Text only</td>
			<td class="center">-</td>
			<td class="center">X</td>
		</tr>
		<tr class="gradeC">
			<td>Misc</td>
			<td>IE Mobile</td>
			<td>Windows Mobile 6</td>
			<td class="center">-</td>
			<td class="center">C</td>
		</tr>
		<tr class="gradeC">
			<td>Misc</td>
			<td>PSP browser</td>
			<td>PSP</td>
			<td class="center">-</td>
			<td class="center">C</td>
		</tr>
		<tr class="gradeU">
			<td>Other browsers</td>
			<td>All others</td>
			<td>-</td>
			<td class="center">-</td>
			<td class="center">U</td>
		</tr>
	</tbody>
</table>
				</div>
				
			</div>
			<div class="css_clear"></div>
			
						<div id="fw_footer">
				<div class="css_center">
					DataTables designed and created by <a href="http://www.sprymedia.co.uk">SpryMedia</a> &copy; 2008-2014<br>
					DataTables is dual licensed under the <a href="/license_gpl2">GPL v2 license</a> or a <a href="/license_bsd">BSD (3-point) license</a>.
				</div>
			</div>

<script type="text/javascript">
  var _gaq = _gaq || [];
  _gaq.push(['_setAccount', 'UA-365466-5']);
  _gaq.push(['_trackPageview']);

  (function() {
    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
  })();
</script>

		</div>
		
	</body>
</html>