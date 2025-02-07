/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.base;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;

import com.nbp.osi.insolvency.application.form.services.model.MonthlyIncome;
import com.nbp.osi.insolvency.application.form.services.service.MonthlyIncomeLocalService;
import com.nbp.osi.insolvency.application.form.services.service.persistence.AssessmentIndividualPersonalDetailsPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.AssetsNotUsedAsSecurityPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.AssetsUsedAsSecurityPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.CompanyDetailsPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.CompanyFinancialPositionPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.CompanySecretaryPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.CompanySecuredCreditorPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.CompanyTotalLiabilityPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.CompanyUnsecuredCreditorPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.DirectorsFormPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.FinancialPositionPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.GrandTotalPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.MonthlyExpensesPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.MonthlyIncomePersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.NotUsedSecurityPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.OsiAssesmentDetailsOfAssetPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.OsiAssessmentSignaturePersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.OsiComSecurityTotalPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.OsiComTotalLiabilityPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.OsiIndiTotalDetailOfAssetsPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.OsiInsolvPaymentPlanPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.OsiInsolvencyApplicationPaymentPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.OsiInsolvencyApplicationPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.OsiInsolvencyCurrentStagePersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.OsiTotalMonthlyExpensePersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.PreferredCreditorPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.SecuredCreditorPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.ShareholdersHoldingsPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.SubjectDataPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.UnsecuredCreditorPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.UsedSecurityPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.VerificationCompanyInfoPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.VerificationRequestorsInfoPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the monthly income local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.osi.insolvency.application.form.services.service.impl.MonthlyIncomeLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.osi.insolvency.application.form.services.service.impl.MonthlyIncomeLocalServiceImpl
 * @generated
 */
