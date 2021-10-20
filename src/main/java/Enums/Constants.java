package Enums;

public enum Constants {
    REQUEST_BODY("<?xml version=\"1.0\"?>\n" +
            "<!DOCTYPE svc_init SYSTEM \"MLP_SVC_INIT_320.DTD\">\n" +
            "<svc_init ver=\"3.2.0\">\n" +
            "    <hdr ver=\"3.2.0\">\n" +
            "        <client>\n" +
            "            <id>msz_client4</id>\n" +
            "            <pwd>msz_client_4</pwd>\n" +
            "        </client>\n" +
            "    </hdr>\n" +
            "    <slir ver=\"3.2.0\">\n" +
            "        <msids>\n" +
            "            <msid type=\"MSISDN\">11111111111</msid>\n" +
            "             <msid type=\"MSISDN\">11111111101</msid>\n" +
            "            \n" +
            "        </msids>\n" +
            "        <eqop>\n" +
            "            <resp_req type=\"DELAY_TOL\"></resp_req>\n" +
            "            <resp_timer>98</resp_timer>\n" +
            "            <hor_acc qos_class=\"BEST_EFFORT\">999</hor_acc>\n" +
            "            <alt_acc>999</alt_acc>\n" +
            "        </eqop>\n" +
            "    <geo_info> \n" +
            " <CoordinateReferenceSystem> \n" +
            " <Identifier>\n" +
            "<code>4326</code> \n" +
            " <codeSpace>EPSG</codeSpace> \n" +
            "\n" +
            " </Identifier> \n" +
            " </CoordinateReferenceSystem> \n" +
            " </geo_info>\n" +
            "        <loc_type type=\"CURRENT\"></loc_type>\n" +
            "        <prio type=\"NORMAL\"></prio>\n" +
            "    </slir>\n" +
            "</svc_init>"),
    REQUEST_BODY_INVALID_MSDIN("<?xml version=\"1.0\"?>\n" +
            "<!DOCTYPE svc_init SYSTEM \"MLP_SVC_INIT_320.DTD\">\n" +
            "<svc_init ver=\"3.2.0\">\n" +
            "    <hdr ver=\"3.2.0\">\n" +
            "        <client>\n" +
            "            <id>msz_client15</id>\n" +
            "            <pwd>msz_client_15</pwd>\n" +
            "        </client>\n" +
            "    </hdr>\n" +
            "    <slir ver=\"3.2.0\">\n" +
            "        <msids>\n" +
            "            <msid type=\"MSISDN\">11111111111</msid>\n" +
            "             <msid type=\"MSISDN\">11111111101</msid>\n" +
            "            \n" +
            "        </msids>\n" +
            "        <eqop>\n" +
            "            <resp_req type=\"DELAY_TOL\"></resp_req>\n" +
            "            <resp_timer>98</resp_timer>\n" +
            "            <hor_acc qos_class=\"BEST_EFFORT\">999</hor_acc>\n" +
            "            <alt_acc>999</alt_acc>\n" +
            "        </eqop>\n" +
            "    <geo_info> \n" +
            " <CoordinateReferenceSystem> \n" +
            " <Identifier>\n" +
            "<code>4326</code> \n" +
            " <codeSpace>EPSG</codeSpace> \n" +
            "\n" +
            " </Identifier> \n" +
            " </CoordinateReferenceSystem> \n" +
            " </geo_info>\n" +
            "        <loc_type type=\"CURRENT\"></loc_type>\n" +
            "        <prio type=\"NORMAL\"></prio>\n" +
            "    </slir>\n" +
            "</svc_init>"),
     REQUEST_BODY_INVALID_CLIENT("<?xml version=\"1.0\"?>\n" +
             "<!DOCTYPE svc_init SYSTEM \"MLP_SVC_INIT_320.DTD\">\n" +
             "<svc_init ver=\"3.2.0\">\n" +
             "    <hdr ver=\"3.2.0\">\n" +
             "        <client>\n" +
             "            <id>msz_client15</id>\n" +
             "            <pwd>msz_client_15</pwd>\n" +
             "        </client>\n" +
             "    </hdr>\n" +
             "    <slir ver=\"3.2.0\">\n" +
             "        <msids>\n" +
             "            <msid type=\"MSISDN\">11111111111</msid>\n" +
             "             <msid type=\"MSISDN\">11111111101</msid>\n" +
             "            \n" +
             "        </msids>\n" +
             "        <eqop>\n" +
             "            <resp_req type=\"DELAY_TOL\"></resp_req>\n" +
             "            <resp_timer>98</resp_timer>\n" +
             "            <hor_acc qos_class=\"BEST_EFFORT\">999</hor_acc>\n" +
             "            <alt_acc>999</alt_acc>\n" +
             "        </eqop>\n" +
             "    <geo_info> \n" +
             " <CoordinateReferenceSystem> \n" +
             " <Identifier>\n" +
             "<code>4326</code> \n" +
             " <codeSpace>EPSG</codeSpace> \n" +
             "\n" +
             " </Identifier> \n" +
             " </CoordinateReferenceSystem> \n" +
             " </geo_info>\n" +
             "        <loc_type type=\"CURRENT\"></loc_type>\n" +
             "        <prio type=\"NORMAL\"></prio>\n" +
             "    </slir>\n" +
             "</svc_init>"),
    API_URL("http://108.227.43.50:9210");

    public String value;

    Constants(String value){
        this.value=value;
    }
}
