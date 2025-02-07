/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_ncra_verify_weigh_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see NcraVerifyWeighingDeviceInfo
 * @generated
 */
public class NcraVerifyWeighingDeviceInfoTable
	extends BaseTable<NcraVerifyWeighingDeviceInfoTable> {

	public static final NcraVerifyWeighingDeviceInfoTable INSTANCE =
		new NcraVerifyWeighingDeviceInfoTable();

	public final Column<NcraVerifyWeighingDeviceInfoTable, Long>
		ncraVerifyWeighingDeviceInfoId = createColumn(
			"ncraVerifyWeighingDeviceInfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<NcraVerifyWeighingDeviceInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcraVerifyWeighingDeviceInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcraVerifyWeighingDeviceInfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcraVerifyWeighingDeviceInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcraVerifyWeighingDeviceInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcraVerifyWeighingDeviceInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcraVerifyWeighingDeviceInfoTable, String>
		typeofDevice = createColumn(
			"typeofDevice", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcraVerifyWeighingDeviceInfoTable, String>
		manufacturer = createColumn(
			"manufacturer", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcraVerifyWeighingDeviceInfoTable, String>
		serialNumber = createColumn(
			"serialNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcraVerifyWeighingDeviceInfoTable, String> quantity =
		createColumn(
			"quantity", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcraVerifyWeighingDeviceInfoTable, String>
		maximumCapacity = createColumn(
			"maximumCapacity", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcraVerifyWeighingDeviceInfoTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcraVerifyWeighingDeviceInfoTable, Long>
		ncraApplicationId = createColumn(
			"ncraApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private NcraVerifyWeighingDeviceInfoTable() {
		super(
			"nbp_ncra_verify_weigh_info",
			NcraVerifyWeighingDeviceInfoTable::new);
	}

}