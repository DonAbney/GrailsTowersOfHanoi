<ul>
    <g:each var="tower" in="${towers}" status="towerIndex">
    <li>T${towerIndex}
    	<ul>
    		<g:each var="ring" in="${tower.rings}" status="ringIndex">
    		<li class="ring ring${ringIndex}">R${ringIndex}</li>
    		</g:each>
    	</ul>
    </li>
    </g:each>
</ul>
