/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.service.base;

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

import com.nbp.jadsc.application.form.service.model.JADSCApplication;
import com.nbp.jadsc.application.form.service.service.JADSCApplicationLocalService;
import com.nbp.jadsc.application.form.service.service.persistence.JADSCApplicationPersistence;
import com.nbp.jadsc.application.form.service.service.persistence.JADSCCertificateOfServiceAddFormPersistence;
import com.nbp.jadsc.application.form.service.service.persistence.JADSCCertificateOfServicePersistence;
import com.nbp.jadsc.application.form.service.service.persistence.JADSCCertificateOfVeracityPersistence;
import com.nbp.jadsc.application.form.service.service.persistence.JADSCChecklistAddPersistence;
import com.nbp.jadsc.application.form.service.service.persistence.JADSCChecklistPersistence;
import com.nbp.jadsc.application.form.service.service.persistence.JADSCCurrentStagePersistence;
import com.nbp.jadsc.application.form.service.service.persistence.JADSCInformationRequestPersistence;
import com.nbp.jadsc.application.form.service.service.persistence.JADSCNoticeOfAppearancePersistence;
import com.nbp.jadsc.application.form.service.service.persistence.JADSCOathRequestPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the jadsc application local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.jadsc.application.form.service.service.impl.JADSCApplicationLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.jadsc.application.form.service.service.impl.JADSCApplicationLocalServiceImpl
 * @generated
 */
