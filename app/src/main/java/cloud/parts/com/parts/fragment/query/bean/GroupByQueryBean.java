package cloud.parts.com.parts.fragment.query.bean;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

/**
 * ===================================
 * describe:
 * date:2018/3/12
 * author:zhuang
 * ===================================
 */

public class GroupByQueryBean {

    /**
     * status : 0
     * errmsg :
     * dataDic : {"list":[{"group_name":"内外饰件组","group_id":"b1df6fd9-1ecf-46bd-ad25-080e0b243e31","subGroups":[{"sub_group_name":"顶棚、遮阳板","graphGroups":[{"graph_id":"5f67d724-e958-4534-82cd-fb703ac09673","graph_name":"F0-05013 顶棚、遮阳板"}],"sub_group_id":"109d0df8-7386-45b9-b7d8-6d89c90aad62"},{"sub_group_name":"通风盖板","graphGroups":[{"graph_id":"8d4dd70a-ec85-430d-9552-0090aa49f0f0","graph_name":"F0-05004 通风盖板"}],"sub_group_id":"10ce54e7-b30a-497b-96db-1aafff8723e6"},{"sub_group_name":"左前门护板","graphGroups":[{"graph_id":"ec0d4f03-c643-4857-b366-3f24306e7f02","graph_name":"F0-05007 左前门护板"}],"sub_group_id":"1b8554a4-6c61-4183-ab75-00797049148e"},{"sub_group_name":"仪表板","graphGroups":[{"graph_id":"7612d8eb-ed7d-48fd-bd79-e444d61bf65f","graph_name":"F0-05015 仪表板"},{"graph_id":"a0442c51-670f-4b7b-9002-04406b78a41f","graph_name":"F0-05014 仪表板"}],"sub_group_id":"3f73a954-492d-4fba-a637-8bd6eebf6daf"},{"sub_group_name":"地毯、前围隔热垫","graphGroups":[{"graph_id":"1e026de7-25d7-453d-8456-fbad6b3d36ee","graph_name":"F0-05012 地毯、前围隔热垫"}],"sub_group_id":"665420b2-1901-4426-a1b5-e857e6d714e8"},{"sub_group_name":"左后门护板","graphGroups":[{"graph_id":"c7b54f31-6e6a-4bf9-9ed6-fca1cce27cb8","graph_name":"F0-05009 左后门护板"}],"sub_group_id":"67cb97e8-8d66-4fd6-bb96-94fbafb5b46e"},{"sub_group_name":"侧围护板","graphGroups":[{"graph_id":"b3cdce8b-fc6d-4e2b-89cd-46c3dfa0cddf","graph_name":"F0-05006 侧围护板"}],"sub_group_id":"9c05e7af-1ab5-4b05-b06c-210af11e9388"},{"sub_group_name":"前保险杠","graphGroups":[{"graph_id":"e9ae9d93-d4f4-4a2c-b33d-7810d93eef78","graph_name":"F0-05001 前保险杠"}],"sub_group_id":"9c5afdac-f4d5-44f3-aa52-d60dd78ef3e6"},{"sub_group_name":"副仪表板","graphGroups":[{"graph_id":"81e21e52-1572-46d9-80f9-a1ca7bd94b5f","graph_name":"F0-05016 副仪表板"}],"sub_group_id":"b200441c-02de-4e70-b3c7-d2a0d44f942e"},{"sub_group_name":"右前门护板","graphGroups":[{"graph_id":"24cb88d8-d418-4741-aa2b-48836b9f0859","graph_name":"F0-05008 右前门护板"}],"sub_group_id":"bd491a9c-4e85-4adc-8c52-5530f27def04"},{"sub_group_name":"后保险杠","graphGroups":[{"graph_id":"188d9290-e975-44a9-811e-5b68cd595cd9","graph_name":"F0-05002 后保险杠"}],"sub_group_id":"bec6b799-39bc-48ee-ad4b-ce8612333d79"},{"sub_group_name":"挡泥板、钢轮装饰盖","graphGroups":[{"graph_id":"730e3dd3-012c-4099-9491-838823e3c5fc","graph_name":"F0-05003 挡泥板、钢轮装饰盖"}],"sub_group_id":"da3c1f1f-a037-44c4-9cd4-b82b1362b7d2"},{"sub_group_name":"行李箱、搁物架","graphGroups":[{"graph_id":"70acc31a-6a10-4fab-859a-cea432db72aa","graph_name":"F0-05011 行李箱、搁物架"}],"sub_group_id":"e427cc27-1a1f-4885-a241-15f534376729"},{"sub_group_name":"翼子板饰板","graphGroups":[{"graph_id":"33af88e3-8a12-43c6-9ef6-d61bd620185e","graph_name":"F0-05005 翼子板饰板"}],"sub_group_id":"fb56ca33-b7ab-46f1-90c3-0a1fbd611486"}]},{"group_name":"底盘组","group_id":"e6490698-7301-46bf-a8b9-4d0724d9fb99","subGroups":[{"sub_group_name":"前副车架、稳定杆、减振器","graphGroups":[{"graph_id":"f667754b-18da-4832-9a5e-49d7bdd5281c","graph_name":"F0-03001 前副车架、稳定杆、减振器"}],"sub_group_id":"117130d2-1d10-443f-b4c7-df63899060cc"},{"sub_group_name":"供油系统","graphGroups":[{"graph_id":"8010eeae-305e-4a39-8b21-e6396cafda1b","graph_name":"F0-03014 供油系统"}],"sub_group_id":"1cf0a187-54c4-4b71-81ae-44f3cd4d0ef3"},{"sub_group_name":"后减振器、扭转梁、随车工具","graphGroups":[{"graph_id":"ff27e5d6-a031-4ebc-9330-935f6d6e9cb1","graph_name":"F0-03002 后减振器、扭转梁、随车工具"}],"sub_group_id":"2c43d05e-6bd4-4d7d-99c7-28afe626a211"},{"sub_group_name":"后制动器总成","graphGroups":[{"graph_id":"b11551a5-82df-4cee-9f03-48e81c9a4501","graph_name":"F0-03008 后制动器总成"}],"sub_group_id":"45dba29f-2c23-4bb9-a66d-b90bf813305d"},{"sub_group_name":"前制动器总成","graphGroups":[{"graph_id":"2bc1c733-aace-49a3-afd4-36ad54a3402c","graph_name":"F0-03007 前制动器总成"}],"sub_group_id":"470c70d3-ac7e-4a44-9a36-2e83a10d086a"},{"sub_group_name":"加速传动系统","graphGroups":[{"graph_id":"90075d26-f148-488a-8926-8a6c0218675b","graph_name":"F0-03016 加速传动系统"}],"sub_group_id":"5f4d85a5-b0dd-4fa6-99ed-4b437f39e119"},{"sub_group_name":"悬置","graphGroups":[{"graph_id":"ce745451-a982-4db3-94de-efcb5c40e19f","graph_name":"F0-03017 悬置"}],"sub_group_id":"65f52138-b684-46e6-a3ec-95014fa3df56"},{"sub_group_name":"驻车机构","graphGroups":[{"graph_id":"cdf500bb-56d1-4452-91f5-a92c35814151","graph_name":"F0-03009 驻车机构"}],"sub_group_id":"7cb903df-af03-4483-a196-ee6f078d30a2"},{"sub_group_name":"燃油蒸发控制系统","graphGroups":[{"graph_id":"f2d0ebbb-261f-4ec5-a8ef-fa374759629f","graph_name":"F0-03015 燃油蒸发控制系统"}],"sub_group_id":"81de200b-09df-4bd0-bc9c-9f37d7bdee28"},{"sub_group_name":"传动半轴","graphGroups":[{"graph_id":"9949df7b-e9f6-446d-949c-ca636a2b4bf7","graph_name":"F0-03018 传动半轴"}],"sub_group_id":"857c605e-7a8e-4d81-bcb8-919a86e114e5"},{"sub_group_name":"制动系统、ABS","graphGroups":[{"graph_id":"f6c38ad3-f6d4-441c-8b89-f16b42c52913","graph_name":"F0-03010 制动系统、ABS"}],"sub_group_id":"86a79f12-9d71-48c9-9f6a-afa6b6519e5e"},{"sub_group_name":"冷却系统","graphGroups":[{"graph_id":"ef4cc9a5-1ec0-4072-b3d3-167049877592","graph_name":"F0-03012 冷却系统"}],"sub_group_id":"b2749679-93cf-4b2e-90b0-72886988c262"},{"sub_group_name":"比例阀","graphGroups":[{"graph_id":"2f6485cb-21f2-44fc-9e47-474ea04b5817","graph_name":"F0-03011 比例阀"}],"sub_group_id":"b8699adf-7294-423e-83fb-ee75e54738f4"},{"sub_group_name":"车轮系统","graphGroups":[{"graph_id":"0f62a177-dab8-4fda-85ee-01c0b50a52e4","graph_name":"F0-03003 车轮系统"}],"sub_group_id":"c415c494-5392-4f3c-a71b-bf5e582eec21"},{"sub_group_name":"换挡操纵机构","graphGroups":[{"graph_id":"a9387a2f-d0b1-47d7-9ed3-b19344496639","graph_name":"F0-03019 换挡操纵机构"}],"sub_group_id":"c92f8dbc-4056-4e82-bdb2-f8caaad263ea"},{"sub_group_name":"排气系统","graphGroups":[{"graph_id":"9bc10dab-d786-42f5-bd9e-0697961d12b9","graph_name":"F0-03013 排气系统"}],"sub_group_id":"e5d62f97-301e-41ed-acfd-7b157b4b918c"},{"sub_group_name":"转向系统","graphGroups":[{"graph_id":"62864634-e960-4382-acdc-c16f92abad22","graph_name":"F0-03005 转向系统"},{"graph_id":"bdf81fd0-d24f-4ad7-b3bb-ddf173702ae2","graph_name":"F0-03006 转向系统"}],"sub_group_id":"ef575cc1-0f0a-491a-af67-0732c4d09267"}]},{"group_name":"变速器组","group_id":"c780d81a-fc99-4b9d-bad3-d433d36aecb3","subGroups":[{"sub_group_name":"差速器组件","graphGroups":[{"graph_id":"ffd730ab-411d-4102-b346-bccad06936d6","graph_name":"F0-5T09006 差速器组件"}],"sub_group_id":"0d080b53-60b9-4000-b552-61575add517e"},{"sub_group_name":"换挡杆及换档拨叉","graphGroups":[{"graph_id":"4d80c0a2-3a61-40f2-83cd-8332b8a8575f","graph_name":"F0-5T09001 换挡杆及换档拨叉"}],"sub_group_id":"0ee5aa08-97c6-4603-ba19-06e6ee48f463"},{"sub_group_name":"油封、轴承及调整垫片","graphGroups":[{"graph_id":"8c518c6e-584d-4048-bc93-17e33602b867","graph_name":"F0-5T09005 油封、轴承及调整垫片"}],"sub_group_id":"3694694e-b554-4a9e-ab79-b4024d4dba17"},{"sub_group_name":"变速器总成","graphGroups":[{"graph_id":"c0ee663b-a25a-4d02-a6c8-ae387ca2dcde","graph_name":"F0-5T09012 变速器总成"}],"sub_group_id":"49a805be-c948-48d7-8398-9e5cbd9977bf"},{"sub_group_name":"主轴组件","graphGroups":[{"graph_id":"48ca36ce-39bc-4d12-baad-ad2e6d69d246","graph_name":"F0-5T09008 主轴组件"}],"sub_group_id":"49e54dde-2b76-4745-99e1-2c2dbc16b2b4"},{"sub_group_name":"换档总成及其外部零部件","graphGroups":[{"graph_id":"9a09aaea-cb92-4d0d-90c6-6f5421db4f3e","graph_name":"F0-5T09004 换档总成及其外部零部件"}],"sub_group_id":"8533bd88-b506-4d07-a04e-d72364fb584a"},{"sub_group_name":"离合器盖总成","graphGroups":[{"graph_id":"92997b40-e128-4ab1-8545-5811c0e74e75","graph_name":"F0-5T09009 离合器盖总成"}],"sub_group_id":"af6250d5-6670-4935-b110-f2bf92a24048"},{"sub_group_name":"换档杆组件","graphGroups":[{"graph_id":"1394b388-7676-4eab-a928-1e63897e8738","graph_name":"F0-5T09002 换档杆组件"}],"sub_group_id":"dcdded39-4a79-465b-bb1a-ab08ffb24066"},{"sub_group_name":"变速器附件","graphGroups":[{"graph_id":"193cd286-6c16-44f1-95f1-a9b2f7d35820","graph_name":"F0-5T09003 变速器附件"}],"sub_group_id":"de009dd5-e833-4823-ace7-c30f2be7da36"},{"sub_group_name":"副轴组件","graphGroups":[{"graph_id":"62802e91-3e74-4b03-9432-e7b1829ed40e","graph_name":"F0-5T09007 副轴组件"}],"sub_group_id":"e11c4787-b43f-4a09-b5c0-ef1c636cf7b3"},{"sub_group_name":"同步器","graphGroups":[{"graph_id":"0ae41b7e-522d-4481-b252-e5dd42c999a5","graph_name":"F0-5T09010 同步器"}],"sub_group_id":"f00092c6-47b6-4e22-8ccc-306b01297502"}]},{"group_name":"电器组","group_id":"d213342a-b80b-46aa-af84-c65e6051a1ab","subGroups":[{"sub_group_name":"配电盒","graphGroups":[{"graph_id":"b4ca90be-3941-4a7d-89c8-b3fbc8c7ddae","graph_name":"F0-04022 配电盒"}],"sub_group_id":"0dcecec1-908c-4253-8867-c73e6fc39b8d"},{"sub_group_name":"全车灯具","graphGroups":[{"graph_id":"ac0a5ae7-e810-4c44-989e-6b4749bb7238","graph_name":"F0-04013 全车灯具"}],"sub_group_id":"0eaa1e38-88e4-4e0a-9c7c-eb64aae53704"},{"sub_group_name":"顶棚线束","graphGroups":[{"graph_id":"9f5d4c00-1c2a-46e3-b8c2-89b34a4a8d98","graph_name":"F0-04009 顶棚线束"}],"sub_group_id":"17b08829-b07b-470a-bd11-6e5dd371a07b"},{"sub_group_name":"左前门线束","graphGroups":[{"graph_id":"df32ddea-e522-4ccd-8a7f-97b1b83a6653","graph_name":"F0-04004 左前门线束"}],"sub_group_id":"379d6c54-a745-4f91-a11e-794df4c55305"},{"sub_group_name":"地板线束","graphGroups":[{"graph_id":"f45abc42-257e-489e-b310-08deb69eb22e","graph_name":"F0-04003 地板线束"}],"sub_group_id":"38d5d328-075d-42d9-9530-d77dd5527b3e"},{"sub_group_name":"组合仪表","graphGroups":[{"graph_id":"d40b709e-a62d-4628-a1db-bf037ab66b7e","graph_name":"F0-04019 组合仪表"}],"sub_group_id":"40d9c645-7542-495f-b370-79fb04d3a7a7"},{"sub_group_name":"电器附件 2","graphGroups":[{"graph_id":"e4b5f962-d3ae-4d42-97f6-dec449bc6571","graph_name":"F0-04018 电器附件 2"}],"sub_group_id":"44b54c7b-8b38-446b-956e-274717abe1ff"},{"sub_group_name":"仪表台电器","graphGroups":[{"graph_id":"fe10130d-933b-491d-9e66-71d25fa432d4","graph_name":"F0-04015 仪表台电器"}],"sub_group_id":"463ccf89-5a3c-4ce2-8503-d5388eefd8cf"},{"sub_group_name":"后背门线束","graphGroups":[{"graph_id":"48572e9e-ca2b-4421-a07d-31e2c7951061","graph_name":"F0-04008 后背门线束"}],"sub_group_id":"6089d268-cee2-4ac8-8a7d-7b497b88078b"},{"sub_group_name":"空调系统 2","graphGroups":[{"graph_id":"c2cadfd9-1aaf-460b-80e5-3c0ab92380f2","graph_name":"F0-04021 空调系统 2"}],"sub_group_id":"6ce80d1e-1f7b-4be2-940c-662cea924e50"},{"sub_group_name":"发动机线束及其附属件","graphGroups":[{"graph_id":"e8ae0066-7ea0-4167-9456-34f4d5c57b46","graph_name":"F0-04001 发动机线束及其附属件"}],"sub_group_id":"84ddadb9-aaef-4714-aadc-4f461334cc94"},{"sub_group_name":"空调系统 1","graphGroups":[{"graph_id":"d678e373-25d9-4869-8a96-5629a813ba58","graph_name":"F0-04020 空调系统 1"}],"sub_group_id":"865e1ef5-1274-4956-b68b-6a869ce79286"},{"sub_group_name":"仪表板线束","graphGroups":[{"graph_id":"e23599e5-946c-478c-97f8-4e03ad6a9d71","graph_name":"F0-04010 仪表板线束"}],"sub_group_id":"959e7d4a-894c-4f47-b6e1-7d99040e47f4"},{"sub_group_name":"安全气囊系统","graphGroups":[{"graph_id":"147e11cb-7b0e-4fec-8f37-8b4bbc601522","graph_name":"F0-04014 安全气囊系统"}],"sub_group_id":"9b3f449c-3c34-4893-a82b-39bf36af3222"},{"sub_group_name":"后门线束","graphGroups":[{"graph_id":"1fcc0d5e-fa4e-42c3-b581-f1e8b902ec69","graph_name":"F0-04006 后门线束"}],"sub_group_id":"b61770ce-5045-436c-92b3-af994150d98c"},{"sub_group_name":"智能钥匙系统","graphGroups":[{"graph_id":"6d61e818-9c48-4903-bbbc-b0442d601068","graph_name":"F0-04017 智能钥匙系统"}],"sub_group_id":"ba2ccbfb-36e2-42ac-9601-1ac234315543"},{"sub_group_name":"前舱线束","graphGroups":[{"graph_id":"f2a84e47-10ad-4a28-a0bd-d35b2e78314a","graph_name":"F0-04002 前舱线束"}],"sub_group_id":"cf57395d-58f0-4b4e-8642-df9c2abcb8ef"},{"sub_group_name":"发动机电控传感器","graphGroups":[{"graph_id":"e39f8385-f149-4f60-9d04-b080d1d95d26","graph_name":"F0-04011 发动机电控传感器"}],"sub_group_id":"d968dad2-c10c-4cb5-bb8a-7e393f9ec0e1"},{"sub_group_name":"电器附件 1","graphGroups":[{"graph_id":"25d55ede-f649-4093-ad0b-565280172a8b","graph_name":"F0-04016 电器附件 1"}],"sub_group_id":"e75b32be-eb4c-4455-88d4-504579d9afaf"},{"sub_group_name":"发动机及变速器控制模块","graphGroups":[{"graph_id":"2fcd7c1e-9a04-41f3-852a-e1957026ce1b","graph_name":"F0-04012 发动机及变速器控制模块"}],"sub_group_id":"f4e6f82e-62a5-42b1-89a7-dd03f60ed1af"},{"sub_group_name":"右前门线束","graphGroups":[{"graph_id":"0d2aa001-27b9-4680-8d84-fccd4e0ba86f","graph_name":"F0-04005 右前门线束"}],"sub_group_id":"fab7bac9-c5ad-420c-bc66-4dee441d594f"}]},{"group_name":"发动机组","group_id":"40fb041d-21ce-4768-b8b5-d1db8fd496de","subGroups":[{"sub_group_name":"发电机及附件","graphGroups":[{"graph_id":"14983232-a068-48f9-9360-2586c30f6629","graph_name":"F0-371QA011 发电机及附件"}],"sub_group_id":"108ff292-e8aa-4dc5-9bcf-d3d57bc19929"},{"sub_group_name":"机油滤清器及附件","graphGroups":[{"graph_id":"ace4579b-3e57-4211-bfb3-36a09dd59bae","graph_name":"F0-371QA008 机油滤清器及附件"}],"sub_group_id":"11cae8e2-4f17-47a2-9043-074a4db55be0"},{"sub_group_name":"正时罩及附件","graphGroups":[{"graph_id":"ad000288-a08f-468e-bdbc-f44928e87602","graph_name":"F0-371QA009 正时罩及附件"}],"sub_group_id":"13cc6aa4-8e64-4a9e-936b-b05a28d7807a"},{"sub_group_name":"气缸盖罩","graphGroups":[{"graph_id":"7c9e3dc9-1801-4b45-ba6f-6ea57e483159","graph_name":"F0-371QA010 气缸盖罩"}],"sub_group_id":"2461c743-2feb-4cdc-8f2a-7956e9e80b9a"},{"sub_group_name":"喷油系统","graphGroups":[{"graph_id":"2e0435fb-c06f-499c-a840-e793b133d043","graph_name":"F0-371QA017 喷油系统"}],"sub_group_id":"356370f0-7845-4928-b3db-bc810ebeb1d0"},{"sub_group_name":"发动机维修包","graphGroups":[{"graph_id":"7f01f41e-90cb-4d15-b49e-b7c6a2cc43e5","graph_name":"F0-371QA019 发动机维修包"}],"sub_group_id":"3da2a4d0-ab5a-4e7d-8010-78aac48eb3f8"},{"sub_group_name":"发动机总成","graphGroups":[{"graph_id":"41d1b2ed-315f-44b8-b980-83930c4cb130","graph_name":"F0-371QA014 发动机总成"}],"sub_group_id":"40fcbbb1-5b4c-496d-933a-fb4b7571dcab"},{"sub_group_name":"空气滤清器","graphGroups":[{"graph_id":"46a006dd-f040-462a-84a2-4be9ca0c9648","graph_name":"F0-371QA012 空气滤清器"}],"sub_group_id":"98e27718-bdfa-47e1-8eb1-0b24e59608d1"},{"sub_group_name":"发动机冷却系统","graphGroups":[{"graph_id":"7f9c20d2-3d74-4afe-9c12-637411c7746f","graph_name":"F0-371QA013 发动机冷却系统"}],"sub_group_id":"99088902-5135-4ff8-8674-eeb8cbef94b4"},{"sub_group_name":"曲轴活塞连杆机构","graphGroups":[{"graph_id":"17af1678-a272-4448-97f2-9bbe326aba0c","graph_name":"F0-371QA003 曲轴活塞连杆机构"}],"sub_group_id":"a2957626-5a55-424e-9b9a-ec3b712fd364"},{"sub_group_name":"碳罐控制阀及附件","graphGroups":[{"graph_id":"8cc6f369-e3dd-4d9e-9952-edda87e0c080","graph_name":"F0-371QA016 碳罐控制阀及附件"}],"sub_group_id":"c42b4a16-e75a-4284-81c3-cddefd23030c"},{"sub_group_name":"气缸盖组件","graphGroups":[{"graph_id":"4b31a870-4daa-4340-88af-8fea5c3bd89c","graph_name":"F0-371QA002 气缸盖组件"}],"sub_group_id":"c66d1ab5-ca32-4d9a-8adc-6e7518ea7edf"},{"sub_group_name":"油底壳总成及附件","graphGroups":[{"graph_id":"a3e4993b-ea5e-4f9e-988b-4228dd982db2","graph_name":"F0-371QA007 油底壳总成及附件"}],"sub_group_id":"cecb66c4-0fe9-4a56-aa54-daa9ba9dfdc5"},{"sub_group_name":"气缸体组件及附件","graphGroups":[{"graph_id":"d46ef409-e57d-4faa-aa3c-f1db5b86d99e","graph_name":"F0-371QA001 气缸体组件及附件"}],"sub_group_id":"dfe34a4e-64bf-4619-9731-35c12bcd4777"},{"sub_group_name":"三元催化器及附件","graphGroups":[{"graph_id":"0eb91581-21c6-411b-a65a-4233520d562d","graph_name":"F0-371QA006 三元催化器及附件"}],"sub_group_id":"e15a17a4-5366-49a0-9fb2-4a23e13a9dd5"},{"sub_group_name":"配气机构","graphGroups":[{"graph_id":"28c8ab7e-7af8-4711-b4b3-857262d1eb07","graph_name":"F0-371QA004 配气机构"}],"sub_group_id":"ef1fbbc3-1be8-4b2c-ab7f-abb56c885bef"},{"sub_group_name":"进气系统","graphGroups":[{"graph_id":"5cad58df-fa5e-4603-aa4f-109e5c01585f","graph_name":"F0-371QA005 进气系统"}],"sub_group_id":"efd06151-985e-43f9-91ee-3e862827d6d2"},{"sub_group_name":"起动电机及附件","graphGroups":[{"graph_id":"327b830e-6e84-4c97-8410-5cbfd7fdcd8d","graph_name":"F0-371QA015 起动电机及附件"}],"sub_group_id":"f4b8812d-4fc2-42b0-a3cf-6a2d269a803d"},{"sub_group_name":"发动机传感器","graphGroups":[{"graph_id":"4babf4df-6604-470c-adc8-75342c0d18a2","graph_name":"F0-371QA018 发动机传感器"}],"sub_group_id":"f79fd3fe-3a8a-45dc-8b68-a9d853a2c7d1"}]},{"group_name":"车身及车身附件","group_id":"ed9383c2-e22f-4f18-96eb-074c870f5c0f","subGroups":[{"sub_group_name":"车身前围2","graphGroups":[{"graph_id":"a1025eef-c1da-40e6-b10d-544316dfaad3","graph_name":"F0-06008 车身前围2"}],"sub_group_id":"00bce3d1-2d08-4180-a3c3-9b7f19beab44"},{"sub_group_name":"车身主体","graphGroups":[{"graph_id":"b0702177-8896-4fea-961d-3f9bb0d53af6","graph_name":"F0-06002 车身主体"}],"sub_group_id":"0549048c-023b-4b49-ae7a-16bc382c8d3c"},{"sub_group_name":"左侧围与左门","graphGroups":[{"graph_id":"eba49267-7eab-40b9-91c1-516e187cc57b","graph_name":"F0-06012 左侧围与左门"}],"sub_group_id":"06da99ac-6d53-4e4f-a0f7-10c262a97e9c"},{"sub_group_name":"车身前围3","graphGroups":[{"graph_id":"d7bedaf1-ddd0-4966-8f18-d60318e59f86","graph_name":"F0-06009 车身前围3"}],"sub_group_id":"0eef836c-8c93-4a52-a26d-6bb21e6ce04a"},{"sub_group_name":"前舱盖及附件","graphGroups":[{"graph_id":"f8fb952b-3d0b-4ce3-a6ad-61e98a0ea0ad","graph_name":"F0-06019 前舱盖及附件"}],"sub_group_id":"1b83a7e3-7f38-4ed4-ac91-0dedb33334a3"},{"sub_group_name":"后侧门附件","graphGroups":[{"graph_id":"6460557f-841b-44f6-ad34-c9f8dd63b3e7","graph_name":"F0-06017 后侧门附件"}],"sub_group_id":"2d7d6cf5-a2e8-4a4e-b29f-2aadc583f0ad"},{"sub_group_name":"车身前围4、车身后围、管梁","graphGroups":[{"graph_id":"5bac332a-d96b-4121-88f4-a79d73880a6c","graph_name":"F0-06010 车身前围4、车身后围、管梁"}],"sub_group_id":"3c291c55-37d3-48d7-86ad-7e0279fd3b63"},{"sub_group_name":"后背门附件","graphGroups":[{"graph_id":"5c0d8bc1-1fb4-474c-8b58-56bb8e0ac085","graph_name":"F0-06014 后背门附件"}],"sub_group_id":"59ed6453-54b4-4e72-a035-c688f33f843f"},{"sub_group_name":"右前侧门附件","graphGroups":[{"graph_id":"e9641831-8067-41c9-8eda-d2a1d4289452","graph_name":"F0-06016 右前侧门附件"}],"sub_group_id":"64c69dad-c284-44d1-9bec-7835b279c1c1"},{"sub_group_name":"后排座椅及安全带总成","graphGroups":[{"graph_id":"aa2cd37c-9a5f-45a4-8518-d85bcfe80648","graph_name":"F0-06021 后排座椅及安全带总成"}],"sub_group_id":"6acde45b-bbed-4a25-bc8a-5e51ec61b0b6"},{"sub_group_name":"右侧围及右门","graphGroups":[{"graph_id":"76936b21-5d36-44c7-a8a6-90585596f64b","graph_name":"F0-06013 右侧围及右门"}],"sub_group_id":"6dc962fd-1867-49d5-94de-72af84a2f720"},{"sub_group_name":"白车身总成","graphGroups":[{"graph_id":"81b6ce21-456a-4a6a-a914-e98e4c8bedff","graph_name":"F0-06003 白车身总成"}],"sub_group_id":"704da237-b160-48ca-8e49-6726e9e018e0"},{"sub_group_name":"雨刮、风窗玻璃与密封条","graphGroups":[{"graph_id":"cde40bc5-f69e-47bd-b6c3-7073d1288038","graph_name":"F0-06005 雨刮、风窗玻璃与密封条"}],"sub_group_id":"733f4d42-d55b-42d9-a3f3-57c117ee701e"},{"sub_group_name":"地板","graphGroups":[{"graph_id":"b4d426c3-fa69-42c4-bdd6-fe4c05c5ddc1","graph_name":"F0-06001 地板"}],"sub_group_id":"78484eb5-9e13-4663-a877-efb10d4306d0"},{"sub_group_name":"前围与发动机舱总成","graphGroups":[{"graph_id":"8584c0e7-4e71-45b3-833d-2dd5a933283a","graph_name":"F0-06006 前围与发动机舱总成"}],"sub_group_id":"7eb62d7a-fda0-4b3f-9e4d-ffd3774596a3"},{"sub_group_name":"车身前围1","graphGroups":[{"graph_id":"546708d2-8851-4699-95ca-d923e16057e5","graph_name":"F0-06007 车身前围1"}],"sub_group_id":"80722f48-f7e6-47e3-acce-79b9c711c00d"},{"sub_group_name":"左前侧门附件","graphGroups":[{"graph_id":"47f3f405-f9a5-46ea-8e82-fefd6699abd4","graph_name":"F0-06015 左前侧门附件"}],"sub_group_id":"877a5c33-6bce-49e5-991d-2e1288a9acc2"},{"sub_group_name":"顶盖及其密封条","graphGroups":[{"graph_id":"fdaa9883-2863-4d2d-a7ea-3c591593152e","graph_name":"F0-06011 顶盖及其密封条"}],"sub_group_id":"8aa040c5-b4df-418e-b432-3ae4a94c884b"},{"sub_group_name":"前排座椅及安全带","graphGroups":[{"graph_id":"9923aa7d-874c-4851-8ff6-ef6f1aa2bef2","graph_name":"F0-06020 前排座椅及安全带"}],"sub_group_id":"a109c30e-76c8-4cbb-85fa-03ce4abdeaf4"},{"sub_group_name":"洗涤系统","graphGroups":[{"graph_id":"861504fe-450c-4841-8913-feac27d35cc3","graph_name":"F0-06004 洗涤系统"}],"sub_group_id":"a1e03b34-fa9f-43e4-9301-575def530582"},{"sub_group_name":"后视镜","graphGroups":[{"graph_id":"5204b121-0eb5-4f39-b842-df88ff14db7b","graph_name":"F0-06018 后视镜"}],"sub_group_id":"ac7bded8-2739-4e94-9e71-29f8a6f4d970"}]}]}
     */

