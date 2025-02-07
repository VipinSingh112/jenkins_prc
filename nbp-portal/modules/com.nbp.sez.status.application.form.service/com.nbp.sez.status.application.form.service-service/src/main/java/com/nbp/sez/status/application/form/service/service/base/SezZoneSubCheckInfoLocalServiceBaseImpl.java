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

import com.nbp.sez.status.application.form.service.model.SezZoneSubCheckInfo;
import com.nbp.sez.status.application.form.service.service.SezZoneSubCheckInfoLocalService;
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
 * Provides the base implementation for the sez zone sub check info local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.sez.status.application.form.service.service.impl.SezZoneSubCheckInfoLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.sez.status.application.form.service.service.impl.SezZoneSubCheckInfoLocalServiceImpl
 * @generated
 */
public abstract class SezZoneSubCheckInfoLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService,
			   SezZoneSubCheckInfoLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>SezZoneSubCheckInfoLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.sez.status.application.form.service.service.SezZoneSubCheckInfoLocalServiceUtil</code>.
	 */

	/**
	 * Adds the sez zone sub check info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneSubCheckInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneSubCheckInfo the sez zone sub check info
	 * @return the sez zone sub check info that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public SezZoneSubCheckInfo addSezZoneSubCheckInfo(
		SezZoneSubCheckInfo sezZoneSubCheckInfo) {

		sezZoneSubCheckInfo.setNew(true);

		return sezZoneSubCheckInfoPersistence.update(sezZoneSubCheckInfo);
	}

	/**
	 * Creates a new sez zone sub check info with the primary key. Does not add the sez zone sub check info to the database.
	 *
	 * @param sezZoneSubCheckInfoId the primary key for the new sez zone sub check info
	 * @return the new sez zone sub check info
	 */
	@Override
	@Transactional(enabled = false)
	public SezZoneSubCheckInfo createSezZoneSubCheckInfo(
		long sezZoneSubCheckInfoId) {

		return sezZoneSubCheckInfoPersistence.create(sezZoneSubCheckInfoId);
	}

	/**
	 * Deletes the sez zone sub check info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneSubCheckInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneSubCheckInfoId the primary key of the sez zone sub check info
	 * @return the sez zone sub check info that was removed
	 * @throws PortalException if a sez zone sub check info with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public SezZoneSubCheckInfo deleteSezZoneSubCheckInfo(
			long sezZoneSubCheckInfoId)
		throws PortalException {

		return sezZoneSubCheckInfoPersistence.remove(sezZoneSubCheckInfoId);
	}

	/**
	 * Deletes the sez zone sub check info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneSubCheckInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneSubCheckInfo the sez zone sub check info
	 * @return the sez zone sub check info that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public SezZoneSubCheckInfo deleteSezZoneSubCheckInfo(
		SezZoneSubCheckInfo sezZoneSubCheckInfo) {

		return sezZoneSubCheckInfoPersistence.remove(sezZoneSubCheckInfo);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return sezZoneSubCheckInfoPersistence.dslQuery(dslQuery);
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
			SezZoneSubCheckInfo.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return sezZoneSubCheckInfoPersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneSubCheckInfoModelImpl</code>.
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

		return sezZoneSubCheckInfoPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneSubCheckInfoModelImpl</code>.
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

		return sezZoneSubCheckInfoPersistence.findWithDynamicQuery(
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
		return sezZoneSubCheckInfoPersistence.countWithDynamicQuery(
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

		return sezZoneSubCheckInfoPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public SezZoneSubCheckInfo fetchSezZoneSubCheckInfo(
		long sezZoneSubCheckInfoId) {

		return sezZoneSubCheckInfoPersistence.fetchByPrimaryKey(
			sezZoneSubCheckInfoId);
	}

	/**
	 * Returns the sez zone sub check info with the primary key.
	 *
	 * @param sezZoneSubCheckInfoId the primary key of the sez zone sub check info
	 * @return the sez zone sub check info
	 * @throws PortalException if a sez zone sub check info with the primary key could not be found
	 */
	@Override
	public SezZoneSubCheckInfo getSezZoneSubCheckInfo(
			long sezZoneSubCheckInfoId)
		throws PortalException {

		return sezZoneSubCheckInfoPersistence.findByPrimaryKey(
			sezZoneSubCheckInfoId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			sezZoneSubCheckInfoLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(SezZoneSubCheckInfo.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"sezZoneSubCheckInfoId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			sezZoneSubCheckInfoLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			SezZoneSubCheckInfo.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"sezZoneSubCheckInfoId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			sezZoneSubCheckInfoLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(SezZoneSubCheckInfo.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"sezZoneSubCheckInfoId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return sezZoneSubCheckInfoPersistence.create(
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
				"Implement SezZoneSubCheckInfoLocalServiceImpl#deleteSezZoneSubCheckInfo(SezZoneSubCheckInfo) to avoid orphaned data");
		}

		return sezZoneSubCheckInfoLocalService.deleteSezZoneSubCheckInfo(
			(SezZoneSubCheckInfo)persistedModel);
	}

	@Override
	public BasePersistence<SezZoneSubCheckInfo> getBasePersistence() {
		return sezZoneSubCheckInfoPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return sezZoneSubCheckInfoPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the sez zone sub check infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneSubCheckInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone sub check infos
	 * @param end the upper bound of the range of sez zone sub check infos (not inclusive)
	 * @return the range of sez zone sub check infos
	 */
	@Override
	public List<SezZoneSubCheckInfo> getSezZoneSubCheckInfos(
		int start, int end) {

		return sezZoneSubCheckInfoPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of sez zone sub check infos.
	 *
	 * @return the number of sez zone sub check infos
	 */
	@Override
	public int getSezZoneSubCheckInfosCount() {
		return sezZoneSubCheckInfoPersistence.countAll();
	}

	/**
	 * Updates the sez zone sub check info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneSubCheckInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneSubCheckInfo the sez zone sub check info
	 * @return the sez zone sub check info that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public SezZoneSubCheckInfo updateSezZoneSubCheckInfo(
		SezZoneSubCheckInfo sezZoneSubCheckInfo) {

		return sezZoneSubCheckInfoPersistence.update(sezZoneSubCheckInfo);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			SezZoneSubCheckInfoLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		sezZoneSubCheckInfoLocalService =
			(SezZoneSubCheckInfoLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return SezZoneSubCheckInfoLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return SezZoneSubCheckInfo.class;
	}

	protected String getModelClassName() {
		return SezZoneSubCheckInfo.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				sezZoneSubCheckInfoPersistence.getDataSource();

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

	protected SezZoneSubCheckInfoLocalService sezZoneSubCheckInfoLocalService;

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
		SezZoneSubCheckInfoLocalServiceBaseImpl.class);

}