public abstract class JADSCApplicationLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService,
			   JADSCApplicationLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>JADSCApplicationLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.jadsc.application.form.service.service.JADSCApplicationLocalServiceUtil</code>.
	 */

	/**
	 * Adds the jadsc application to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscApplication the jadsc application
	 * @return the jadsc application that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public JADSCApplication addJADSCApplication(
		JADSCApplication jadscApplication) {

		jadscApplication.setNew(true);

		return jadscApplicationPersistence.update(jadscApplication);
	}

	/**
	 * Creates a new jadsc application with the primary key. Does not add the jadsc application to the database.
	 *
	 * @param jadscApplicationId the primary key for the new jadsc application
	 * @return the new jadsc application
	 */
	@Override
	@Transactional(enabled = false)
	public JADSCApplication createJADSCApplication(long jadscApplicationId) {
		return jadscApplicationPersistence.create(jadscApplicationId);
	}

	/**
	 * Deletes the jadsc application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscApplicationId the primary key of the jadsc application
	 * @return the jadsc application that was removed
	 * @throws PortalException if a jadsc application with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public JADSCApplication deleteJADSCApplication(long jadscApplicationId)
		throws PortalException {

		return jadscApplicationPersistence.remove(jadscApplicationId);
	}

	/**
	 * Deletes the jadsc application from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscApplication the jadsc application
	 * @return the jadsc application that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public JADSCApplication deleteJADSCApplication(
		JADSCApplication jadscApplication) {

		return jadscApplicationPersistence.remove(jadscApplication);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return jadscApplicationPersistence.dslQuery(dslQuery);
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
			JADSCApplication.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return jadscApplicationPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCApplicationModelImpl</code>.
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

		return jadscApplicationPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCApplicationModelImpl</code>.
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

		return jadscApplicationPersistence.findWithDynamicQuery(
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
		return jadscApplicationPersistence.countWithDynamicQuery(dynamicQuery);
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

		return jadscApplicationPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public JADSCApplication fetchJADSCApplication(long jadscApplicationId) {
		return jadscApplicationPersistence.fetchByPrimaryKey(
			jadscApplicationId);
	}

	/**
	 * Returns the jadsc application matching the UUID and group.
	 *
	 * @param uuid the jadsc application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	@Override
	public JADSCApplication fetchJADSCApplicationByUuidAndGroupId(
		String uuid, long groupId) {

		return jadscApplicationPersistence.fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the jadsc application with the primary key.
	 *
	 * @param jadscApplicationId the primary key of the jadsc application
	 * @return the jadsc application
	 * @throws PortalException if a jadsc application with the primary key could not be found
	 */
	@Override
	public JADSCApplication getJADSCApplication(long jadscApplicationId)
		throws PortalException {

		return jadscApplicationPersistence.findByPrimaryKey(jadscApplicationId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			jadscApplicationLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(JADSCApplication.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("jadscApplicationId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			jadscApplicationLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(JADSCApplication.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"jadscApplicationId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			jadscApplicationLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(JADSCApplication.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("jadscApplicationId");
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
			new ActionableDynamicQuery.PerformActionMethod<JADSCApplication>() {

				@Override
				public void performAction(JADSCApplication jadscApplication)
					throws PortalException {

					StagedModelDataHandlerUtil.exportStagedModel(
						portletDataContext, jadscApplication);
				}

			});
		exportActionableDynamicQuery.setStagedModelType(
			new StagedModelType(
				PortalUtil.getClassNameId(JADSCApplication.class.getName())));

		return exportActionableDynamicQuery;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return jadscApplicationPersistence.create(
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
				"Implement JADSCApplicationLocalServiceImpl#deleteJADSCApplication(JADSCApplication) to avoid orphaned data");
		}

		return jadscApplicationLocalService.deleteJADSCApplication(
			(JADSCApplication)persistedModel);
	}

	@Override
	public BasePersistence<JADSCApplication> getBasePersistence() {
		return jadscApplicationPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return jadscApplicationPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns all the jadsc applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the jadsc applications
	 * @param companyId the primary key of the company
	 * @return the matching jadsc applications, or an empty list if no matches were found
	 */
	@Override
	public List<JADSCApplication> getJADSCApplicationsByUuidAndCompanyId(
		String uuid, long companyId) {

		return jadscApplicationPersistence.findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of jadsc applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the jadsc applications
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching jadsc applications, or an empty list if no matches were found
	 */
	@Override
	public List<JADSCApplication> getJADSCApplicationsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JADSCApplication> orderByComparator) {

		return jadscApplicationPersistence.findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the jadsc application matching the UUID and group.
	 *
	 * @param uuid the jadsc application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jadsc application
	 * @throws PortalException if a matching jadsc application could not be found
	 */
	@Override
	public JADSCApplication getJADSCApplicationByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return jadscApplicationPersistence.findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns a range of all the jadsc applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @return the range of jadsc applications
	 */
	@Override
	public List<JADSCApplication> getJADSCApplications(int start, int end) {
		return jadscApplicationPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of jadsc applications.
	 *
	 * @return the number of jadsc applications
	 */
	@Override
	public int getJADSCApplicationsCount() {
		return jadscApplicationPersistence.countAll();
	}

	/**
	 * Updates the jadsc application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscApplication the jadsc application
	 * @return the jadsc application that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public JADSCApplication updateJADSCApplication(
		JADSCApplication jadscApplication) {

		return jadscApplicationPersistence.update(jadscApplication);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			JADSCApplicationLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		jadscApplicationLocalService = (JADSCApplicationLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return JADSCApplicationLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return JADSCApplication.class;
	}

	protected String getModelClassName() {
		return JADSCApplication.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = jadscApplicationPersistence.getDataSource();

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

	protected JADSCApplicationLocalService jadscApplicationLocalService;

	@Reference
	protected JADSCApplicationPersistence jadscApplicationPersistence;

	@Reference
	protected JADSCCertificateOfServicePersistence
		jadscCertificateOfServicePersistence;

	@Reference
	protected JADSCCertificateOfServiceAddFormPersistence
		jadscCertificateOfServiceAddFormPersistence;

	@Reference
	protected JADSCCertificateOfVeracityPersistence
		jadscCertificateOfVeracityPersistence;

	@Reference
	protected JADSCChecklistPersistence jadscChecklistPersistence;

	@Reference
	protected JADSCChecklistAddPersistence jadscChecklistAddPersistence;

	@Reference
	protected JADSCCurrentStagePersistence jadscCurrentStagePersistence;

	@Reference
	protected JADSCInformationRequestPersistence
		jadscInformationRequestPersistence;

	@Reference
	protected JADSCNoticeOfAppearancePersistence
		jadscNoticeOfAppearancePersistence;

	@Reference
	protected JADSCOathRequestPersistence jadscOathRequestPersistence;

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
		JADSCApplicationLocalServiceBaseImpl.class);

}