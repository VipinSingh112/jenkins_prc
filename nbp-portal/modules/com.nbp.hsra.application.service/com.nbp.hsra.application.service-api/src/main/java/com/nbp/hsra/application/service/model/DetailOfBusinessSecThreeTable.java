/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_hsra_det_business&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see DetailOfBusinessSecThree
 * @generated
 */
public class DetailOfBusinessSecThreeTable
	extends BaseTable<DetailOfBusinessSecThreeTable> {

	public static final DetailOfBusinessSecThreeTable INSTANCE =
		new DetailOfBusinessSecThreeTable();

	public final Column<DetailOfBusinessSecThreeTable, Long>
		detailOfBusinessSecThreeId = createColumn(
			"detailOfBusinessSecThreeId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<DetailOfBusinessSecThreeTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DetailOfBusinessSecThreeTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DetailOfBusinessSecThreeTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DetailOfBusinessSecThreeTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DetailOfBusinessSecThreeTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<DetailOfBusinessSecThreeTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<DetailOfBusinessSecThreeTable, String> businessType =
		createColumn(
			"businessType", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DetailOfBusinessSecThreeTable, String>
		nuclearBusinessNumber = createColumn(
			"nuclearBusinessNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<DetailOfBusinessSecThreeTable, String>
		nuclearCorporationNum = createColumn(
			"nuclearCorporationNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<DetailOfBusinessSecThreeTable, String>
		nuclearPublicAct = createColumn(
			"nuclearPublicAct", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<DetailOfBusinessSecThreeTable, String> nuclearName =
		createColumn(
			"nuclearName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DetailOfBusinessSecThreeTable, String>
		nuclearAddressThird = createColumn(
			"nuclearAddressThird", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<DetailOfBusinessSecThreeTable, String>
		nuclearThirdParish = createColumn(
			"nuclearThirdParish", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<DetailOfBusinessSecThreeTable, String>
		nuclearTelephoneNum = createColumn(
			"nuclearTelephoneNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<DetailOfBusinessSecThreeTable, String>
		nuclearfaxNumber = createColumn(
			"nuclearfaxNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<DetailOfBusinessSecThreeTable, String> nuclearEmailAdd =
		createColumn(
			"nuclearEmailAdd", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<DetailOfBusinessSecThreeTable, String>
		nuclearFinancial = createColumn(
			"nuclearFinancial", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<DetailOfBusinessSecThreeTable, Long> hsraApplicationId =
		createColumn(
			"hsraApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private DetailOfBusinessSecThreeTable() {
		super("nbp_hsra_det_business", DetailOfBusinessSecThreeTable::new);
	}

}