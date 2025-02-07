/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
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

import com.nbp.osi.insolvency.application.form.services.model.VerificationRequestorsInformation;
import com.nbp.osi.insolvency.application.form.services.service.VerificationRequestorsInformationLocalService;
import com.nbp.osi.insolvency.application.form.services.service.VerificationRequestorsInformationLocalServiceUtil;
import com.nbp.osi.insolvency.application.form.services.service.persistence.AssessmentIndividualPersonalDetailsPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.AssetsNotUsedAsSecurityPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.AssetsUsedAsSecurityPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.CompanyDetailsPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.CompanyFinancialPositionPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.CompanySecretaryPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.CompanySecuredCreditorPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.CompanyUnsecuredCreditorPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.DirectorsFormPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.FinancialPositionPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.GrandTotalPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.MonthlyExpensesPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.MonthlyIncomePersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.NotUsedSecurityPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.OsiInsolvencyApplicationPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.PreferredCreditorPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.SecuredCreditorPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.ShareholdersHoldingsPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.SubjectDataPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.UnsecuredCreditorPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.UsedSecurityPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.VerificationRequestorsInformationPK;
import com.nbp.osi.insolvency.application.form.services.service.persistence.VerificationRequestorsInformationPersistence;

import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the verification requestors information local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.osi.insolvency.application.form.services.service.impl.VerificationRequestorsInformationLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.osi.insolvency.application.form.services.service.impl.VerificationRequestorsInformationLocalServiceImpl
 * @generated
 */
public abstract class VerificationRequestorsInformationLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService,
			   VerificationRequestorsInformationLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>VerificationRequestorsInformationLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>VerificationRequestorsInformationLocalServiceUtil</code>.
	 */

	/**
	 * Adds the verification requestors information to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect VerificationRequestorsInformationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param verificationRequestorsInformation the verification requestors information
	 * @return the verification requestors information that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public VerificationRequestorsInformation
		addVerificationRequestorsInformation(
			VerificationRequestorsInformation
				verificationRequestorsInformation) {

		verificationRequestorsInformation.setNew(true);

		return verificationRequestorsInformationPersistence.update(
			verificationRequestorsInformation);
	}

	/**
	 * Creates a new verification requestors information with the primary key. Does not add the verification requestors information to the database.
	 *
	 * @param verificationRequestorsInformationPK the primary key for the new verification requestors information
	 * @return the new verification requestors information
	 */
	@Override
	@Transactional(enabled = false)
	public VerificationRequestorsInformation
		createVerificationRequestorsInformation(
			VerificationRequestorsInformationPK
				verificationRequestorsInformationPK) {

		return verificationRequestorsInformationPersistence.create(
			verificationRequestorsInformationPK);
	}

	/**
	 * Deletes the verification requestors information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect VerificationRequestorsInformationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param verificationRequestorsInformationPK the primary key of the verification requestors information
	 * @return the verification requestors information that was removed
	 * @throws PortalException if a verification requestors information with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public VerificationRequestorsInformation
			deleteVerificationRequestorsInformation(
				VerificationRequestorsInformationPK
					verificationRequestorsInformationPK)
		throws PortalException {

		return verificationRequestorsInformationPersistence.remove(
			verificationRequestorsInformationPK);
	}

	/**
	 * Deletes the verification requestors information from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect VerificationRequestorsInformationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param verificationRequestorsInformation the verification requestors information
	 * @return the verification requestors information that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public VerificationRequestorsInformation
		deleteVerificationRequestorsInformation(
			VerificationRequestorsInformation
				verificationRequestorsInformation) {

		return verificationRequestorsInformationPersistence.remove(
			verificationRequestorsInformation);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return verificationRequestorsInformationPersistence.dslQuery(dslQuery);
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
			VerificationRequestorsInformation.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return verificationRequestorsInformationPersistence.
			findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.VerificationRequestorsInformationModelImpl</code>.
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

		return verificationRequestorsInformationPersistence.
			findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.VerificationRequestorsInformationModelImpl</code>.
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

		return verificationRequestorsInformationPersistence.
			findWithDynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return verificationRequestorsInformationPersistence.
			countWithDynamicQuery(dynamicQuery);
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

		return verificationRequestorsInformationPersistence.
			countWithDynamicQuery(dynamicQuery, projection);
	}

	@Override
	public VerificationRequestorsInformation
		fetchVerificationRequestorsInformation(
			VerificationRequestorsInformationPK
				verificationRequestorsInformationPK) {

		return verificationRequestorsInformationPersistence.fetchByPrimaryKey(
			verificationRequestorsInformationPK);
	}

	/**
	 * Returns the verification requestors information with the primary key.
	 *
	 * @param verificationRequestorsInformationPK the primary key of the verification requestors information
	 * @return the verification requestors information
	 * @throws PortalException if a verification requestors information with the primary key could not be found
	 */
	@Override
	public VerificationRequestorsInformation
			getVerificationRequestorsInformation(
				VerificationRequestorsInformationPK
					verificationRequestorsInformationPK)
		throws PortalException {

		return verificationRequestorsInformationPersistence.findByPrimaryKey(
			verificationRequestorsInformationPK);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			verificationRequestorsInformationLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(
			VerificationRequestorsInformation.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"primaryKey.requestorInformationId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			verificationRequestorsInformationLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			VerificationRequestorsInformation.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"primaryKey.requestorInformationId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			verificationRequestorsInformationLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(
			VerificationRequestorsInformation.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"primaryKey.requestorInformationId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return verificationRequestorsInformationPersistence.create(
			(VerificationRequestorsInformationPK)primaryKeyObj);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		return verificationRequestorsInformationLocalService.
			deleteVerificationRequestorsInformation(
				(VerificationRequestorsInformation)persistedModel);
	}

	@Override
	public BasePersistence<VerificationRequestorsInformation>
		getBasePersistence() {

		return verificationRequestorsInformationPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return verificationRequestorsInformationPersistence.findByPrimaryKey(
			primaryKeyObj);
	}

	/**
	 * Returns a range of all the verification requestors informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.VerificationRequestorsInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of verification requestors informations
	 * @param end the upper bound of the range of verification requestors informations (not inclusive)
	 * @return the range of verification requestors informations
	 */
	@Override
	public List<VerificationRequestorsInformation>
		getVerificationRequestorsInformations(int start, int end) {

		return verificationRequestorsInformationPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of verification requestors informations.
	 *
	 * @return the number of verification requestors informations
	 */
	@Override
	public int getVerificationRequestorsInformationsCount() {
		return verificationRequestorsInformationPersistence.countAll();
	}

	/**
	 * Updates the verification requestors information in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect VerificationRequestorsInformationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param verificationRequestorsInformation the verification requestors information
	 * @return the verification requestors information that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public VerificationRequestorsInformation
		updateVerificationRequestorsInformation(
			VerificationRequestorsInformation
				verificationRequestorsInformation) {

		return verificationRequestorsInformationPersistence.update(
			verificationRequestorsInformation);
	}

	@Deactivate
	protected void deactivate() {
		_setLocalServiceUtilService(null);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			VerificationRequestorsInformationLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		verificationRequestorsInformationLocalService =
			(VerificationRequestorsInformationLocalService)aopProxy;

		_setLocalServiceUtilService(
			verificationRequestorsInformationLocalService);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return VerificationRequestorsInformationLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return VerificationRequestorsInformation.class;
	}

	protected String getModelClassName() {
		return VerificationRequestorsInformation.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				verificationRequestorsInformationPersistence.getDataSource();

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

	private void _setLocalServiceUtilService(
		VerificationRequestorsInformationLocalService
			verificationRequestorsInformationLocalService) {

		try {
			Field field =
				VerificationRequestorsInformationLocalServiceUtil.class.
					getDeclaredField("_service");

			field.setAccessible(true);

			field.set(null, verificationRequestorsInformationLocalService);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
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

	@Reference
	protected MonthlyIncomePersistence monthlyIncomePersistence;

	@Reference
	protected NotUsedSecurityPersistence notUsedSecurityPersistence;

	@Reference
	protected OsiInsolvencyApplicationPersistence
		osiInsolvencyApplicationPersistence;

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

	protected VerificationRequestorsInformationLocalService
		verificationRequestorsInformationLocalService;

	@Reference
	protected VerificationRequestorsInformationPersistence
		verificationRequestorsInformationPersistence;

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

}