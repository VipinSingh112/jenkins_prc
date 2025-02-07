/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_sez_dev_share_pricipal_add&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevSharePrincipalAdd
 * @generated
 */
public class SezDevSharePrincipalAddTable
	extends BaseTable<SezDevSharePrincipalAddTable> {

	public static final SezDevSharePrincipalAddTable INSTANCE =
		new SezDevSharePrincipalAddTable();

	public final Column<SezDevSharePrincipalAddTable, Long>
		sezDevSharePrincipalAddId = createColumn(
			"sezDevSharePrincipalAddId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<SezDevSharePrincipalAddTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezDevSharePrincipalAddTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezDevSharePrincipalAddTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezDevSharePrincipalAddTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevSharePrincipalAddTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezDevSharePrincipalAddTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezDevSharePrincipalAddTable, String> name =
		createColumn("name", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevSharePrincipalAddTable, String> buildingNum =
		createColumn(
			"buildingNum", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevSharePrincipalAddTable, String> parishPost =
		createColumn(
			"parishPost", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevSharePrincipalAddTable, String> country =
		createColumn(
			"country", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevSharePrincipalAddTable, String> nationality =
		createColumn(
			"nationality", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevSharePrincipalAddTable, String>
		taxRegistrationNum = createColumn(
			"taxRegistrationNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevSharePrincipalAddTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevSharePrincipalAddTable, Long>
		sezStatusApplicationId = createColumn(
			"sezStatusApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private SezDevSharePrincipalAddTable() {
		super(
			"nbp_sez_dev_share_pricipal_add",
			SezDevSharePrincipalAddTable::new);
	}

}