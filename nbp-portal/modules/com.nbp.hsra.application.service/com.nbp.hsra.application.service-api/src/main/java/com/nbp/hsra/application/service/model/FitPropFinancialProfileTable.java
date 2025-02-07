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
 * The table class for the &quot;nbp_hsra_fitprop_financial&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see FitPropFinancialProfile
 * @generated
 */
public class FitPropFinancialProfileTable
	extends BaseTable<FitPropFinancialProfileTable> {

	public static final FitPropFinancialProfileTable INSTANCE =
		new FitPropFinancialProfileTable();

	public final Column<FitPropFinancialProfileTable, Long>
		fitPropFinancialProfileId = createColumn(
			"fitPropFinancialProfileId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<FitPropFinancialProfileTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FitPropFinancialProfileTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FitPropFinancialProfileTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FitPropFinancialProfileTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FitPropFinancialProfileTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FitPropFinancialProfileTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FitPropFinancialProfileTable, String>
		financialInstitution = createColumn(
			"financialInstitution", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FitPropFinancialProfileTable, String> creditfacility =
		createColumn(
			"creditfacility", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FitPropFinancialProfileTable, String>
		surroundingAction = createColumn(
			"surroundingAction", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FitPropFinancialProfileTable, String>
		jamaicaInstitution = createColumn(
			"jamaicaInstitution", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FitPropFinancialProfileTable, Long> hsraApplicationId =
		createColumn(
			"hsraApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private FitPropFinancialProfileTable() {
		super("nbp_hsra_fitprop_financial", FitPropFinancialProfileTable::new);
	}

}