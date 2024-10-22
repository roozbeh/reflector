// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package PMRef;


interface Constants
{

    public static final String VERSIONNO = "1.9.14 ";
    public static final String VERSIONDATE = "(2006/06/03 13:59:17 JST)";
    public static final String VERSIONNAME = "Poor Man's Reflector ";
    public static final String VERSIONSTR = "Poor Man's Reflector v1.9.14 (2006/06/03 13:59:17 JST)";
    public static final long TIMERINTERRUPT = 1000L;
    public static final int USHORT_MAX_VALUE = 65535;
    public static final int MAXMAXSEND = 65535;
    public static final int MAXMINSEND = 20;
    public static final int MAXMAXRECV = 65535;
    public static final int MAXMINRECV = 20;
    public static final short MAXTIMELIMIT = 32767;
    public static final short CONFNOTEXISTS = -1;
    public static final String IPMASQNEVER = "Never";
    public static final String IPMASQPRIVATE = "PrivateOnly";
    public static final String IPMASQALL = "All";
    public static final int AUXDATATYPEOFF = 12;
    public static final long AUXDATATALK = 0x4355746bL;
    public static final int AUXDATASTATUSOFF = 8;
    public static final String DEFLOCKNAME = ".pmref.lock";
    public static final int CONFMENUHDRLEN = 8;
    public static final int CONFMENUCODEOFF = 0;
    public static final int CONFMENULENOFF = 4;
    public static final int CONFMENUHELLO = 2;
    public static final int CONFMENUHELLODENY = 3;
    public static final int CONFMENUHELLOREPLY = 4;
    public static final int CONFMENUCLOSE = 5;
    public static final int CONFMENUSENDOLD = 6;
    public static final int CONFMENUDATA = 7;
    public static final int CONFMENUSEND = 9;
    public static final int CONFMENUEND = 24;
    public static final int CONFMENUSENDEXT = 25;
    public static final int CONFMENUUNKNOWN1 = 35;
    public static final int CONFMENUOPEN = 48;
    public static final int CONFMENUUNKNOWN2 = 52;
    public static final int REFMONIBUFFLEN = 4;
    public static final int REFMONATTBLEN = 10;
    public static final int REFMONLOGGERLEN = 8;
    public static final int REFMONCODEOFF = 0;
    public static final int REFMONLENOFF = 2;
    public static final int REFMONATTBCODEOFF = 4;
    public static final int REFMONATTBCONFOFF = 6;
    public static final int REFMONATTBVALUEOFF = 8;
    public static final int REFMONLOGGERPORTOFF = 4;
    public static final long SECSFORMIN = 60L;
    public static final long SECSFORHOUR = 3600L;
    public static final long SECSFORDAY = 0x15180L;
    public static final short REFMONVERSION = 1;
    public static final short REFMONWHO = 2;
    public static final short REFMONTERM = 3;
    public static final short REFMONPARAM = 4;
    public static final short REFMONMAVEN = 5;
    public static final short REFMONUPTIME = 6;
    public static final short REFMONKILL = 7;
    public static final short REFMONDENY = 8;
    public static final short REFMONALLOW = 9;
    public static final short REFMONDUMP = 10;
    public static final short REFMONMSG = 256;
    public static final short REFMONALLMSG = 257;
    public static final short REFMONRESTART = 258;
    public static final short REFMONPROXYLIST = 259;
    public static final short REFMONPROXYSET = 260;
    public static final short REFMONPROXYDEL = 261;
    public static final short REFMONPROXYUSERSET = 262;
    public static final short REFMONPROXYUSERDEL = 263;
    public static final short REFMONPENALTYBOX = 264;
    public static final short REFMONREFATTBGET = 265;
    public static final short REFMONREFATTBSET = 266;
    public static final short REFMONCONFATTBGET = 267;
    public static final short REFMONCONFATTBSET = 268;
    public static final short REFMONLOGGER = 269;
    public static final short REFMONSUBCONF = 0;
    public static final short REFMONSUBMAXPARTS = 1;
    public static final short REFMONSUBMAXSENDERS = 2;
    public static final short REFMONSUBMAXLURKERS = 3;
    public static final short REFMONSUBMAXMAXSEND = 4;
    public static final short REFMONSUBMAXMINSEND = 5;
    public static final short REFMONSUBMAXMAXRECV = 6;
    public static final short REFMONSUBMAXMINRECV = 7;
    public static final short REFMONSUBTIMELIMIT = 8;
    public static final short REFMONSUBPRIVATECONF = 9;
    public static final short REFMONSUBRECVONLY = 10;
    public static final short REFMONSUBALLOWAUDIO = 11;
    public static final short REFMONSUBALLOWCHAT = 12;
    public static final short REFMONSUBNOGEEK = 13;
    public static final short REFMONSUBFIXWPKANJI = 14;
    public static final short REFMONSUBPASSDIFFCLR = 15;
    public static final String REFMONNOTYET = "Not Yet Supported.";
    public static final String REFMONUNKNOWN = "Unknown Command.";
    public static final String ALLOWDENYDELETE = "-d";
    public static final String ALLOWDENYNOADDR = "No Addresses\n";
    public static final int MAXRECDATALEN = 8192;
    public static final long PROXYSLOWDOWN = 10L;
    public static final int PROXYIDLE = 0;
    public static final int PROXYOPENING = 1;
    public static final int PROXYINSESSION = 2;
    public static final int PROXYCLOSING = 3;
    public static final int LOGFLUSHCOUNT = 300;
    public static final byte PMREFPEER = 85;
    public static final String WINVERSION1 = "Windows (32-bit)";
    public static final String WINVERSION2 = "Windows (3.2-bit)";
    public static final String WINVERSION3 = "Win32, v32X";
    public static final byte WINVERSION1BYTES[] = "Windows (32-bit)".getBytes();
    public static final byte WINVERSION2BYTES[] = "Windows (3.2-bit)".getBytes();
    public static final byte WINVERSION3BYTES[] = "Win32, v32X".getBytes();
    public static final String MODOKI1 = "Mac Modokintosh ";
    public static final String MODOKI2 = "Mac Modokintosh  ";
    public static final String MODOKI3 = "Mac ModokiX";
    public static final byte MODOKI1BYTES[] = "Mac Modokintosh ".getBytes();
    public static final byte MODOKI2BYTES[] = "Mac Modokintosh  ".getBytes();
    public static final byte MODOKI3BYTES[] = "Mac ModokiX".getBytes();
    public static final int BITS = 8;
    public static final int SPECIALBYTEPOS = 5;
    public static final int ADDRMARK_A = -120;
    public static final int BASELEN = 32;
    public static final int BASEMINILEN = 8;
    public static final String PROPFILE = "pmref.properties";
    public static final String PROPGCSEC = "pmref.gc";
    public static final String DEFGCSEC = "0";
    public static final String PROPTHREADSEND = "pmref.threadsend";
    public static final String DEFTHREADSEND = "true";
    public static final String PROPHOSTADDRESS = "reflector.address";
    public static final String DEFHOSTADDRESS = "";
    public static final String PROPVIRTUALADDRESS = "reflector.virtual.address";
    public static final String PROPMAXVIRTUALADDRESS = "reflector.max.virtual.address.msg";
    public static final String DEFMAXVIRTUALADDRESS = "The virtual address table is full.  Please Contact the reflector administrator.";
    public static final String DEFVIRTUALADDRESS = "127.0.0.0/24";
    public static final String PROPCONFNUMS = "reflector.conferences";
    public static final String DEFCONFNUMS = "0";
    public static final String PROPDELIMITTER = ",";
    public static final String PROPPENALTYMSG = "reflector.inpenalty.msg";
    public static final String DEFPENALTYMSG = "You're in the Penalty Box. Try later.";
    public static final String PROPNOCONFMSG = "reflector.conference.notexists.msg";
    public static final String DEFNOCONFMSG = "The conference which you request does not exsist.";
    public static final String PROPNOCONFPENALTY = "reflector.conference.notexists.penalty";
    public static final String DEFNOCONFPENALTY = "120";
    public static final String PROPTIMELIMIT = "reflector.timelimit";
    public static final String DEFTIMELIMIT = "0";
    public static final String PROPTIMELIMITPENALTY = "reflector.timelimit.penalty";
    public static final String DEFTIMELIMITPENALTY = "900";
    public static final String PROPTIMELIMITMSG = "reflector.timelimit.msg";
    public static final String DEFTIMELIMITMSG = "Connection time limit reached.";
    public static final String PROPIPMASQ = "reflector.allownat";
    public static final String DEFIPMASQ = "All";
    public static final String PROPDEFPRIVATE1 = "10.0.0.0/8";
    public static final String PROPDEFPRIVATE2 = "172.16.0.0/12";
    public static final String PROPDEFPRIVATE3 = "192.168.0.0/16";
    public static final String PROPDEFPRIVATE4 = "169.254.0.0/16";
    public static final String PROPLOGNAME = "reflector.logfile.name";
    public static final String DEFLOGNAME = "pmref.log";
    public static final String PROPLOGROTATE = "reflector.logfile.rotation";
    public static final String DEFLOGROTATE = "1";
    public static final String PROPLOGLIMIT = "reflector.logfile.limit";
    public static final String DEFLOGLIMIT = "50000";
    public static final String PROPLOGLEVEL = "reflector.logfile.level";
    public static final String DEFLOGLEVEL = "1";
    public static final String PROPREFMON = "reflector.refmon";
    public static final String DEFREFMON = "127.0.0.1";
    public static final String PROPALLOW = "reflector.allow";
    public static final String DEFALLOW = "";
    public static final String PROPADMIT = "reflector.admit";
    public static final String DEFADMIT = "";
    public static final String PROPADMITMSG = "reflector.admit.msg";
    public static final String DEFADMITMSG = "This is a private conference.";
    public static final String PROPDENY = "reflector.deny";
    public static final String DEFDENY = "";
    public static final String PROPDENYMSG = "reflector.deny.msg";
    public static final String DEFDENYMSG = "You're denied.";
    public static final String PROPPROXY = "reflector.proxy";
    public static final String DEFPROXY = "";
    public static final String PROPPARTICIPANTS = "reflector.max.participants";
    public static final String DEFPARTICIPANTS = "20";
    public static final String PROPPARTICIPANTSMSG = "reflector.max.participants.msg";
    public static final String DEFPARTICIPANTSMSG = "Maximum participants already active.  Try again later.";
    public static final String PROPCLOSEDMSG = "reflector.currently.closed.msg";
    public static final String DEFCLOSEDMSG = "Sorry, this reflector is currently closed.";
    public static final String PROPSENDERS = "reflector.max.senders";
    public static final String DEFSENDERS = "20";
    public static final String PROPSENDERSMSG = "reflector.max.senders.msg";
    public static final String DEFSENDERSMSG = "Maximum number of senders already active.  Try again later.";
    public static final String PROPLURKERS = "reflector.max.lurkers";
    public static final String DEFLURKERS = "20";
    public static final String PROPLURKERSMSG = "reflector.max.lurkers.msg";
    public static final String DEFLURKERSMSG = "Maximum number of lurkers already active.  Try again later.";
    public static final String PROPMOTD = "reflector.motd";
    public static final String DEFMOTD = "Welcome !!!\r\rEnjoy !!";
    public static final String PROPMAXMAXSEND = "reflector.max.max.send";
    public static final String DEFMAXMAXSEND = "40";
    public static final String PROPMAXMINSEND = "reflector.max.min.send";
    public static final String DEFMAXMINSEND = "10";
    public static final String PROPMAXMAXSENDMSG = "reflector.max.max.send.msg";
    public static final String DEFMAXMAXSENDMSG = "Your maximum transmission rate is too high, please lower it to ";
    public static final String PROPMAXMINSENDMSG = "reflector.max.min.send.msg";
    public static final String DEFMAXMINSENDMSG = "Your minimum transmission rate is too high, please lower it to ";
    public static final String PROPMAXMAXSENDPENALTY = "reflector.max.max.send.penalty";
    public static final String DEFMAXMAXSENDPENALTY = "0";
    public static final String PROPMAXMINSENDPENALTY = "reflector.max.min.send.penalty";
    public static final String DEFMAXMINSENDPENALTY = "0";
    public static final String PROPMAXMAXRECV = "reflector.max.max.recv";
    public static final String DEFMAXMAXRECV = "120";
    public static final String PROPMAXMINRECV = "reflector.max.min.recv";
    public static final String DEFMAXMINRECV = "20";
    public static final String PROPMAXMAXRECVMSG = "reflector.max.max.recv.msg";
    public static final String DEFMAXMAXRECVMSG = "Your maximum receive rate is too high, please lower it to ";
    public static final String PROPMAXMINRECVMSG = "reflector.max.min.recv.msg";
    public static final String DEFMAXMINRECVMSG = "Your minimum receive rate is too high, please lower it to ";
    public static final String PROPMAXMAXRECVPENALTY = "reflector.max.max.recv.penalty";
    public static final String DEFMAXMAXRECVPENALTY = "0";
    public static final String PROPMAXMINRECVPENALTY = "reflector.max.min.recv.penalty";
    public static final String DEFMAXMINRECVPENALTY = "0";
    public static final String PROPPROXYTABLE = "reflector.proxy.table";
    public static final String DEFPROXYADDR = "0.0.0.0";
    public static final String PROPPROXYINUSE = "reflector.proxy.inuse.msg";
    public static final String DEFPROXYINUSE = "The reflector being \"proxy\"ed is in use.  Try later.";
    public static final String PROPWPKANJI = "reflector.whitepine.kanji";
    public static final String DEFWPKANJI = "false";
    public static final String PROPVCHATEXT1 = "reflector.close.my.video";
    public static final String DEFVCHATEXT1 = "true";
    public static final String PROPDENYBOOTERS = "reflector.deny.booters";
    public static final String DEFDENYBOOTERS = "false";
    public static final String PROPCONFNAME = "conference.name-";
    public static final String DEFCONFNAME = "Conference No.";
    public static final String PROPCONFPEER = "conference.peers-";
    public static final String DEFCONFPEER = "";
    public static final String PROPCONFPRIVATE = "conference.private-";
    public static final String DEFCONFPRIVATE = "false";
    public static final String PROPCONFTIMELIMIT = "conference.timelimit-";
    public static final String PROPCONFTIMELIMITPENALTY = "conference.timelimit.penalty-";
    public static final String PROPCONFTIMELIMITMSG = "conference.timelimit.msg-";
    public static final String PROPCONFPASS = "conference.password-";
    public static final String DEFCONFPASS = "";
    public static final String PROPCONFPASSNOMSG = "conference.password.no.msg-";
    public static final String DEFCONFPASSNOMSG = "This conference requests you to send the password to join.";
    public static final String PROPCONFPASSINVMSG = "conference.password.invalid.msg-";
    public static final String DEFCONFPASSINVMSG = "Invalid password.";
    public static final String PROPCONFIPMASQ = "conference.allownat-";
    public static final String PROPCONFPARTICIPANTS = "conference.max.participants-";
    public static final String PROPCONFPARTICIPANTSMSG = "conference.max.participants.msg-";
    public static final String PROPCONFCLOSEDMSG = "conference.currently.closed.msg-";
    public static final String DEFCONFCLOSEDMSG = "Sorry, this conference is currently closed.";
    public static final String PROPCONFSENDERS = "conference.max.senders-";
    public static final String PROPCONFSENDERSMSG = "conference.max.senders.msg-";
    public static final String PROPCONFLURKERS = "conference.max.lurkers-";
    public static final String PROPCONFLURKERSMSG = "conference.max.lurkers.msg-";
    public static final String PROPALLOWAUDIO = "conference.allowaudio-";
    public static final String DEFALLOWAUDIO = "true";
    public static final String PROPRECVONLY = "conference.recvonly-";
    public static final String DEFRECVONLY = "false";
    public static final String PROPALLOWSELF = "conference.selfreflect-";
    public static final String DEFALLOWSELF = "false";
    public static final String PROPALLOWCHAT = "conference.allowchat-";
    public static final String DEFALLOWCHAT = "true";
    public static final String PROPNOCHATMSG = "conference.allowchat.msg-";
    public static final String DEFNOCHATMSG = "Chat is not allowed in this conference.\r\rThe message was not sent.";
    public static final String PROPNOGEEK = "conference.nogeek-";
    public static final String DEFNOGEEK = "false";
    public static final String PROPMONITOR = "conference.monitor-";
    public static final String DEFMONITOR = "false";
    public static final String PROPNOGEEKMSG = "conference.nogeek.msg-";
    public static final String DEFNOGEEKMSG = "Geeking is not allowed in this conference.\r\rThe message was not sent.";
    public static final String PROPCONFADMIT = "conference.admit-";
    public static final String DEFCONFADMIT = "";
    public static final String PROPCONFADMITMSG = "conference.admit.msg-";
    public static final String DEFCONFADMITMSG = "This is a private conference.";
    public static final String PROPCONFADMITSENDER = "conference.admit.sender-";
    public static final String DEFCONFADMITSENDER = "";
    public static final String PROPCONFALLOW = "conference.allow-";
    public static final String DEFCONFALLOW = "";
    public static final String PROPCONFDENY = "conference.deny-";
    public static final String DEFCONFDENY = "";
    public static final String PROPCONFDENYMSG = "conference.deny.msg-";
    public static final String DEFCONFDENYMSG = "You're denied.";
    public static final String PROPCONFMOTD = "conference.motd-";
    public static final String PROPCONFMAXMAXSEND = "conference.max.max.send-";
    public static final String PROPCONFMAXMAXSENDMSG = "conference.max.max.send.msg-";
    public static final String PROPCONFMAXMAXSENDPENALTY = "conference.max.max.send.penalty-";
    public static final String PROPCONFMAXMINSEND = "conference.max.min.send-";
    public static final String PROPCONFMAXMINSENDMSG = "conference.max.min.send.msg-";
    public static final String PROPCONFMAXMINSENDPENALTY = "conference.max.min.send.penalty-";
    public static final String PROPCONFMAXMAXRECV = "conference.max.max.recv-";
    public static final String PROPCONFMAXMAXRECVMSG = "conference.max.max.recv.msg-";
    public static final String PROPCONFMAXMAXRECVPENALTY = "conference.max.max.recv.penalty-";
    public static final String PROPCONFMAXMINRECV = "conference.max.min.recv-";
    public static final String PROPCONFMAXMINRECVMSG = "conference.max.min.recv.msg-";
    public static final String PROPCONFMAXMINRECVPENALTY = "conference.max.min.recv.penalty-";
    public static final String PROPCONFWPKANJI = "conference.whitepine.kanji-";
    public static final String PROPCONFVCHATEXT1 = "conference.close.my.video-";
    public static final String PROPCONFUSEWPPASS = "conference.use.whitepine.password-";
    public static final String DEFCONFWPPASS = "false";
    public static final String PROPCONFRETURNDIFF = "conference.returnpassdiff-";
    public static final String DEFCONFRETURNDIFF = "false";
    public static final String PROPCONFWPPASSDIFF = "conference.whitepine.encoded.password.string-";
    public static final String DEFCONFWPPASSDIFF = "";
    public static final short LOLEVELGINFO = 1;
    public static final short LOGLEVELSTATS = 2;
    public static final short LOGLEVELDEBUG = 3;
    public static final int UDPDATAPORT = 7648;
    public static final int TCPCONFMENUPORT = 7648;
    public static final int TCPREFMONPORT = 7649;
    public static final int CONFMENUBACKLOG = 10;
    public static final int REFMONBACKLOG = 10;
    public static final int MAXTCPRELAYLEN = 256;
    public static final int IPUDPLEN = 28;
    public static final int CUHDRLEN = 26;
    public static final int CUDSTFAMILYOFF = 0;
    public static final int CUDSTPORTOFF = 2;
    public static final int CUDSTADDROFF = 4;
    public static final int CUSRCFAMILYOFF = 8;
    public static final int CUSRCPORTOFF = 10;
    public static final int CUSRCADDROFF = 12;
    public static final int CUSEQOFF = 16;
    public static final int CUMSGOFF = 20;
    public static final int CUDATATYPEOFF = 22;
    public static final int CUPACKETLENGTHOFF = 24;
    public static final int CUCLIENTCOUNTOFF = 26;
    public static final int CURECVCAPOFF = 26;
    public static final int CUSENDCAPOFF = 26;
    public static final int CUOCSEQOFF = 28;
    public static final int INTRANETADDROFF = 30;
    public static final int INTERNETADDROFF = 34;
    public static final int CUNAMEOFF = 32;
    public static final int CUSENDFLAGOFF = 52;
    public static final int CURECVFLAGOFF = 53;
    public static final int CUFLAGOFF = 54;
    public static final int CUVERSIONOFF = 55;
    public static final short CUEXTSTART = 56;
    public static final int AUXSTATUSOFF = 8;
    public static final short CUDSTFAMILYALL = 0;
    public static final short CUDSTFAMILYEXACT = 1;
    public static final short CUDSTFAMILYEXAMINE = 2;
    public static final short CUSRCCLIENT = 1;
    public static final short CUSRCREFLECTOR = 2;
    public static final short CUCLIENTINFOLEN = 12;
    public static final short CUSVIDEO = 1;
    public static final short CUBVIDEO = 2;
    public static final short CUAUDIO = 3;
    public static final short CUOC = 101;
    public static final short CUDISCONNECT = 104;
    public static final short CUWELCOME = 105;
    public static final short CUREFLECTOR = 100;
    public static final short CURATECONTROL = 110;
    public static final short CURATEREPLY = 111;
    public static final short CU204 = 204;
    public static final short CUAUXCONTROL = 256;
    public static final short CUAUXDATA = 257;
    public static final short CUWPVIDEO1 = 200;
    public static final short CUWPVIDEO2 = -32568;
    public static final short CUPMREFOC = 21760;
    public static final short CUPMREFDATA = 21761;
    public static final short CUPMREFDENY = 21762;
    public static final short CUPMREFMSG = 21763;
    public static final short CUPMREFCONTROLADD = 21764;
    public static final short CUPMREFCONTROLREMOVE = 21765;
    public static final short CUPMREFOCSEARCH = 21766;
    public static final short CUMONITOROC = 613;
    public static final short CUMSGOPEN = 1;
    public static final short CUMSGCLOSE = 6;
    public static final short CUMSGVIDEOCONT = 0;
    public static final short CUMSGVIDEOEND = 20;
    public static final long OCTIMEOUT = 60L;
    public static final long PROXYTIMEOUT = 60L;
    public static final short CUEXTAUXDATA = 1;
    public static final short CUEXTOLDRATE = 2;
    public static final short CUEXTRATE = 3;
    public static final short CUEXTVERSION = 4;
    public static final short CUEXTAUDIO = 28;
    public static final short CUEXTRTP = 29;
    public static final short CUEXTWPCOLOR = 200;
    public static final short CUEXTWPPASSWORD = 201;
    public static final short CUEXTPMPASSWORD = 4297;
    public static final int CLIENTINFOLEN = 12;
    public static final long CLIENTINFOFLAGS = 0xb030000L;
    public static final int VIDEOMODEINIT = 0;
    public static final int VIDEOMODESEND = 1;
    public static final int VIDEOMODELURKER = 2;
    public static final short CUACCEPTCLOSE = 128;
    public static final short CUCLOSEVIDEO = 16;
    public static final int VIDEOCODECMJPEG = 0x4d4a5047;
    public static final int VIDEOCODECH263 = 0x5658314b;
    public static final int REFMSGRETRY = 3;
    public static final int DISMSGRETRY = 3;
    public static final int DATAOC = 1;
    public static final int DATAOCCLOSE = 2;
    public static final int DATAVIDEO = 3;
    public static final int DATAAUDIO = 4;
    public static final int DATAAUXCONTROL = 5;
    public static final int DATAAUXDATA = 6;
    public static final int DATARATECONTROL = 7;
    public static final int DATARATEREPLY = 8;
    public static final int DATATALK = 9;
    public static final int DATAPMREFOC = 10;
    public static final int DATAPMREFDATA = 11;
    public static final int DATAPMREFDENY = 12;
    public static final int DATAPMREFMSG = 13;
    public static final int DATAPMREFCONTROLADD = 14;
    public static final int DATAPMREFCONTROLREMOVE = 15;
    public static final int DATAWELCOME = 16;
    public static final int DATADISCONNECT = 17;
    public static final int DATAREFLECTOR = 18;
    public static final int DATA204 = 19;
    public static final int DATAMONITOROC = 20;
    public static final int DATAMONITOROCCLOSE = 21;
    public static final int DATAPMREFOCSEARCH = 22;
    public static final int DATAWPVIDEO = 23;
    public static final int DATAUNKNOWN = -1;
    public static final short PKTREFMSGHDRLEN = 4;
    public static final short PKTDISMSGHDRLEN = 3;
    public static final String THREADREFLECTOR = "Reflector";
    public static final String THREADTIMER = "Timer";
    public static final String THREADNETINTERFACE = "Netinterface";
    public static final String THREADREFMON = "Refmon";
    public static final String THREADREFMONCONNECTION = "RefmonConnection";
    public static final String THREADCONFMENU = "ConfMenu";
    public static final String THREADCONFMENUCONNECTION = "ConfMenuConnection";
    public static final String THREADCONFMENURELAY = "ConfMenuRelay";
    public static final String THREADCONFMENUTRANSFER = "ConfMenuTransfer";
    public static final String THREADDATAGRAM = "Datagram";
    public static final String THREADDATAGRAMPROXY = "DatagramProxy";
    public static final String THREADCUPACKET = "CUPacket";
    public static final int PRIORITYREFMONCON = 10;
    public static final int PRIORITYREFMON = 9;
    public static final int PRIORITYTIMER = 8;
    public static final int PRIORITYCUPACKET = 7;
    public static final int PRIORITYDATAGRAM = 6;
    public static final int PRIORITYREFLECTOR = 5;
    public static final int PRIORITYCONFMENUCON = 4;
    public static final int PRIORITYCONFMENU = 3;
    public static final int PENALTYNOCONF = 1;
    public static final int PENALTYMAXMAXSEND = 2;
    public static final int PENALTYMAXMINSEND = 3;
    public static final int PENALTYMAXMAXRECV = 4;
    public static final int PENALTYMAXMINRECV = 5;
    public static final int PENALTYTIMELIMIT = 6;
    public static final int PENALTYSPOOF = 7;
    public static final String ERRALREADYRUN = "\nThe lock file exists.\nPMRef is already running, or PMRef ended abnormally\nlast time.  Check whether PMRef is running.  If not,\nremove \".pmref.lock\" file in the same directory where\n\"PMRef.jar\" is in, and try again .\n";
    public static final String ERRFILENOTFOUND = "File Not Found : ";
    public static final String ERRNUMFORMAT = "Number Format Error : ";
    public static final String ERRFILEOPEN = "File Open  Error : ";
    public static final String ERRREPEATEDMSG = "The previous message repeated ";
    public static final String ERRSOCKET00 = "ServerSocket Error : The client socket error";
    public static final String ERRSOCKET01 = "ServerSocket Error : The \"Proxy\"ed ref may not be online";
    public static final String ERRSOCKET1 = "ServerSocket Error : Conference Menu disabled";
    public static final String ERRACCEPT1 = "ServerSocket Error : accept(ConfMenu)";
    public static final String ERRACCEPT2 = "ServerSocket Error : accept(RefMon)";
    public static final String ERRSOCKET2 = "ServerSocket Error : Refmon disabled";
    public static final String ERRGETSTREAM = "Get Stream Error";
    public static final String ERRCONFMENU = "IO Error : ConfMenuConnection";
    public static final String ERRREFMON = "IO Error : RefMonConnection";
    public static final String ERRADMIN = "Admin Address Error : ";
    public static final String ERRPRIVATE = "Private Address Error";
    public static final String ERRALLOW = "ALLOW Address Error : ";
    public static final String ERRADMIT = "ADMIT Address Error : ";
    public static final String ERRPROXY = "ADMIT Address Error : ";
    public static final String ERRADMITSENDER = "ADMIT SENDER Address Error : ";
    public static final String ERRDENY = "DENY Address Error : ";
    public static final String ERRPEER = "PEER Address Error : ";
    public static final String ERRDATASOCKET = "DataSocket Creation Error : The UDP port 7648 is being used. A CU Reflector/CU Client program is running.  Terminate it and try to run this again.";
    public static final String ERRDATASOCKRECV = "DataSocket Receive Error";
    public static final String ERRDATASOCKSEND = "DataSocket Send Error";
    public static final String ERRIPMASQ = "Address mismatch between IP and CU";
    public static final String ERRNOCONF = "Request non-existant conference";
    public static final String ERRDENIED = "DENIED from ";
    public static final String ERRADMITDENIED = "ADMIT DENIED from ";
    public static final String ERRLOGIN = "logs in from ";
    public static final String ERRLOGOUT = "logs out from ";
    public static final String ERRTIMELIMIT = "TIMELIMIT reached ";
    public static final String ERRLOGLIMIT = "LOGLIMIT reached, lotating and switching, see the newer log file from now on.";
    public static final String ERROCTIMEOUT = "OC PACKET TIMEOUT deleted ";
    public static final String ERRPROXYTIMEOUT = "TIMEOUT deleted";
    public static final String ERRMAXSENDDENIED = "exceeded max.max.send:";
    public static final String ERRMAXRECVDENIED = "exceeded max.max.recv:";
    public static final String ERRMINSENDDENIED = "exceeded max.min.send:";
    public static final String ERRMINRECVDENIED = "exceeded max.min.recv:";
    public static final String ERRPROP = "Proparties file Error : ";
    public static final String ERRDEFAULT = ", using the default value";
    public static final String ERRUSING = ", using this value";
    public static final String ERRINVALIDDATA = "Invalid data type arrived ";
    public static final String ERRGEEK = "GEEKS in Conference";
    public static final String ERRCHAT = "CHATS in Conference";
    public static final String ERRSPOOF = "Nickname spoofing is not allowed";
    public static final String ERRNOPASSWORD = "doesn't send a password from ";
    public static final String ERRINVPASSWORD = "sends an invalid password from ";
    public static final String ERRNOTALLOWPASSWORD = "doesn't allow to set a password from ";
    public static final String ERRGOTPASSDIFF = "gets a passdiff string from ";
    public static final String ERRPEERUP = "Peer reflector is up, ";
    public static final String ERRPEERDOWN = "Peer reflector is down, ";
    public static final String ERRUNKNOWNPEER = "Unknown Peer reflector, ";
    public static final String ERRPROXYENABLE = "Proxy Enabled";
    public static final String ERRPROXYDISABLE1 = "Proxy Disabled(Addresses not set)";
    public static final String ERRPROXYDISABLE2 = "Proxy Disabled(Addresses not correct)";
    public static final String ERRPROXYTABLE1 = "Proxy Table Overwritten(local address already exists)";
    public static final String ERRPROXYTABLE2 = "Proxy Table Error(address error)";
    public static final String ERRPROXYADD = "Proxy Table set ";
    public static final String ERRPROXYPACKET = "Proxy Packet Error";
    public static final String ERRPROXIEDPEER = "You can't set a peer reflector as a proxy ref";
    public static final String ERRHOSTADDR = "Using the address, ";
    public static final String ERRNOADDRESS = "reflector.address is not set, using the primary interface address, ";
    public static final String ERRUNKNOWNADDR = "Unkown Host Address";
    public static final String ERRREWRITE = "Re-write disconnect message from ";
    public static final String ERRWPPASS = "The whitepine.encoded.password.string is set temporarily from ";
    public static final String ERRWPPASSDIFF = "Encoded Password format error";
    public static final String ERRCANTRESTART = "PMRef can't RESTART on this condition, instead TERMinating";
    public static final String ERRVIRTUALADDR = "Virtual address mode ";
    public static final String ERRREALADDR = "Real address mode is not supported anymore";
    public static final String ERRLOGGERERR = "Logger send error";
    public static final String ERRPEERVIRTUAL = "PMRef requires virtual address mode to connect \"peer\" conferences, ingnoring ";
    public static final String ERRSHUTDOWN = "This reflector is going to shutdown. Thank you.";
    public static final String REFMSGIPMASQ = "The IP Addresses of IP Header and CU-SeeMe Header are different. ";
    public static final int ESCNORMAL = 0;
    public static final int ESCALREADYRUN = 1;
    public static final int ESCNUMFORMAT = 2;
    public static final int ESCFILENOTFOUND = 3;
    public static final int ESCEXCEPTION = 4;
    public static final int ESCFILEOPEN = 5;
    public static final int ESCMENUCONNECTION = 6;
    public static final int ESCGETSTREAM = 7;
    public static final int ESCDATASOCKET = 8;
    public static final int ESCERRADDR = 9;
    public static final int ESCJAVAVERSION = 255;

}
