/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_miic_suspension_of_cet&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see MiicSuspensionOfCetAdd
 * @generated
 */
public class MiicSuspensionOfCetAddTable
	extends BaseTable<MiicSuspensionOfCetAddTable> {

	public static final MiicSuspensionOfCetAddTable INSTANCE =
		new MiicSuspensionOfCetAddTable();

	public final Column<MiicSuspensionOfCetAddTable, Long>
		miicSuspensionOfCetAddId = createColumn(
			"miicSuspensionOfCetAddId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<MiicSuspensionOfCetAddTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiicSuspensionOfCetAddTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiicSuspensionOfCetAddTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiicSuspensionOfCetAddTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiicSuspensionOfCetAddTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MiicSuspensionOfCetAddTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MiicSuspensionOfCetAddTable, String> name =
		createColumn("name", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiicSuspensionOfCetAddTable, String> tariffHeadingNum =
		createColumn(
			"tariffHeadingNum ", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiicSuspensionOfCetAddTable, String> address =
		createColumn(
			"address", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiicSuspensionOfCetAddTable, String> description =
		createColumn(
			"description", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiicSuspensionOfCetAddTable, String> amountQuantity =
		createColumn(
			"amountQuantity", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiicSuspensionOfCetAddTable, String>
		amountEstimateInUs = createColumn(
			"amountEstimateInUs", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiicSuspensionOfCetAddTable, String>
		technologySpecification = createColumn(
			"technologySpecification", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiicSuspensionOfCetAddTable, String> cetRate =
		createColumn(
			"cetRate", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiicSuspensionOfCetAddTable, String> rateProposed =
		createColumn(
			"rateProposed", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiicSuspensionOfCetAddTable, Date>
		periodOfRateChangeFrom = createColumn(
			"periodOfRateChangeFrom", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<MiicSuspensionOfCetAddTable, Date>
		periodOfRateChangeTo = createColumn(
			"periodOfRateChangeTo", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<MiicSuspensionOfCetAddTable, String>
		indicationOfUrgency = createColumn(
			"indicationOfUrgency", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiicSuspensionOfCetAddTable, String>
		requestForSuspensionOfRate = createColumn(
			"requestForSuspensionOfRate", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiicSuspensionOfCetAddTable, String>
		evidenceOfInability = createColumn(
			"evidenceOfInability", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiicSuspensionOfCetAddTable, String>
		evidenceOfConsultation = createColumn(
			"evidenceOfConsultation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiicSuspensionOfCetAddTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiicSuspensionOfCetAddTable, Long> miicApplicationId =
		createColumn(
			"miicApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private MiicSuspensionOfCetAddTable() {
		super("nbp_miic_suspension_of_cet", MiicSuspensionOfCetAddTable::new);
	}

}