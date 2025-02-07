/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_wra_renew_abstract&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see RenewLicAbstractAndWater
 * @generated
 */
public class RenewLicAbstractAndWaterTable
	extends BaseTable<RenewLicAbstractAndWaterTable> {

	public static final RenewLicAbstractAndWaterTable INSTANCE =
		new RenewLicAbstractAndWaterTable();

	public final Column<RenewLicAbstractAndWaterTable, Long>
		renewLicAbstractAndWaterId = createColumn(
			"renewLicAbstractAndWaterId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<RenewLicAbstractAndWaterTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<RenewLicAbstractAndWaterTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<RenewLicAbstractAndWaterTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<RenewLicAbstractAndWaterTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RenewLicAbstractAndWaterTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<RenewLicAbstractAndWaterTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<RenewLicAbstractAndWaterTable, String> renewName =
		createColumn(
			"renewName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RenewLicAbstractAndWaterTable, String> renewContact =
		createColumn(
			"renewContact", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RenewLicAbstractAndWaterTable, String> renewJobTitle =
		createColumn(
			"renewJobTitle", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RenewLicAbstractAndWaterTable, String>
		renewTelephoneNum = createColumn(
			"renewTelephoneNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RenewLicAbstractAndWaterTable, String> renewFaxNum =
		createColumn(
			"renewFaxNum", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RenewLicAbstractAndWaterTable, String>
		renewParishLocation = createColumn(
			"renewParishLocation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RenewLicAbstractAndWaterTable, String> renewAddress =
		createColumn(
			"renewAddress", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RenewLicAbstractAndWaterTable, String> renewSourceName =
		createColumn(
			"renewSourceName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RenewLicAbstractAndWaterTable, String>
		renewDetailsParishAdd = createColumn(
			"renewDetailsParishAdd", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RenewLicAbstractAndWaterTable, String>
		renewDetailsLocation = createColumn(
			"renewDetailsLocation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RenewLicAbstractAndWaterTable, String>
		renewAbstractionRate = createColumn(
			"renewAbstractionRate", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RenewLicAbstractAndWaterTable, String> renewDetailsUse =
		createColumn(
			"renewDetailsUse", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RenewLicAbstractAndWaterTable, String>
		renewAbstractionMethod = createColumn(
			"renewAbstractionMethod", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RenewLicAbstractAndWaterTable, String> attachedDevice =
		createColumn(
			"attachedDevice", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RenewLicAbstractAndWaterTable, String>
		renewStateDevice = createColumn(
			"renewStateDevice", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RenewLicAbstractAndWaterTable, String> abstractionData =
		createColumn(
			"abstractionData", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RenewLicAbstractAndWaterTable, String> renewSignName =
		createColumn(
			"renewSignName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RenewLicAbstractAndWaterTable, Date> renewDate =
		createColumn(
			"renewDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<RenewLicAbstractAndWaterTable, Long> wraApplicationId =
		createColumn(
			"wraApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private RenewLicAbstractAndWaterTable() {
		super("nbp_wra_renew_abstract", RenewLicAbstractAndWaterTable::new);
	}

}