/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service.base;

import com.liferay.exportimport.kernel.lar.ExportImportHelperUtil;
import com.liferay.exportimport.kernel.lar.ManifestSummary;
import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.exportimport.kernel.lar.StagedModelDataHandlerUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;
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
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
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

import com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeBreadDownAddinfo;
import com.nbp.osi.services.application.form.service.service.OsiServicesTrusteeBreadDownAddinfoLocalService;
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
 * Provides the base implementation for the osi services trustee bread down addinfo local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.osi.services.application.form.service.service.impl.OsiServicesTrusteeBreadDownAddinfoLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.osi.services.application.form.service.service.impl.OsiServicesTrusteeBreadDownAddinfoLocalServiceImpl
 * @generated
 */
public abstract class OsiServicesTrusteeBreadDownAddinfoLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService,
			   OsiServicesTrusteeBreadDownAddinfoLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>OsiServicesTrusteeBreadDownAddinfoLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.osi.services.application.form.service.service.OsiServicesTrusteeBreadDownAddinfoLocalServiceUtil</code>.
	 */

	/**
	 * Adds the osi services trustee bread down addinfo to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesTrusteeBreadDownAddinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesTrusteeBreadDownAddinfo the osi services trustee bread down addinfo
	 * @return the osi services trustee bread down addinfo that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public OsiServicesTrusteeBreadDownAddinfo
		addOsiServicesTrusteeBreadDownAddinfo(
			OsiServicesTrusteeBreadDownAddinfo
				osiServicesTrusteeBreadDownAddinfo) {

		osiServicesTrusteeBreadDownAddinfo.setNew(true);

		return osiServicesTrusteeBreadDownAddinfoPersistence.update(
			osiServicesTrusteeBreadDownAddinfo);
	}

	/**
	 * Creates a new osi services trustee bread down addinfo with the primary key. Does not add the osi services trustee bread down addinfo to the database.
	 *
	 * @param osiTrusId the primary key for the new osi services trustee bread down addinfo
	 * @return the new osi services trustee bread down addinfo
	 */
	@Override
	@Transactional(enabled = false)
	public OsiServicesTrusteeBreadDownAddinfo
		createOsiServicesTrusteeBreadDownAddinfo(long osiTrusId) {

		return osiServicesTrusteeBreadDownAddinfoPersistence.create(osiTrusId);
	}

	/**
	 * Deletes the osi services trustee bread down addinfo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesTrusteeBreadDownAddinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiTrusId the primary key of the osi services trustee bread down addinfo
	 * @return the osi services trustee bread down addinfo that was removed
	 * @throws PortalException if a osi services trustee bread down addinfo with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public OsiServicesTrusteeBreadDownAddinfo
			deleteOsiServicesTrusteeBreadDownAddinfo(long osiTrusId)
		throws PortalException {

		return osiServicesTrusteeBreadDownAddinfoPersistence.remove(osiTrusId);
	}

	/**
	 * Deletes the osi services trustee bread down addinfo from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesTrusteeBreadDownAddinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesTrusteeBreadDownAddinfo the osi services trustee bread down addinfo
	 * @return the osi services trustee bread down addinfo that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public OsiServicesTrusteeBreadDownAddinfo
		deleteOsiServicesTrusteeBreadDownAddinfo(
			OsiServicesTrusteeBreadDownAddinfo
				osiServicesTrusteeBreadDownAddinfo) {

		return osiServicesTrusteeBreadDownAddinfoPersistence.remove(
			osiServicesTrusteeBreadDownAddinfo);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return osiServicesTrusteeBreadDownAddinfoPersistence.dslQuery(dslQuery);
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
			OsiServicesTrusteeBreadDownAddinfo.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return osiServicesTrusteeBreadDownAddinfoPersistence.
			findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesTrusteeBreadDownAddinfoModelImpl</code>.
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

		return osiServicesTrusteeBreadDownAddinfoPersistence.
			findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesTrusteeBreadDownAddinfoModelImpl</code>.
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

		return osiServicesTrusteeBreadDownAddinfoPersistence.
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
		return osiServicesTrusteeBreadDownAddinfoPersistence.
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

		return osiServicesTrusteeBreadDownAddinfoPersistence.
			countWithDynamicQuery(dynamicQuery, projection);
	}

	@Override
	public OsiServicesTrusteeBreadDownAddinfo
		fetchOsiServicesTrusteeBreadDownAddinfo(long osiTrusId) {

		return osiServicesTrusteeBreadDownAddinfoPersistence.fetchByPrimaryKey(
			osiTrusId);
	}

	/**
	 * Returns the osi services trustee bread down addinfo matching the UUID and group.
	 *
	 * @param uuid the osi services trustee bread down addinfo's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi services trustee bread down addinfo, or <code>null</code> if a matching osi services trustee bread down addinfo could not be found
	 */
	@Override
	public OsiServicesTrusteeBreadDownAddinfo
		fetchOsiServicesTrusteeBreadDownAddinfoByUuidAndGroupId(
			String uuid, long groupId) {

		return osiServicesTrusteeBreadDownAddinfoPersistence.fetchByUUID_G(
			uuid, groupId);
	}

	/**
	 * Returns the osi services trustee bread down addinfo with the primary key.
	 *
	 * @param osiTrusId the primary key of the osi services trustee bread down addinfo
	 * @return the osi services trustee bread down addinfo
	 * @throws PortalException if a osi services trustee bread down addinfo with the primary key could not be found
	 */
	@Override
	public OsiServicesTrusteeBreadDownAddinfo
			getOsiServicesTrusteeBreadDownAddinfo(long osiTrusId)
		throws PortalException {

		return osiServicesTrusteeBreadDownAddinfoPersistence.findByPrimaryKey(
			osiTrusId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			osiServicesTrusteeBreadDownAddinfoLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(
			OsiServicesTrusteeBreadDownAddinfo.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("osiTrusId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			osiServicesTrusteeBreadDownAddinfoLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			OsiServicesTrusteeBreadDownAddinfo.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName("osiTrusId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			osiServicesTrusteeBreadDownAddinfoLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(
			OsiServicesTrusteeBreadDownAddinfo.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("osiTrusId");
	}

	@Override
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		final PortletDataContext portletDataContext) {

		final ExportActionableDynamicQuery exportActionableDynamicQuery =
			new ExportActionableDynamicQuery() {

				@Override
				public long performCount() throws PortalException {
					ManifestSummary manifestSummary =
						portletDataContext.getManifestSummary();

					StagedModelType stagedModelType = getStagedModelType();

					long modelAdditionCount = super.performCount();

					manifestSummary.addModelAdditionCount(
						stagedModelType, modelAdditionCount);

					long modelDeletionCount =
						ExportImportHelperUtil.getModelDeletionCount(
							portletDataContext, stagedModelType);

					manifestSummary.addModelDeletionCount(
						stagedModelType, modelDeletionCount);

					return modelAdditionCount;
				}

			};

		initActionableDynamicQuery(exportActionableDynamicQuery);

		exportActionableDynamicQuery.setAddCriteriaMethod(
			new ActionableDynamicQuery.AddCriteriaMethod() {

				@Override
				public void addCriteria(DynamicQuery dynamicQuery) {
					portletDataContext.addDateRangeCriteria(
						dynamicQuery, "modifiedDate");
				}

			});

		exportActionableDynamicQuery.setCompanyId(
			portletDataContext.getCompanyId());

		exportActionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod
				<OsiServicesTrusteeBreadDownAddinfo>() {

				@Override
				public void performAction(
						OsiServicesTrusteeBreadDownAddinfo
							osiServicesTrusteeBreadDownAddinfo)
					throws PortalException {

					StagedModelDataHandlerUtil.exportStagedModel(
						portletDataContext, osiServicesTrusteeBreadDownAddinfo);
				}

			});
		exportActionableDynamicQuery.setStagedModelType(
			new StagedModelType(
				PortalUtil.getClassNameId(
					OsiServicesTrusteeBreadDownAddinfo.class.getName())));

		return exportActionableDynamicQuery;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return osiServicesTrusteeBreadDownAddinfoPersistence.create(
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
				"Implement OsiServicesTrusteeBreadDownAddinfoLocalServiceImpl#deleteOsiServicesTrusteeBreadDownAddinfo(OsiServicesTrusteeBreadDownAddinfo) to avoid orphaned data");
		}

		return osiServicesTrusteeBreadDownAddinfoLocalService.
			deleteOsiServicesTrusteeBreadDownAddinfo(
				(OsiServicesTrusteeBreadDownAddinfo)persistedModel);
	}

	@Override
	public BasePersistence<OsiServicesTrusteeBreadDownAddinfo>
		getBasePersistence() {

		return osiServicesTrusteeBreadDownAddinfoPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return osiServicesTrusteeBreadDownAddinfoPersistence.findByPrimaryKey(
			primaryKeyObj);
	}

	/**
	 * Returns all the osi services trustee bread down addinfos matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi services trustee bread down addinfos
	 * @param companyId the primary key of the company
	 * @return the matching osi services trustee bread down addinfos, or an empty list if no matches were found
	 */
	@Override
	public List<OsiServicesTrusteeBreadDownAddinfo>
		getOsiServicesTrusteeBreadDownAddinfosByUuidAndCompanyId(
			String uuid, long companyId) {

		return osiServicesTrusteeBreadDownAddinfoPersistence.findByUuid_C(
			uuid, companyId);
	}

	/**
	 * Returns a range of osi services trustee bread down addinfos matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi services trustee bread down addinfos
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of osi services trustee bread down addinfos
	 * @param end the upper bound of the range of osi services trustee bread down addinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching osi services trustee bread down addinfos, or an empty list if no matches were found
	 */
	@Override
	public List<OsiServicesTrusteeBreadDownAddinfo>
		getOsiServicesTrusteeBreadDownAddinfosByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<OsiServicesTrusteeBreadDownAddinfo>
				orderByComparator) {

		return osiServicesTrusteeBreadDownAddinfoPersistence.findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the osi services trustee bread down addinfo matching the UUID and group.
	 *
	 * @param uuid the osi services trustee bread down addinfo's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi services trustee bread down addinfo
	 * @throws PortalException if a matching osi services trustee bread down addinfo could not be found
	 */
	@Override
	public OsiServicesTrusteeBreadDownAddinfo
			getOsiServicesTrusteeBreadDownAddinfoByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException {

		return osiServicesTrusteeBreadDownAddinfoPersistence.findByUUID_G(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the osi services trustee bread down addinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesTrusteeBreadDownAddinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services trustee bread down addinfos
	 * @param end the upper bound of the range of osi services trustee bread down addinfos (not inclusive)
	 * @return the range of osi services trustee bread down addinfos
	 */
	@Override
	public List<OsiServicesTrusteeBreadDownAddinfo>
		getOsiServicesTrusteeBreadDownAddinfos(int start, int end) {

		return osiServicesTrusteeBreadDownAddinfoPersistence.findAll(
			start, end);
	}

	/**
	 * Returns the number of osi services trustee bread down addinfos.
	 *
	 * @return the number of osi services trustee bread down addinfos
	 */
	@Override
	public int getOsiServicesTrusteeBreadDownAddinfosCount() {
		return osiServicesTrusteeBreadDownAddinfoPersistence.countAll();
	}

	/**
	 * Updates the osi services trustee bread down addinfo in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesTrusteeBreadDownAddinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesTrusteeBreadDownAddinfo the osi services trustee bread down addinfo
	 * @return the osi services trustee bread down addinfo that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public OsiServicesTrusteeBreadDownAddinfo
		updateOsiServicesTrusteeBreadDownAddinfo(
			OsiServicesTrusteeBreadDownAddinfo
				osiServicesTrusteeBreadDownAddinfo) {

		return osiServicesTrusteeBreadDownAddinfoPersistence.update(
			osiServicesTrusteeBreadDownAddinfo);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			OsiServicesTrusteeBreadDownAddinfoLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		osiServicesTrusteeBreadDownAddinfoLocalService =
			(OsiServicesTrusteeBreadDownAddinfoLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return OsiServicesTrusteeBreadDownAddinfoLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return OsiServicesTrusteeBreadDownAddinfo.class;
	}

	protected String getModelClassName() {
		return OsiServicesTrusteeBreadDownAddinfo.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				osiServicesTrusteeBreadDownAddinfoPersistence.getDataSource();

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

	protected OsiServicesTrusteeBreadDownAddinfoLocalService
		osiServicesTrusteeBreadDownAddinfoLocalService;

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
		OsiServicesTrusteeBreadDownAddinfoLocalServiceBaseImpl.class);

}