    private String status;
    private String errmsg;
    private DataDicBean dataDic;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public DataDicBean getDataDic() {
        return dataDic;
    }

    public void setDataDic(DataDicBean dataDic) {
        this.dataDic = dataDic;
    }

    public static class DataDicBean {
        private ArrayList<ListBean> list;

        public ArrayList<ListBean> getList() {
            return list;
        }

        public void setList(ArrayList<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * group_name : 内外饰件组
             * group_id : b1df6fd9-1ecf-46bd-ad25-080e0b243e31
             * subGroups : [{"sub_group_name":"顶棚、遮阳板","graphGroups":[{"graph_id":"5f67d724-e958-4534-82cd-fb703ac09673","graph_name":"F0-05013 顶棚、遮阳板"}],"sub_group_id":"109d0df8-7386-45b9-b7d8-6d89c90aad62"},{"sub_group_name":"通风盖板","graphGroups":[{"graph_id":"8d4dd70a-ec85-430d-9552-0090aa49f0f0","graph_name":"F0-05004 通风盖板"}],"sub_group_id":"10ce54e7-b30a-497b-96db-1aafff8723e6"},{"sub_group_name":"左前门护板","graphGroups":[{"graph_id":"ec0d4f03-c643-4857-b366-3f24306e7f02","graph_name":"F0-05007 左前门护板"}],"sub_group_id":"1b8554a4-6c61-4183-ab75-00797049148e"},{"sub_group_name":"仪表板","graphGroups":[{"graph_id":"7612d8eb-ed7d-48fd-bd79-e444d61bf65f","graph_name":"F0-05015 仪表板"},{"graph_id":"a0442c51-670f-4b7b-9002-04406b78a41f","graph_name":"F0-05014 仪表板"}],"sub_group_id":"3f73a954-492d-4fba-a637-8bd6eebf6daf"},{"sub_group_name":"地毯、前围隔热垫","graphGroups":[{"graph_id":"1e026de7-25d7-453d-8456-fbad6b3d36ee","graph_name":"F0-05012 地毯、前围隔热垫"}],"sub_group_id":"665420b2-1901-4426-a1b5-e857e6d714e8"},{"sub_group_name":"左后门护板","graphGroups":[{"graph_id":"c7b54f31-6e6a-4bf9-9ed6-fca1cce27cb8","graph_name":"F0-05009 左后门护板"}],"sub_group_id":"67cb97e8-8d66-4fd6-bb96-94fbafb5b46e"},{"sub_group_name":"侧围护板","graphGroups":[{"graph_id":"b3cdce8b-fc6d-4e2b-89cd-46c3dfa0cddf","graph_name":"F0-05006 侧围护板"}],"sub_group_id":"9c05e7af-1ab5-4b05-b06c-210af11e9388"},{"sub_group_name":"前保险杠","graphGroups":[{"graph_id":"e9ae9d93-d4f4-4a2c-b33d-7810d93eef78","graph_name":"F0-05001 前保险杠"}],"sub_group_id":"9c5afdac-f4d5-44f3-aa52-d60dd78ef3e6"},{"sub_group_name":"副仪表板","graphGroups":[{"graph_id":"81e21e52-1572-46d9-80f9-a1ca7bd94b5f","graph_name":"F0-05016 副仪表板"}],"sub_group_id":"b200441c-02de-4e70-b3c7-d2a0d44f942e"},{"sub_group_name":"右前门护板","graphGroups":[{"graph_id":"24cb88d8-d418-4741-aa2b-48836b9f0859","graph_name":"F0-05008 右前门护板"}],"sub_group_id":"bd491a9c-4e85-4adc-8c52-5530f27def04"},{"sub_group_name":"后保险杠","graphGroups":[{"graph_id":"188d9290-e975-44a9-811e-5b68cd595cd9","graph_name":"F0-05002 后保险杠"}],"sub_group_id":"bec6b799-39bc-48ee-ad4b-ce8612333d79"},{"sub_group_name":"挡泥板、钢轮装饰盖","graphGroups":[{"graph_id":"730e3dd3-012c-4099-9491-838823e3c5fc","graph_name":"F0-05003 挡泥板、钢轮装饰盖"}],"sub_group_id":"da3c1f1f-a037-44c4-9cd4-b82b1362b7d2"},{"sub_group_name":"行李箱、搁物架","graphGroups":[{"graph_id":"70acc31a-6a10-4fab-859a-cea432db72aa","graph_name":"F0-05011 行李箱、搁物架"}],"sub_group_id":"e427cc27-1a1f-4885-a241-15f534376729"},{"sub_group_name":"翼子板饰板","graphGroups":[{"graph_id":"33af88e3-8a12-43c6-9ef6-d61bd620185e","graph_name":"F0-05005 翼子板饰板"}],"sub_group_id":"fb56ca33-b7ab-46f1-90c3-0a1fbd611486"}]
             */

            private String group_name;
            private String group_id;
            private ArrayList<SubGroupsBean> subGroups;

            public String getGroup_name() {
                return group_name;
            }

            public void setGroup_name(String group_name) {
                this.group_name = group_name;
            }

            public String getGroup_id() {
                return group_id;
            }

            public void setGroup_id(String group_id) {
                this.group_id = group_id;
            }

            public ArrayList<SubGroupsBean> getSubGroups() {
                return subGroups;
            }

            public void setSubGroups(ArrayList<SubGroupsBean> subGroups) {
                this.subGroups = subGroups;
            }

            public static class SubGroupsBean implements Parcelable{
                /**
                 * sub_group_name : 顶棚、遮阳板
                 * graphGroups : [{"graph_id":"5f67d724-e958-4534-82cd-fb703ac09673","graph_name":"F0-05013 顶棚、遮阳板"}]
                 * sub_group_id : 109d0df8-7386-45b9-b7d8-6d89c90aad62
                 */

                private String sub_group_name;
                private String sub_group_id;
                private ArrayList<GraphGroupsBean> graphGroups;

                public String getSub_group_name() {
                    return sub_group_name;
                }

                public void setSub_group_name(String sub_group_name) {
                    this.sub_group_name = sub_group_name;
                }

                public String getSub_group_id() {
                    return sub_group_id;
                }

                public void setSub_group_id(String sub_group_id) {
                    this.sub_group_id = sub_group_id;
                }

                public ArrayList<GraphGroupsBean> getGraphGroups() {
                    return graphGroups;
                }

                public void setGraphGroups(ArrayList<GraphGroupsBean> graphGroups) {
                    this.graphGroups = graphGroups;
                }

                public static class GraphGroupsBean {
                    /**
                     * graph_id : 5f67d724-e958-4534-82cd-fb703ac09673
                     * graph_name : F0-05013 顶棚、遮阳板
                     */

                    private String graph_id;
                    private String graph_name;

                    public String getGraph_id() {
                        return graph_id;
                    }

                    public void setGraph_id(String graph_id) {
                        this.graph_id = graph_id;
                    }

                    public String getGraph_name() {
                        return graph_name;
                    }

                    public void setGraph_name(String graph_name) {
                        this.graph_name = graph_name;
                    }
                }

                @Override
                public int describeContents() {
                    return 0;
                }

                @Override
                public void writeToParcel(Parcel dest, int flags) {
                    dest.writeString(this.sub_group_name);
                    dest.writeString(this.sub_group_id);
                    dest.writeList(this.graphGroups);
                }

                public SubGroupsBean() {
                }

                protected SubGroupsBean(Parcel in) {
                    this.sub_group_name = in.readString();
                    this.sub_group_id = in.readString();
                    this.graphGroups = new ArrayList<GraphGroupsBean>();
                    in.readList(this.graphGroups, GraphGroupsBean.class.getClassLoader());
                }

                public static final Creator<SubGroupsBean> CREATOR = new Creator<SubGroupsBean>() {
                    @Override
                    public SubGroupsBean createFromParcel(Parcel source) {
                        return new SubGroupsBean(source);
                    }

                    @Override
                    public SubGroupsBean[] newArray(int size) {
                        return new SubGroupsBean[size];
                    }
                };
            }
        }
    }
}
