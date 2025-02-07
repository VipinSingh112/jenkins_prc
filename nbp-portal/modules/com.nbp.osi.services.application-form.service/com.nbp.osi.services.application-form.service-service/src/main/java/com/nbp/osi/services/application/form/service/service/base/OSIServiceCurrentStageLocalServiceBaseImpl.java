/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service.base;

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

import com.nbp.osi.services.application.form.service.model.OSIServiceCurrentStage;
import com.nbp.osi.services.application.form.service.service.OSIServiceCurrentStageLocalService;
import com.nbp.osi.services.application.form.service.service.persistence.OSIServiceComSignPersistence;
import com.nbp.osi.services.application.form.service.service.persistence.OSIServiceCurrentStagePersistence;
import com.nbp.osi.services.application.form.service.service.persistence.OSIServiceSupportingDocIndPersistence;
import com.nbp.osi.services.application.form.service.service.persistence.OsiServicesAppPaymentPersistence;
import com.nbp.osi.services.application.form.service.service.persistence.OsiServicesApplicantinfoPersistence;
import com.nbp.osi.services.application.form.service.service.persistence.OsiServicesApplicationPersistence;
import com.nbp.osi.services.application.form.service.service.persistence.OsiServicesAssignmentDetailinfoPersistence;
import com.nbp.osi.services.application.form.service.service.persistence.OsiServicesGeneralBenefitOfCreditorsinfoPersistence;
import com.nbp.osi.services.application.form.service.service.persistence.OsiServicesInsolventPersoninfoPersistence;
import com.nbp.osi.services.application.form.service.service.persistence.OsiServicesTrusteeBreadDownAddinfoPersistence;
import com.nbp.osi.services.application.form.service.service.persistence.OsiServicesTrusteeCompanyinfoPersistence;
import com.nbp.osi.services.application.form.service.service.persistence.OsiServicesTrusteeDeclerationAndSignatureinfoPersistence;
import com.nbp.osi.services.application.form.service.service.persistence.OsiServicesTrusteeIndividualDetailinfoPersistence;
import com.nbp.osi.services.application.form.service.service.persistence.OsiServicesTrusteeIndividualQualificationinfoPersistence;
import com.nbp.osi.services.application.form.service.service.persistence.OsiServicesTrusteeLicenseBreakdowninfoPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the osi service current stage local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.osi.services.application.form.service.service.impl.OSIServiceCurrentStageLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.osi.services.application.form.service.service.impl.OSIServiceCurrentStageLocalServiceImpl
 * @generated
 */
public abstract class OSIServiceCurrentStageLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService,
			   OSIServiceCurrentStageLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>OSIServiceCurrentStageLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.osi.services.application.form.service.service.OSIServiceCurrentStageLocalServiceUtil</code>.
	 */

	/**
	 * Adds the osi service current stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OSIServiceCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServiceCurrentStage the osi service current stage
	 * @return the osi service current stage that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public OSIServiceCurrentStage addOSIServiceCurrentStage(
		OSIServiceCurrentStage osiServiceCurrentStage) {

		osiServiceCurrentStage.setNew(true);

		return osiServiceCurrentStagePersistence.update(osiServiceCurrentStage);
	}

	/**
	 * Creates a new osi service current stage with the primary key. Does not add the osi service current stage to the database.
	 *
	 * @param osiCurrentStageId the primary key for the new osi service current stage
	 * @return the new osi service current stage
	 */
	@Override
	@Transactional(enabled = false)
	public OSIServiceCurrentStage createOSIServiceCurrentStage(
		long osiCurrentStageId) {

		return osiServiceCurrentStagePersistence.create(osiCurrentStageId);
	}

	/**
	 * Deletes the osi service current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OSIServiceCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiCurrentStageId the primary key of the osi service current stage
	 * @return the osi service current stage that was removed
	 * @throws PortalException if a osi service current stage with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public OSIServiceCurrentStage deleteOSIServiceCurrentStage(
			long osiCurrentStageId)
		throws PortalException {

		return osiServiceCurrentStagePersistence.remove(osiCurrentStageId);
	}

	/**
	 * Deletes the osi service current stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OSIServiceCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServiceCurrentStage the osi service current stage
	 * @return the osi service current stage that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public OSIServiceCurrentStage deleteOSIServiceCurrentStage(
		OSIServiceCurrentStage osiServiceCurrentStage) {

		return osiServiceCurrentStagePersistence.remove(osiServiceCurrentStage);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return osiServiceCurrentStagePersistence.dslQuery(dslQuery);
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
			OSIServiceCurrentStage.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return osiServiceCurrentStagePersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OSIServiceCurrentStageModelImpl</code>.
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

		return osiServiceCurrentStagePersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OSIServiceCurrentStageModelImpl</code>.
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

		return osiServiceCurrentStagePersistence.findWithDynamicQuery(
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
		return osiServiceCurrentStagePersistence.countWithDynamicQuery(
			dynamicQuery);
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

		return osiServiceCurrentStagePersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public OSIServiceCurrentStage fetchOSIServiceCurrentStage(
		long osiCurrentStageId) {

		return osiServiceCurrentStagePersistence.fetchByPrimaryKey(
			osiCurrentStageId);
	}

	/**
	 * Returns the osi service current stage with the primary key.
	 *
	 * @param osiCurrentStageId the primary key of the osi service current stage
	 * @return the osi service current stage
	 * @throws PortalException if a osi service current stage with the primary key could not be found
	 */
	@Override
	public OSIServiceCurrentStage getOSIServiceCurrentStage(
			long osiCurrentStageId)
		throws PortalException {

		return osiServiceCurrentStagePersistence.findByPrimaryKey(
			osiCurrentStageId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			osiServiceCurrentStageLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(OSIServiceCurrentStage.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("osiCurrentStageId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			osiServiceCurrentStageLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			OSIServiceCurrentStage.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"osiCurrentStageId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			osiServiceCurrentStageLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(OSIServiceCurrentStage.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("osiCurrentStageId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return osiServiceCurrentStagePersistence.create(
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
				"Implement OSIServiceCurrentStageLocalServiceImpl#deleteOSIServiceCurrentStage(OSIServiceCurrentStage) to avoid orphaned data");
		}

		return osiServiceCurrentStageLocalService.deleteOSIServiceCurrentStage(
			(OSIServiceCurrentStage)persistedModel);
	}

	@Override
	public BasePersistence<OSIServiceCurrentStage> getBasePersistence() {
		return osiServiceCurrentStagePersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return osiServiceCurrentStagePersistence.findByPrimaryKey(
			primaryKeyObj);
	}

	/**
	 * Returns a range of all the osi service current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OSIServiceCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi service current stages
	 * @param end the upper bound of the range of osi service current stages (not inclusive)
	 * @return the range of osi service current stages
	 */
	@Override
	public List<OSIServiceCurrentStage> getOSIServiceCurrentStages(
		int start, int end) {

		return osiServiceCurrentStagePersistence.findAll(start, end);
	}

	/**
	 * Returns the number of osi service current stages.
	 *
	 * @return the number of osi service current stages
	 */
	@Override
	public int getOSIServiceCurrentStagesCount() {
		return osiServiceCurrentStagePersistence.countAll();
	}

	/**
	 * Updates the osi service current stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OSIServiceCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServiceCurrentStage the osi service current stage
	 * @return the osi service current stage that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public OSIServiceCurrentStage updateOSIServiceCurrentStage(
		OSIServiceCurrentStage osiServiceCurrentStage) {

		return osiServiceCurrentStagePersistence.update(osiServiceCurrentStage);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			OSIServiceCurrentStageLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		osiServiceCurrentStageLocalService =
			(OSIServiceCurrentStageLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return OSIServiceCurrentStageLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return OSIServiceCurrentStage.class;
	}

	protected String getModelClassName() {
		return OSIServiceCurrentStage.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				osiServiceCurrentStagePersistence.getDataSource();

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
	protected OSIServiceComSignPersistence osiServiceComSignPersistence;

	protected OSIServiceCurrentStageLocalService
		osiServiceCurrentStageLocalService;

	@Reference
	protected OSIServiceCurrentStagePersistence
		osiServiceCurrentStagePersistence;

	@Reference
	protected OsiServicesApplicantinfoPersistence
		osiServicesApplicantinfoPersistence;

	@Reference
	protected OsiServicesApplicationPersistence
		osiServicesApplicationPersistence;

	@Reference
	protected OsiServicesAppPaymentPersistence osiServicesAppPaymentPersistence;

	@Reference
	protected OsiServicesAssignmentDetailinfoPersistence
		osiServicesAssignmentDetailinfoPersistence;

	@Reference
	protected OsiServicesGeneralBenefitOfCreditorsinfoPersistence
		osiServicesGeneralBenefitOfCreditorsinfoPersistence;

	@Reference
	protected OsiServicesInsolventPersoninfoPersistence
		osiServicesInsolventPersoninfoPersistence;

	@Reference
	protected OsiServicesTrusteeBreadDownAddinfoPersistence
		osiServicesTrusteeBreadDownAddinfoPersistence;

	@Reference
	protected OsiServicesTrusteeCompanyinfoPersistence
		osiServicesTrusteeCompanyinfoPersistence;

	@Reference
	protected OsiServicesTrusteeDeclerationAndSignatureinfoPersistence
		osiServicesTrusteeDeclerationAndSignatureinfoPersistence;

	@Reference
	protected OsiServicesTrusteeIndividualDetailinfoPersistence
		osiServicesTrusteeIndividualDetailinfoPersistence;

	@Reference
	protected OsiServicesTrusteeIndividualQualificationinfoPersistence
		osiServicesTrusteeIndividualQualificationinfoPersistence;

	@Reference
	protected OsiServicesTrusteeLicenseBreakdowninfoPersistence
		osiServicesTrusteeLicenseBreakdowninfoPersistence;

	@Reference
	protected OSIServiceSupportingDocIndPersistence
		osiServiceSupportingDocIndPersistence;

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
		OSIServiceCurrentStageLocalServiceBaseImpl.class);

}