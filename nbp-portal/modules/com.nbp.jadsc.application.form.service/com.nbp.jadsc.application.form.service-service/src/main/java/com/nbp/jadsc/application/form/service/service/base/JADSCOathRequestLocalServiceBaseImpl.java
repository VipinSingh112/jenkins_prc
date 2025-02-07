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

import com.nbp.jadsc.application.form.service.model.JADSCOathRequest;
import com.nbp.jadsc.application.form.service.service.JADSCOathRequestLocalService;
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
 * Provides the base implementation for the jadsc oath request local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.jadsc.application.form.service.service.impl.JADSCOathRequestLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.jadsc.application.form.service.service.impl.JADSCOathRequestLocalServiceImpl
 * @generated
 */
public abstract class JADSCOathRequestLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService,
			   JADSCOathRequestLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>JADSCOathRequestLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.jadsc.application.form.service.service.JADSCOathRequestLocalServiceUtil</code>.
	 */

	/**
	 * Adds the jadsc oath request to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCOathRequestLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscOathRequest the jadsc oath request
	 * @return the jadsc oath request that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public JADSCOathRequest addJADSCOathRequest(
		JADSCOathRequest jadscOathRequest) {

		jadscOathRequest.setNew(true);

		return jadscOathRequestPersistence.update(jadscOathRequest);
	}

	/**
	 * Creates a new jadsc oath request with the primary key. Does not add the jadsc oath request to the database.
	 *
	 * @param jadscOathRequestId the primary key for the new jadsc oath request
	 * @return the new jadsc oath request
	 */
	@Override
	@Transactional(enabled = false)
	public JADSCOathRequest createJADSCOathRequest(long jadscOathRequestId) {
		return jadscOathRequestPersistence.create(jadscOathRequestId);
	}

	/**
	 * Deletes the jadsc oath request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCOathRequestLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscOathRequestId the primary key of the jadsc oath request
	 * @return the jadsc oath request that was removed
	 * @throws PortalException if a jadsc oath request with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public JADSCOathRequest deleteJADSCOathRequest(long jadscOathRequestId)
		throws PortalException {

		return jadscOathRequestPersistence.remove(jadscOathRequestId);
	}

	/**
	 * Deletes the jadsc oath request from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCOathRequestLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscOathRequest the jadsc oath request
	 * @return the jadsc oath request that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public JADSCOathRequest deleteJADSCOathRequest(
		JADSCOathRequest jadscOathRequest) {

		return jadscOathRequestPersistence.remove(jadscOathRequest);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return jadscOathRequestPersistence.dslQuery(dslQuery);
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
			JADSCOathRequest.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return jadscOathRequestPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCOathRequestModelImpl</code>.
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

		return jadscOathRequestPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCOathRequestModelImpl</code>.
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

		return jadscOathRequestPersistence.findWithDynamicQuery(
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
		return jadscOathRequestPersistence.countWithDynamicQuery(dynamicQuery);
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

		return jadscOathRequestPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public JADSCOathRequest fetchJADSCOathRequest(long jadscOathRequestId) {
		return jadscOathRequestPersistence.fetchByPrimaryKey(
			jadscOathRequestId);
	}

	/**
	 * Returns the jadsc oath request matching the UUID and group.
	 *
	 * @param uuid the jadsc oath request's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jadsc oath request, or <code>null</code> if a matching jadsc oath request could not be found
	 */
	@Override
	public JADSCOathRequest fetchJADSCOathRequestByUuidAndGroupId(
		String uuid, long groupId) {

		return jadscOathRequestPersistence.fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the jadsc oath request with the primary key.
	 *
	 * @param jadscOathRequestId the primary key of the jadsc oath request
	 * @return the jadsc oath request
	 * @throws PortalException if a jadsc oath request with the primary key could not be found
	 */
	@Override
	public JADSCOathRequest getJADSCOathRequest(long jadscOathRequestId)
		throws PortalException {

		return jadscOathRequestPersistence.findByPrimaryKey(jadscOathRequestId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			jadscOathRequestLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(JADSCOathRequest.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("jadscOathRequestId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			jadscOathRequestLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(JADSCOathRequest.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"jadscOathRequestId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			jadscOathRequestLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(JADSCOathRequest.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("jadscOathRequestId");
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
			new ActionableDynamicQuery.PerformActionMethod<JADSCOathRequest>() {

				@Override
				public void performAction(JADSCOathRequest jadscOathRequest)
					throws PortalException {

					StagedModelDataHandlerUtil.exportStagedModel(
						portletDataContext, jadscOathRequest);
				}

			});
		exportActionableDynamicQuery.setStagedModelType(
			new StagedModelType(
				PortalUtil.getClassNameId(JADSCOathRequest.class.getName())));

		return exportActionableDynamicQuery;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return jadscOathRequestPersistence.create(
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
				"Implement JADSCOathRequestLocalServiceImpl#deleteJADSCOathRequest(JADSCOathRequest) to avoid orphaned data");
		}

		return jadscOathRequestLocalService.deleteJADSCOathRequest(
			(JADSCOathRequest)persistedModel);
	}

	@Override
	public BasePersistence<JADSCOathRequest> getBasePersistence() {
		return jadscOathRequestPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return jadscOathRequestPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns all the jadsc oath requests matching the UUID and company.
	 *
	 * @param uuid the UUID of the jadsc oath requests
	 * @param companyId the primary key of the company
	 * @return the matching jadsc oath requests, or an empty list if no matches were found
	 */
	@Override
	public List<JADSCOathRequest> getJADSCOathRequestsByUuidAndCompanyId(
		String uuid, long companyId) {

		return jadscOathRequestPersistence.findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of jadsc oath requests matching the UUID and company.
	 *
	 * @param uuid the UUID of the jadsc oath requests
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of jadsc oath requests
	 * @param end the upper bound of the range of jadsc oath requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching jadsc oath requests, or an empty list if no matches were found
	 */
	@Override
	public List<JADSCOathRequest> getJADSCOathRequestsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JADSCOathRequest> orderByComparator) {

		return jadscOathRequestPersistence.findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the jadsc oath request matching the UUID and group.
	 *
	 * @param uuid the jadsc oath request's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jadsc oath request
	 * @throws PortalException if a matching jadsc oath request could not be found
	 */
	@Override
	public JADSCOathRequest getJADSCOathRequestByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return jadscOathRequestPersistence.findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns a range of all the jadsc oath requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCOathRequestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc oath requests
	 * @param end the upper bound of the range of jadsc oath requests (not inclusive)
	 * @return the range of jadsc oath requests
	 */
	@Override
	public List<JADSCOathRequest> getJADSCOathRequests(int start, int end) {
		return jadscOathRequestPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of jadsc oath requests.
	 *
	 * @return the number of jadsc oath requests
	 */
	@Override
	public int getJADSCOathRequestsCount() {
		return jadscOathRequestPersistence.countAll();
	}

	/**
	 * Updates the jadsc oath request in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCOathRequestLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscOathRequest the jadsc oath request
	 * @return the jadsc oath request that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public JADSCOathRequest updateJADSCOathRequest(
		JADSCOathRequest jadscOathRequest) {

		return jadscOathRequestPersistence.update(jadscOathRequest);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			JADSCOathRequestLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		jadscOathRequestLocalService = (JADSCOathRequestLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return JADSCOathRequestLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return JADSCOathRequest.class;
	}

	protected String getModelClassName() {
		return JADSCOathRequest.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = jadscOathRequestPersistence.getDataSource();

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

	protected JADSCOathRequestLocalService jadscOathRequestLocalService;

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
		JADSCOathRequestLocalServiceBaseImpl.class);

}