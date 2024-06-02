package org.xtext.generator

class Utils {
	static def Policy(){
		'''<template><name>Policy</name>
		<declaration>int x;
/*
0=null
1=loadL
2=loadR
3=offload
4=migrate
5=back
6=restore
7=disposeL
8=disposeR
*/</declaration>
<location id="id15" x="0" y="128"><committed/></location><location id="id16" x="0" y="0"/><init ref="id16"/><transition><source ref="id15"/><target ref="id16"/><label kind="guard" x="16" y="-352">operation[x]!=0 and operation[x]==5</label><label kind="synchronisation" x="32" y="-328">disposeR[x]!</label><label kind="assignment" x="32" y="-304">operation[x]=8</label><nail x="200" y="-280"/><nail x="8" y="-304"/></transition><transition><source ref="id15"/><target ref="id16"/><label kind="guard" x="-288" y="352">operation[x]!=0 and operation[x]==3</label><label kind="synchronisation" x="-280" y="368">disposeL[x]!</label><label kind="assignment" x="-288" y="384">operation[x]=7</label><nail x="-128" y="408"/><nail x="-248" y="344"/></transition><transition><source ref="id15"/><target ref="id16"/><label kind="guard" x="-768" y="-24">operation[x]==0</label><label kind="synchronisation" x="-704" y="40">loadL[x]!</label><label kind="assignment" x="-688" y="0">operation[x]=1</label><nail x="-640" y="120"/><nail x="-632" y="-40"/></transition><transition><source ref="id15"/><target ref="id16"/><label kind="guard" x="488" y="16">operation[x]==0 and Info[x].isOffloadable==true</label><label kind="synchronisation" x="608" y="40">loadR[x]!</label><label kind="assignment" x="560" y="64">operation[x]=2</label><nail x="608" y="128"/><nail x="600" y="-16"/></transition><transition><source ref="id15"/><target ref="id16"/><label kind="guard" x="256" y="232">operation[x]!=0 and (operation[x]==2 or operation[x]==3 or operation[x]==4 or operation[x]==7)</label><label kind="synchronisation" x="320" y="264">restore[x]!</label><label kind="assignment" x="312" y="288">operation[x]=6</label><nail x="360" y="344"/><nail x="360" y="208"/></transition><transition><source ref="id15"/><target ref="id16"/><label kind="guard" x="-976" y="256">operation[x]!=0 and (operation[x]==2 or operation[x]==3 or operation[x]==4 or operation[x]==7)</label><label kind="synchronisation" x="-480" y="296">back[x]!</label><label kind="assignment" x="-504" y="320">operation[x]=5</label><nail x="-456" y="376"/><nail x="-448" y="224"/></transition><transition><source ref="id15"/><target ref="id16"/><label kind="guard" x="208" y="-136">Info[x].isOffloadable==true and operation[x]!=0 and (operation[x]==1 or operation[x]==5 or operation[x]==6 or operation[x]==8)</label><label kind="synchronisation" x="296" y="-192">migrate[x]!</label><label kind="assignment" x="288" y="-176">operation[x]=4</label><nail x="336" y="-120"/><nail x="336" y="-248"/></transition><transition><source ref="id15"/><target ref="id16"/><label kind="guard" x="-768" y="-208">Info[x].isOffloadable==true and operation[x]!=0 and (operation[x]==1 or operation[x]==5 or operation[x]==6 or operation[x]==8)</label><label kind="synchronisation" x="-344" y="-192">offload[x]!</label><label kind="assignment" x="-352" y="-176">operation[x]=3</label><nail x="-296" y="-152"/><nail x="-296" y="-288"/></transition><transition><source ref="id16"/><target ref="id15"/><label kind="select" x="-56" y="32">e : id_t</label><label kind="guard" x="-104" y="16">(fragmentToCompute!=e or instructionsNumber[e]>0)and p==true</label><label kind="synchronisation" x="-56" y="48">policy[e]?</label><label kind="assignment" x="-40" y="80">x=e, p=false</label></transition></template>
	
	'''
	}
}