public abstract class MonthlyIncomeLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService, MonthlyIncomeLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>MonthlyIncomeLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.osi.insolvency.application.form.services.service.MonthlyIncomeLocalServiceUtil</code>.
	 */

	/**
	 * Adds the monthly income to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MonthlyIncomeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param monthlyIncome the monthly income
	 * @return the monthly income that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public MonthlyIncome addMonthlyIncome(MonthlyIncome monthlyIncome) {
		monthlyIncome.setNew(true);

		return monthlyIncomePersistence.update(monthlyIncome);
	}

	/**
	 * Creates a new monthly income with the primary key. Does not add the monthly income to the database.
	 *
	 * @param monthlyIncomeId the primary key for the new monthly income
	 * @return the new monthly income
	 */
	@Override
	@Transactional(enabled = false)
	public MonthlyIncome createMonthlyIncome(long monthlyIncomeId) {
		return monthlyIncomePersistence.create(monthlyIncomeId);
	}

	/**
	 * Deletes the monthly income with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MonthlyIncomeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param monthlyIncomeId the primary key of the monthly income
	 * @return the monthly income that was removed
	 * @throws PortalException if a monthly income with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public MonthlyIncome deleteMonthlyIncome(long monthlyIncomeId)
		throws PortalException {

		return monthlyIncomePersistence.remove(monthlyIncomeId);
	}

	/**
	 * Deletes the monthly income from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MonthlyIncomeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param monthlyIncome the monthly income
	 * @return the monthly income that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public MonthlyIncome deleteMonthlyIncome(MonthlyIncome monthlyIncome) {
		return monthlyIncomePersistence.remove(monthlyIncome);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return monthlyIncomePersistence.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(DSLQuery dslQuery) {
		Long count = dslQuery(dslQuery);

		return count.intValue();
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(
			MonthlyIncome.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return monthlyIncomePersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.MonthlyIncomeModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return monthlyIncomePersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.MonthlyIncomeModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return monthlyIncomePersistence.findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return monthlyIncomePersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection) {

		return monthlyIncomePersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public MonthlyIncome fetchMonthlyIncome(long monthlyIncomeId) {
		return monthlyIncomePersistence.fetchByPrimaryKey(monthlyIncomeId);
	}

	/**
	 * Returns the monthly income with the primary key.
	 *
	 * @param monthlyIncomeId the primary key of the monthly income
	 * @return the monthly income
	 * @throws PortalException if a monthly income with the primary key could not be found
	 */
	@Override
	public MonthlyIncome getMonthlyIncome(long monthlyIncomeId)
		throws PortalException {

		return monthlyIncomePersistence.findByPrimaryKey(monthlyIncomeId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(monthlyIncomeLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(MonthlyIncome.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("monthlyIncomeId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			monthlyIncomeLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(MonthlyIncome.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"monthlyIncomeId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(monthlyIncomeLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(MonthlyIncome.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("monthlyIncomeId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return monthlyIncomePersistence.create(
			((Long)primaryKeyObj).longValue());
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		if (_log.isWarnEnabled()) {
			_log.warn(
				"Implement MonthlyIncomeLocalServiceImpl#deleteMonthlyIncome(MonthlyIncome) to avoid orphaned data");
		}

		return monthlyIncomeLocalService.deleteMonthlyIncome(
			(MonthlyIncome)persistedModel);
	}

	@Override
	public BasePersistence<MonthlyIncome> getBasePersistence() {
		return monthlyIncomePersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return monthlyIncomePersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the monthly incomes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.MonthlyIncomeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of monthly incomes
	 * @param end the upper bound of the range of monthly incomes (not inclusive)
	 * @return the range of monthly incomes
	 */
	@Override
	public List<MonthlyIncome> getMonthlyIncomes(int start, int end) {
		return monthlyIncomePersistence.findAll(start, end);
	}

	/**
	 * Returns the number of monthly incomes.
	 *
	 * @return the number of monthly incomes
	 */
	@Override
	public int getMonthlyIncomesCount() {
		return monthlyIncomePersistence.countAll();
	}

	/**
	 * Updates the monthly income in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MonthlyIncomeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param monthlyIncome the monthly income
	 * @return the monthly income that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public MonthlyIncome updateMonthlyIncome(MonthlyIncome monthlyIncome) {
		return monthlyIncomePersistence.update(monthlyIncome);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			MonthlyIncomeLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		monthlyIncomeLocalService = (MonthlyIncomeLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return MonthlyIncomeLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return MonthlyIncome.class;
	}

	protected String getModelClassName() {
		return MonthlyIncome.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = monthlyIncomePersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(
				dataSource, sql);

			sqlUpdate.update();
		}
		catch (Exception exception) {
			throw new SystemException(exception);
		}
	}

	@Reference
	protected AssessmentIndividualPersonalDetailsPersistence
		assessmentIndividualPersonalDetailsPersistence;

	@Reference
	protected AssetsNotUsedAsSecurityPersistence
		assetsNotUsedAsSecurityPersistence;

	@Reference
	protected AssetsUsedAsSecurityPersistence assetsUsedAsSecurityPersistence;

	@Reference
	protected CompanyDetailsPersistence companyDetailsPersistence;

	@Reference
	protected CompanyFinancialPositionPersistence
		companyFinancialPositionPersistence;

	@Reference
	protected CompanySecretaryPersistence companySecretaryPersistence;

	@Reference
	protected CompanySecuredCreditorPersistence
		companySecuredCreditorPersistence;

	@Reference
	protected CompanyTotalLiabilityPersistence companyTotalLiabilityPersistence;

	@Reference
	protected CompanyUnsecuredCreditorPersistence
		companyUnsecuredCreditorPersistence;

	@Reference
	protected DirectorsFormPersistence directorsFormPersistence;

	@Reference
	protected FinancialPositionPersistence financialPositionPersistence;

	@Reference
	protected GrandTotalPersistence grandTotalPersistence;

	@Reference
	protected MonthlyExpensesPersistence monthlyExpensesPersistence;

	protected MonthlyIncomeLocalService monthlyIncomeLocalService;

	@Reference
	protected MonthlyIncomePersistence monthlyIncomePersistence;

	@Reference
	protected NotUsedSecurityPersistence notUsedSecurityPersistence;

	@Reference
	protected OsiAssesmentDetailsOfAssetPersistence
		osiAssesmentDetailsOfAssetPersistence;

	@Reference
	protected OsiAssessmentSignaturePersistence
		osiAssessmentSignaturePersistence;

	@Reference
	protected OsiComSecurityTotalPersistence osiComSecurityTotalPersistence;

	@Reference
	protected OsiComTotalLiabilityPersistence osiComTotalLiabilityPersistence;

	@Reference
	protected OsiIndiTotalDetailOfAssetsPersistence
		osiIndiTotalDetailOfAssetsPersistence;

	@Reference
	protected OsiInsolvencyApplicationPersistence
		osiInsolvencyApplicationPersistence;

	@Reference
	protected OsiInsolvencyApplicationPaymentPersistence
		osiInsolvencyApplicationPaymentPersistence;

	@Reference
	protected OsiInsolvencyCurrentStagePersistence
		osiInsolvencyCurrentStagePersistence;

	@Reference
	protected OsiInsolvPaymentPlanPersistence osiInsolvPaymentPlanPersistence;

	@Reference
	protected OsiTotalMonthlyExpensePersistence
		osiTotalMonthlyExpensePersistence;

	@Reference
	protected PreferredCreditorPersistence preferredCreditorPersistence;

	@Reference
	protected SecuredCreditorPersistence securedCreditorPersistence;

	@Reference
	protected ShareholdersHoldingsPersistence shareholdersHoldingsPersistence;

	@Reference
	protected SubjectDataPersistence subjectDataPersistence;

	@Reference
	protected UnsecuredCreditorPersistence unsecuredCreditorPersistence;

	@Reference
	protected UsedSecurityPersistence usedSecurityPersistence;

	@Reference
	protected VerificationCompanyInfoPersistence
		verificationCompanyInfoPersistence;

	@Reference
	protected VerificationRequestorsInfoPersistence
		verificationRequestorsInfoPersistence;

	@Reference
	protected com.liferay.counter.kernel.service.CounterLocalService
		counterLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameLocalService
		classNameLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

	private static final Log _log = LogFactoryUtil.getLog(
		MonthlyIncomeLocalServiceBaseImpl.class);

}