/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service.base;

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

import com.nbp.cannabis.application.form.services.model.CannabisApplicationCompanyAddress;
import com.nbp.cannabis.application.form.services.service.CannabisApplicationCompanyAddressLocalService;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisApplicationCompanyAddressPersistence;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisApplicationCompanyAuthorizedAgentPersistence;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisApplicationCompanyInfoPersistence;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisApplicationCurrentStagePersistence;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisApplicationIndividualAddressPersistence;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisApplicationIndividualInfoPersistence;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisApplicationPaymentPersistence;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisApplicationsPersistence;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisConsentByPropertyOwnerPersistence;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisConsentBySoleOwnerPersistence;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisDeclarationOfOwnershipPersistence;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisFeeMasterPersistence;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisOccupationaLicensePersistence;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisSupplementalInformationPersistence;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisSupportingDocumentsMasterPersistence;
import com.nbp.cannabis.application.form.services.service.persistence.GeneralDelarationsPersistence;
import com.nbp.cannabis.application.form.services.service.persistence.StatementOfFinancialHistoryPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the cannabis application company address local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.cannabis.application.form.services.service.impl.CannabisApplicationCompanyAddressLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.cannabis.application.form.services.service.impl.CannabisApplicationCompanyAddressLocalServiceImpl
 * @generated
 */
public abstract class CannabisApplicationCompanyAddressLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, CannabisApplicationCompanyAddressLocalService,
			   IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>CannabisApplicationCompanyAddressLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.cannabis.application.form.services.service.CannabisApplicationCompanyAddressLocalServiceUtil</code>.
	 */

	/**
	 * Adds the cannabis application company address to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationCompanyAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationCompanyAddress the cannabis application company address
	 * @return the cannabis application company address that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public CannabisApplicationCompanyAddress
		addCannabisApplicationCompanyAddress(
			CannabisApplicationCompanyAddress
				cannabisApplicationCompanyAddress) {

		cannabisApplicationCompanyAddress.setNew(true);

		return cannabisApplicationCompanyAddressPersistence.update(
			cannabisApplicationCompanyAddress);
	}

	/**
	 * Creates a new cannabis application company address with the primary key. Does not add the cannabis application company address to the database.
	 *
	 * @param companyAddressId the primary key for the new cannabis application company address
	 * @return the new cannabis application company address
	 */
	@Override
	@Transactional(enabled = false)
	public CannabisApplicationCompanyAddress
		createCannabisApplicationCompanyAddress(long companyAddressId) {

		return cannabisApplicationCompanyAddressPersistence.create(
			companyAddressId);
	}

	/**
	 * Deletes the cannabis application company address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationCompanyAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param companyAddressId the primary key of the cannabis application company address
	 * @return the cannabis application company address that was removed
	 * @throws PortalException if a cannabis application company address with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public CannabisApplicationCompanyAddress
			deleteCannabisApplicationCompanyAddress(long companyAddressId)
		throws PortalException {

		return cannabisApplicationCompanyAddressPersistence.remove(
			companyAddressId);
	}

	/**
	 * Deletes the cannabis application company address from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationCompanyAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationCompanyAddress the cannabis application company address
	 * @return the cannabis application company address that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public CannabisApplicationCompanyAddress
		deleteCannabisApplicationCompanyAddress(
			CannabisApplicationCompanyAddress
				cannabisApplicationCompanyAddress) {

		return cannabisApplicationCompanyAddressPersistence.remove(
			cannabisApplicationCompanyAddress);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return cannabisApplicationCompanyAddressPersistence.dslQuery(dslQuery);
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
			CannabisApplicationCompanyAddress.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return cannabisApplicationCompanyAddressPersistence.
			findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationCompanyAddressModelImpl</code>.
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

		return cannabisApplicationCompanyAddressPersistence.
			findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationCompanyAddressModelImpl</code>.
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

		return cannabisApplicationCompanyAddressPersistence.
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
		return cannabisApplicationCompanyAddressPersistence.
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

		return cannabisApplicationCompanyAddressPersistence.
			countWithDynamicQuery(dynamicQuery, projection);
	}

	@Override
	public CannabisApplicationCompanyAddress
		fetchCannabisApplicationCompanyAddress(long companyAddressId) {

		return cannabisApplicationCompanyAddressPersistence.fetchByPrimaryKey(
			companyAddressId);
	}

	/**
	 * Returns the cannabis application company address matching the UUID and group.
	 *
	 * @param uuid the cannabis application company address's UUID
	 * @param groupId the primary key of the group
	 * @return the matching cannabis application company address, or <code>null</code> if a matching cannabis application company address could not be found
	 */
	@Override
	public CannabisApplicationCompanyAddress
		fetchCannabisApplicationCompanyAddressByUuidAndGroupId(
			String uuid, long groupId) {

		return cannabisApplicationCompanyAddressPersistence.fetchByUUID_G(
			uuid, groupId);
	}

	/**
	 * Returns the cannabis application company address with the primary key.
	 *
	 * @param companyAddressId the primary key of the cannabis application company address
	 * @return the cannabis application company address
	 * @throws PortalException if a cannabis application company address with the primary key could not be found
	 */
	@Override
	public CannabisApplicationCompanyAddress
			getCannabisApplicationCompanyAddress(long companyAddressId)
		throws PortalException {

		return cannabisApplicationCompanyAddressPersistence.findByPrimaryKey(
			companyAddressId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			cannabisApplicationCompanyAddressLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(
			CannabisApplicationCompanyAddress.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("companyAddressId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			cannabisApplicationCompanyAddressLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			CannabisApplicationCompanyAddress.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"companyAddressId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			cannabisApplicationCompanyAddressLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(
			CannabisApplicationCompanyAddress.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("companyAddressId");
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
				<CannabisApplicationCompanyAddress>() {

				@Override
				public void performAction(
						CannabisApplicationCompanyAddress
							cannabisApplicationCompanyAddress)
					throws PortalException {

					StagedModelDataHandlerUtil.exportStagedModel(
						portletDataContext, cannabisApplicationCompanyAddress);
				}

			});
		exportActionableDynamicQuery.setStagedModelType(
			new StagedModelType(
				PortalUtil.getClassNameId(
					CannabisApplicationCompanyAddress.class.getName())));

		return exportActionableDynamicQuery;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return cannabisApplicationCompanyAddressPersistence.create(
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
				"Implement CannabisApplicationCompanyAddressLocalServiceImpl#deleteCannabisApplicationCompanyAddress(CannabisApplicationCompanyAddress) to avoid orphaned data");
		}

		return cannabisApplicationCompanyAddressLocalService.
			deleteCannabisApplicationCompanyAddress(
				(CannabisApplicationCompanyAddress)persistedModel);
	}

	@Override
	public BasePersistence<CannabisApplicationCompanyAddress>
		getBasePersistence() {

		return cannabisApplicationCompanyAddressPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return cannabisApplicationCompanyAddressPersistence.findByPrimaryKey(
			primaryKeyObj);
	}

	/**
	 * Returns all the cannabis application company addresses matching the UUID and company.
	 *
	 * @param uuid the UUID of the cannabis application company addresses
	 * @param companyId the primary key of the company
	 * @return the matching cannabis application company addresses, or an empty list if no matches were found
	 */
	@Override
	public List<CannabisApplicationCompanyAddress>
		getCannabisApplicationCompanyAddressesByUuidAndCompanyId(
			String uuid, long companyId) {

		return cannabisApplicationCompanyAddressPersistence.findByUuid_C(
			uuid, companyId);
	}

	/**
	 * Returns a range of cannabis application company addresses matching the UUID and company.
	 *
	 * @param uuid the UUID of the cannabis application company addresses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of cannabis application company addresses
	 * @param end the upper bound of the range of cannabis application company addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching cannabis application company addresses, or an empty list if no matches were found
	 */
	@Override
	public List<CannabisApplicationCompanyAddress>
		getCannabisApplicationCompanyAddressesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<CannabisApplicationCompanyAddress>
				orderByComparator) {

		return cannabisApplicationCompanyAddressPersistence.findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the cannabis application company address matching the UUID and group.
	 *
	 * @param uuid the cannabis application company address's UUID
	 * @param groupId the primary key of the group
	 * @return the matching cannabis application company address
	 * @throws PortalException if a matching cannabis application company address could not be found
	 */
	@Override
	public CannabisApplicationCompanyAddress
			getCannabisApplicationCompanyAddressByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException {

		return cannabisApplicationCompanyAddressPersistence.findByUUID_G(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the cannabis application company addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationCompanyAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application company addresses
	 * @param end the upper bound of the range of cannabis application company addresses (not inclusive)
	 * @return the range of cannabis application company addresses
	 */
	@Override
	public List<CannabisApplicationCompanyAddress>
		getCannabisApplicationCompanyAddresses(int start, int end) {

		return cannabisApplicationCompanyAddressPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of cannabis application company addresses.
	 *
	 * @return the number of cannabis application company addresses
	 */
	@Override
	public int getCannabisApplicationCompanyAddressesCount() {
		return cannabisApplicationCompanyAddressPersistence.countAll();
	}

	/**
	 * Updates the cannabis application company address in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationCompanyAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationCompanyAddress the cannabis application company address
	 * @return the cannabis application company address that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public CannabisApplicationCompanyAddress
		updateCannabisApplicationCompanyAddress(
			CannabisApplicationCompanyAddress
				cannabisApplicationCompanyAddress) {

		return cannabisApplicationCompanyAddressPersistence.update(
			cannabisApplicationCompanyAddress);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			CannabisApplicationCompanyAddressLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		cannabisApplicationCompanyAddressLocalService =
			(CannabisApplicationCompanyAddressLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return CannabisApplicationCompanyAddressLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return CannabisApplicationCompanyAddress.class;
	}

	protected String getModelClassName() {
		return CannabisApplicationCompanyAddress.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				cannabisApplicationCompanyAddressPersistence.getDataSource();

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

	protected CannabisApplicationCompanyAddressLocalService
		cannabisApplicationCompanyAddressLocalService;

	@Reference
	protected CannabisApplicationCompanyAddressPersistence
		cannabisApplicationCompanyAddressPersistence;

	@Reference
	protected CannabisApplicationCompanyAuthorizedAgentPersistence
		cannabisApplicationCompanyAuthorizedAgentPersistence;

	@Reference
	protected CannabisApplicationCompanyInfoPersistence
		cannabisApplicationCompanyInfoPersistence;

	@Reference
	protected CannabisApplicationCurrentStagePersistence
		cannabisApplicationCurrentStagePersistence;

	@Reference
	protected CannabisApplicationIndividualAddressPersistence
		cannabisApplicationIndividualAddressPersistence;

	@Reference
	protected CannabisApplicationIndividualInfoPersistence
		cannabisApplicationIndividualInfoPersistence;

	@Reference
	protected CannabisApplicationPaymentPersistence
		cannabisApplicationPaymentPersistence;

	@Reference
	protected CannabisApplicationsPersistence cannabisApplicationsPersistence;

	@Reference
	protected CannabisConsentByPropertyOwnerPersistence
		cannabisConsentByPropertyOwnerPersistence;

	@Reference
	protected CannabisConsentBySoleOwnerPersistence
		cannabisConsentBySoleOwnerPersistence;

	@Reference
	protected CannabisDeclarationOfOwnershipPersistence
		cannabisDeclarationOfOwnershipPersistence;

	@Reference
	protected CannabisFeeMasterPersistence cannabisFeeMasterPersistence;

	@Reference
	protected CannabisOccupationaLicensePersistence
		cannabisOccupationaLicensePersistence;

	@Reference
	protected CannabisSupplementalInformationPersistence
		cannabisSupplementalInformationPersistence;

	@Reference
	protected CannabisSupportingDocumentsMasterPersistence
		cannabisSupportingDocumentsMasterPersistence;

	@Reference
	protected GeneralDelarationsPersistence generalDelarationsPersistence;

	@Reference
	protected StatementOfFinancialHistoryPersistence
		statementOfFinancialHistoryPersistence;

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
		CannabisApplicationCompanyAddressLocalServiceBaseImpl.class);

}