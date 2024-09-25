create table if not exists serverless_pub_sub_data(
pub_sub_code varchar(255) not null,
pub_sub_name varchar(255) null,
cloud_provider varchar(255) null,
autoscalinggroup varchar(255) null,
pay_as_per_use varchar(255) null,
elasticity varchar(255) null,
scalability varchar(255) null,
resource_limits Integer null,
monitoring_and_debugging varchar(255) null,
content_security varchar(255) null,
vendor_lock_in varchar(255) null,
constraint serverless_pub_sub_data_pk primary key(pub_sub_code));