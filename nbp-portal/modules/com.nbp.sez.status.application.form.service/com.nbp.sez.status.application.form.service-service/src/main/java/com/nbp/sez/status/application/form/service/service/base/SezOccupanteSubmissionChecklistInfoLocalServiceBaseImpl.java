/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.base;

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

import com.nbp.sez.status.application.form.service.model.SezOccupanteSubmissionChecklistInfo;
import com.nbp.sez.status.application.form.service.service.SezOccupanteSubmissionChecklistInfoLocalService;
import com.nbp.sez.status.application.form.service.service.persistence.SezConsultancyInspectionPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezDevDisasterManagementAddPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezDevDisasterManagementPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezDevEmplomentInfoPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezDevEmployeeDefineOccuAddPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezDevEmployeeSafetyInfoAddPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezDevGenBusinessInfoAddPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezDevGeneralBusinessIfoPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezDevInvestmentAndFinancialPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezDevPropDevelopmentPlanPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezDevProposedProjectAddPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezDevProposedProjectPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezDevShareComDirectorShipAddPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezDevShareCorporationBusAddPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezDevShareDirectorAddPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezDevSharePleaseStateAddPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezDevSharePrincipalAddPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezDevShareholdingInfoPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezDeveloperDetailsPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezOccLocationAddPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezOccupantDirectorPartnerSponsorInfoPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezOccupantEmploymentInfoPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezOccupantExistingProposedProjectBriefInfoPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezOccupantGeneralBussinessAddressPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezOccupantGeneralBussinessInfoPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezOccupantInvestAndFinanceInfoPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezOccupantLocationAddBoxPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezOccupantPrincipleDirectorPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezOccupantPrincipleOfficerPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezOccupantProposedAreaDevelopmentPlanInfoPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezOccupantShareHoldingInfoPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezOccupantUserUndertakingInfoPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezOccupanteDeveloperUndertakingInfoPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezOccupanteSubmissionChecklistInfoPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezStatusAppPaymentPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezStatusApplicationCurrentStagePersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezStatusApplicationPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezStatusWFMLocationAddPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezStatusWorkFromHomePersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezZoneDevUnderInfoPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezZoneEmployInfoPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezZoneFinancialInfoPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezZoneGeneralBusinessInfoPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezZoneGeneralBussinessAddressPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezZoneLocationAddPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezZoneProposedProjectInfoPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezZoneSubCheckInfoPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezZoneUserUnderInfoPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.sezDeveloperUndertakingPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.sezSubmissionChecklistPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the sez occupante submission checklist info local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.sez.status.application.form.service.service.impl.SezOccupanteSubmissionChecklistInfoLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.sez.status.application.form.service.service.impl.SezOccupanteSubmissionChecklistInfoLocalServiceImpl
 * @generated
 */
