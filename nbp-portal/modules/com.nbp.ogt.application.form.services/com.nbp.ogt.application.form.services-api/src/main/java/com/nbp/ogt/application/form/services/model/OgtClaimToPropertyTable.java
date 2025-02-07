/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_ogt_claim_property&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see OgtClaimToProperty
 * @generated
 */
public class OgtClaimToPropertyTable
	extends BaseTable<OgtClaimToPropertyTable> {

	public static final OgtClaimToPropertyTable INSTANCE =
		new OgtClaimToPropertyTable();

	public final Column<OgtClaimToPropertyTable, Long> ogtClaimToPropertyId =
		createColumn(
			"ogtClaimToPropertyId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<OgtClaimToPropertyTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OgtClaimToPropertyTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OgtClaimToPropertyTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OgtClaimToPropertyTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OgtClaimToPropertyTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OgtClaimToPropertyTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OgtClaimToPropertyTable, Date> propertyDate =
		createColumn(
			"propertyDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OgtClaimToPropertyTable, String> propClaimDesc =
		createColumn(
			"propClaimDesc", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OgtClaimToPropertyTable, String> affidavitDesc =
		createColumn(
			"affidavitDesc", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OgtClaimToPropertyTable, Long> ogtApplicationId =
		createColumn(
			"ogtApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private OgtClaimToPropertyTable() {
		super("nbp_ogt_claim_property", OgtClaimToPropertyTable::new);
	}

}