public abstract class SezOccupanteSubmissionChecklistInfoLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService,
			   SezOccupanteSubmissionChecklistInfoLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>SezOccupanteSubmissionChecklistInfoLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.sez.status.application.form.service.service.SezOccupanteSubmissionChecklistInfoLocalServiceUtil</code>.
	 */

	/**
	 * Adds the sez occupante submission checklist info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupanteSubmissionChecklistInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccupanteSubmissionChecklistInfo the sez occupante submission checklist info
	 * @return the sez occupante submission checklist info that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public SezOccupanteSubmissionChecklistInfo
		addSezOccupanteSubmissionChecklistInfo(
			SezOccupanteSubmissionChecklistInfo
				sezOccupanteSubmissionChecklistInfo) {

		sezOccupanteSubmissionChecklistInfo.setNew(true);

		return sezOccupanteSubmissionChecklistInfoPersistence.update(
			sezOccupanteSubmissionChecklistInfo);
	}

	/**
	 * Creates a new sez occupante submission checklist info with the primary key. Does not add the sez occupante submission checklist info to the database.
	 *
	 * @param sezOccCheckSubmitId the primary key for the new sez occupante submission checklist info
	 * @return the new sez occupante submission checklist info
	 */
	@Override
	@Transactional(enabled = false)
	public SezOccupanteSubmissionChecklistInfo
		createSezOccupanteSubmissionChecklistInfo(long sezOccCheckSubmitId) {

		return sezOccupanteSubmissionChecklistInfoPersistence.create(
			sezOccCheckSubmitId);
	}

	/**
	 * Deletes the sez occupante submission checklist info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupanteSubmissionChecklistInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccCheckSubmitId the primary key of the sez occupante submission checklist info
	 * @return the sez occupante submission checklist info that was removed
	 * @throws PortalException if a sez occupante submission checklist info with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public SezOccupanteSubmissionChecklistInfo
			deleteSezOccupanteSubmissionChecklistInfo(long sezOccCheckSubmitId)
		throws PortalException {

		return sezOccupanteSubmissionChecklistInfoPersistence.remove(
			sezOccCheckSubmitId);
	}

	/**
	 * Deletes the sez occupante submission checklist info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupanteSubmissionChecklistInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccupanteSubmissionChecklistInfo the sez occupante submission checklist info
	 * @return the sez occupante submission checklist info that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public SezOccupanteSubmissionChecklistInfo
		deleteSezOccupanteSubmissionChecklistInfo(
			SezOccupanteSubmissionChecklistInfo
				sezOccupanteSubmissionChecklistInfo) {

		return sezOccupanteSubmissionChecklistInfoPersistence.remove(
			sezOccupanteSubmissionChecklistInfo);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return sezOccupanteSubmissionChecklistInfoPersistence.dslQuery(
			dslQuery);
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
			SezOccupanteSubmissionChecklistInfo.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return sezOccupanteSubmissionChecklistInfoPersistence.
			findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupanteSubmissionChecklistInfoModelImpl</code>.
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

		return sezOccupanteSubmissionChecklistInfoPersistence.
			findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupanteSubmissionChecklistInfoModelImpl</code>.
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

		return sezOccupanteSubmissionChecklistInfoPersistence.
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
		return sezOccupanteSubmissionChecklistInfoPersistence.
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

		return sezOccupanteSubmissionChecklistInfoPersistence.
			countWithDynamicQuery(dynamicQuery, projection);
	}

	@Override
	public SezOccupanteSubmissionChecklistInfo
		fetchSezOccupanteSubmissionChecklistInfo(long sezOccCheckSubmitId) {

		return sezOccupanteSubmissionChecklistInfoPersistence.fetchByPrimaryKey(
			sezOccCheckSubmitId);
	}

	/**
	 * Returns the sez occupante submission checklist info with the primary key.
	 *
	 * @param sezOccCheckSubmitId the primary key of the sez occupante submission checklist info
	 * @return the sez occupante submission checklist info
	 * @throws PortalException if a sez occupante submission checklist info with the primary key could not be found
	 */
	@Override
	public SezOccupanteSubmissionChecklistInfo
			getSezOccupanteSubmissionChecklistInfo(long sezOccCheckSubmitId)
		throws PortalException {

		return sezOccupanteSubmissionChecklistInfoPersistence.findByPrimaryKey(
			sezOccCheckSubmitId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			sezOccupanteSubmissionChecklistInfoLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(
			SezOccupanteSubmissionChecklistInfo.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("sezOccCheckSubmitId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			sezOccupanteSubmissionChecklistInfoLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			SezOccupanteSubmissionChecklistInfo.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"sezOccCheckSubmitId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			sezOccupanteSubmissionChecklistInfoLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(
			SezOccupanteSubmissionChecklistInfo.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("sezOccCheckSubmitId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return sezOccupanteSubmissionChecklistInfoPersistence.create(
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
				"Implement SezOccupanteSubmissionChecklistInfoLocalServiceImpl#deleteSezOccupanteSubmissionChecklistInfo(SezOccupanteSubmissionChecklistInfo) to avoid orphaned data");
		}

		return sezOccupanteSubmissionChecklistInfoLocalService.
			deleteSezOccupanteSubmissionChecklistInfo(
				(SezOccupanteSubmissionChecklistInfo)persistedModel);
	}

	@Override
	public BasePersistence<SezOccupanteSubmissionChecklistInfo>
		getBasePersistence() {

		return sezOccupanteSubmissionChecklistInfoPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return sezOccupanteSubmissionChecklistInfoPersistence.findByPrimaryKey(
			primaryKeyObj);
	}

	/**
	 * Returns a range of all the sez occupante submission checklist infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupanteSubmissionChecklistInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupante submission checklist infos
	 * @param end the upper bound of the range of sez occupante submission checklist infos (not inclusive)
	 * @return the range of sez occupante submission checklist infos
	 */
	@Override
	public List<SezOccupanteSubmissionChecklistInfo>
		getSezOccupanteSubmissionChecklistInfos(int start, int end) {

		return sezOccupanteSubmissionChecklistInfoPersistence.findAll(
			start, end);
	}

	/**
	 * Returns the number of sez occupante submission checklist infos.
	 *
	 * @return the number of sez occupante submission checklist infos
	 */
	@Override
	public int getSezOccupanteSubmissionChecklistInfosCount() {
		return sezOccupanteSubmissionChecklistInfoPersistence.countAll();
	}

	/**
	 * Updates the sez occupante submission checklist info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupanteSubmissionChecklistInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccupanteSubmissionChecklistInfo the sez occupante submission checklist info
	 * @return the sez occupante submission checklist info that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public SezOccupanteSubmissionChecklistInfo
		updateSezOccupanteSubmissionChecklistInfo(
			SezOccupanteSubmissionChecklistInfo
				sezOccupanteSubmissionChecklistInfo) {

		return sezOccupanteSubmissionChecklistInfoPersistence.update(
			sezOccupanteSubmissionChecklistInfo);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			SezOccupanteSubmissionChecklistInfoLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		sezOccupanteSubmissionChecklistInfoLocalService =
			(SezOccupanteSubmissionChecklistInfoLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return SezOccupanteSubmissionChecklistInfoLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return SezOccupanteSubmissionChecklistInfo.class;
	}

	protected String getModelClassName() {
		return SezOccupanteSubmissionChecklistInfo.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				sezOccupanteSubmissionChecklistInfoPersistence.getDataSource();

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
	protected SezConsultancyInspectionPersistence
		sezConsultancyInspectionPersistence;

	@Reference
	protected SezDevDisasterManagementPersistence
		sezDevDisasterManagementPersistence;

	@Reference
	protected SezDevDisasterManagementAddPersistence
		sezDevDisasterManagementAddPersistence;

	@Reference
	protected SezDeveloperDetailsPersistence sezDeveloperDetailsPersistence;

	@Reference
	protected sezDeveloperUndertakingPersistence
		sezDeveloperUndertakingPersistence;

	@Reference
	protected SezDevEmplomentInfoPersistence sezDevEmplomentInfoPersistence;

	@Reference
	protected SezDevEmployeeDefineOccuAddPersistence
		sezDevEmployeeDefineOccuAddPersistence;

	@Reference
	protected SezDevEmployeeSafetyInfoAddPersistence
		sezDevEmployeeSafetyInfoAddPersistence;

	@Reference
	protected SezDevGenBusinessInfoAddPersistence
		sezDevGenBusinessInfoAddPersistence;

	@Reference
	protected SezDevGeneralBusinessIfoPersistence
		sezDevGeneralBusinessIfoPersistence;

	@Reference
	protected SezDevInvestmentAndFinancialPersistence
		sezDevInvestmentAndFinancialPersistence;

	@Reference
	protected SezDevPropDevelopmentPlanPersistence
		sezDevPropDevelopmentPlanPersistence;

	@Reference
	protected SezDevProposedProjectPersistence sezDevProposedProjectPersistence;

	@Reference
	protected SezDevProposedProjectAddPersistence
		sezDevProposedProjectAddPersistence;

	@Reference
	protected SezDevShareComDirectorShipAddPersistence
		sezDevShareComDirectorShipAddPersistence;

	@Reference
	protected SezDevShareCorporationBusAddPersistence
		sezDevShareCorporationBusAddPersistence;

	@Reference
	protected SezDevShareDirectorAddPersistence
		sezDevShareDirectorAddPersistence;

	@Reference
	protected SezDevShareholdingInfoPersistence
		sezDevShareholdingInfoPersistence;

	@Reference
	protected SezDevSharePleaseStateAddPersistence
		sezDevSharePleaseStateAddPersistence;

	@Reference
	protected SezDevSharePrincipalAddPersistence
		sezDevSharePrincipalAddPersistence;

	@Reference
	protected SezOccLocationAddPersistence sezOccLocationAddPersistence;

	@Reference
	protected SezOccupantDirectorPartnerSponsorInfoPersistence
		sezOccupantDirectorPartnerSponsorInfoPersistence;

	@Reference
	protected SezOccupanteDeveloperUndertakingInfoPersistence
		sezOccupanteDeveloperUndertakingInfoPersistence;

	@Reference
	protected SezOccupantEmploymentInfoPersistence
		sezOccupantEmploymentInfoPersistence;

	protected SezOccupanteSubmissionChecklistInfoLocalService
		sezOccupanteSubmissionChecklistInfoLocalService;

	@Reference
	protected SezOccupanteSubmissionChecklistInfoPersistence
		sezOccupanteSubmissionChecklistInfoPersistence;

	@Reference
	protected SezOccupantExistingProposedProjectBriefInfoPersistence
		sezOccupantExistingProposedProjectBriefInfoPersistence;

	@Reference
	protected SezOccupantGeneralBussinessAddressPersistence
		sezOccupantGeneralBussinessAddressPersistence;

	@Reference
	protected SezOccupantGeneralBussinessInfoPersistence
		sezOccupantGeneralBussinessInfoPersistence;

	@Reference
	protected SezOccupantInvestAndFinanceInfoPersistence
		sezOccupantInvestAndFinanceInfoPersistence;

	@Reference
	protected SezOccupantLocationAddBoxPersistence
		sezOccupantLocationAddBoxPersistence;

	@Reference
	protected SezOccupantPrincipleDirectorPersistence
		sezOccupantPrincipleDirectorPersistence;

	@Reference
	protected SezOccupantPrincipleOfficerPersistence
		sezOccupantPrincipleOfficerPersistence;

	@Reference
	protected SezOccupantProposedAreaDevelopmentPlanInfoPersistence
		sezOccupantProposedAreaDevelopmentPlanInfoPersistence;

	@Reference
	protected SezOccupantShareHoldingInfoPersistence
		sezOccupantShareHoldingInfoPersistence;

	@Reference
	protected SezOccupantUserUndertakingInfoPersistence
		sezOccupantUserUndertakingInfoPersistence;

	@Reference
	protected SezStatusApplicationPersistence sezStatusApplicationPersistence;

	@Reference
	protected SezStatusApplicationCurrentStagePersistence
		sezStatusApplicationCurrentStagePersistence;

	@Reference
	protected SezStatusAppPaymentPersistence sezStatusAppPaymentPersistence;

	@Reference
	protected SezStatusWFMLocationAddPersistence
		sezStatusWFMLocationAddPersistence;

	@Reference
	protected SezStatusWorkFromHomePersistence sezStatusWorkFromHomePersistence;

	@Reference
	protected sezSubmissionChecklistPersistence
		sezSubmissionChecklistPersistence;

	@Reference
	protected SezZoneDevUnderInfoPersistence sezZoneDevUnderInfoPersistence;

	@Reference
	protected SezZoneEmployInfoPersistence sezZoneEmployInfoPersistence;

	@Reference
	protected SezZoneFinancialInfoPersistence sezZoneFinancialInfoPersistence;

	@Reference
	protected SezZoneGeneralBusinessInfoPersistence
		sezZoneGeneralBusinessInfoPersistence;

	@Reference
	protected SezZoneGeneralBussinessAddressPersistence
		sezZoneGeneralBussinessAddressPersistence;

	@Reference
	protected SezZoneLocationAddPersistence sezZoneLocationAddPersistence;

	@Reference
	protected SezZoneProposedProjectInfoPersistence
		sezZoneProposedProjectInfoPersistence;

	@Reference
	protected SezZoneSubCheckInfoPersistence sezZoneSubCheckInfoPersistence;

	@Reference
	protected SezZoneUserUnderInfoPersistence sezZoneUserUnderInfoPersistence;

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
		SezOccupanteSubmissionChecklistInfoLocalServiceBaseImpl.class);

}