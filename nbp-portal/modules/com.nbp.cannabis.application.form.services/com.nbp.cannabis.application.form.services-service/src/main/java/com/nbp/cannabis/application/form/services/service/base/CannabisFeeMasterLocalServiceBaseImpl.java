/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service.base;

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

import com.nbp.cannabis.application.form.services.model.CannabisFeeMaster;
import com.nbp.cannabis.application.form.services.service.CannabisFeeMasterLocalService;
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
 * Provides the base implementation for the cannabis fee master local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.cannabis.application.form.services.service.impl.CannabisFeeMasterLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.cannabis.application.form.services.service.impl.CannabisFeeMasterLocalServiceImpl
 * @generated
 */
public abstract class CannabisFeeMasterLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, CannabisFeeMasterLocalService,
			   IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>CannabisFeeMasterLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.cannabis.application.form.services.service.CannabisFeeMasterLocalServiceUtil</code>.
	 */

	/**
	 * Adds the cannabis fee master to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisFeeMasterLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisFeeMaster the cannabis fee master
	 * @return the cannabis fee master that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public CannabisFeeMaster addCannabisFeeMaster(
		CannabisFeeMaster cannabisFeeMaster) {

		cannabisFeeMaster.setNew(true);

		return cannabisFeeMasterPersistence.update(cannabisFeeMaster);
	}

	/**
	 * Creates a new cannabis fee master with the primary key. Does not add the cannabis fee master to the database.
	 *
	 * @param cannabisFeeMasterId the primary key for the new cannabis fee master
	 * @return the new cannabis fee master
	 */
	@Override
	@Transactional(enabled = false)
	public CannabisFeeMaster createCannabisFeeMaster(long cannabisFeeMasterId) {
		return cannabisFeeMasterPersistence.create(cannabisFeeMasterId);
	}

	/**
	 * Deletes the cannabis fee master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisFeeMasterLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisFeeMasterId the primary key of the cannabis fee master
	 * @return the cannabis fee master that was removed
	 * @throws PortalException if a cannabis fee master with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public CannabisFeeMaster deleteCannabisFeeMaster(long cannabisFeeMasterId)
		throws PortalException {

		return cannabisFeeMasterPersistence.remove(cannabisFeeMasterId);
	}

	/**
	 * Deletes the cannabis fee master from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisFeeMasterLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisFeeMaster the cannabis fee master
	 * @return the cannabis fee master that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public CannabisFeeMaster deleteCannabisFeeMaster(
		CannabisFeeMaster cannabisFeeMaster) {

		return cannabisFeeMasterPersistence.remove(cannabisFeeMaster);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return cannabisFeeMasterPersistence.dslQuery(dslQuery);
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
			CannabisFeeMaster.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return cannabisFeeMasterPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisFeeMasterModelImpl</code>.
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

		return cannabisFeeMasterPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisFeeMasterModelImpl</code>.
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

		return cannabisFeeMasterPersistence.findWithDynamicQuery(
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
		return cannabisFeeMasterPersistence.countWithDynamicQuery(dynamicQuery);
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

		return cannabisFeeMasterPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public CannabisFeeMaster fetchCannabisFeeMaster(long cannabisFeeMasterId) {
		return cannabisFeeMasterPersistence.fetchByPrimaryKey(
			cannabisFeeMasterId);
	}

	/**
	 * Returns the cannabis fee master with the primary key.
	 *
	 * @param cannabisFeeMasterId the primary key of the cannabis fee master
	 * @return the cannabis fee master
	 * @throws PortalException if a cannabis fee master with the primary key could not be found
	 */
	@Override
	public CannabisFeeMaster getCannabisFeeMaster(long cannabisFeeMasterId)
		throws PortalException {

		return cannabisFeeMasterPersistence.findByPrimaryKey(
			cannabisFeeMasterId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			cannabisFeeMasterLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(CannabisFeeMaster.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("cannabisFeeMasterId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			cannabisFeeMasterLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(CannabisFeeMaster.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"cannabisFeeMasterId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			cannabisFeeMasterLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(CannabisFeeMaster.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("cannabisFeeMasterId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return cannabisFeeMasterPersistence.create(
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
				"Implement CannabisFeeMasterLocalServiceImpl#deleteCannabisFeeMaster(CannabisFeeMaster) to avoid orphaned data");
		}

		return cannabisFeeMasterLocalService.deleteCannabisFeeMaster(
			(CannabisFeeMaster)persistedModel);
	}

	@Override
	public BasePersistence<CannabisFeeMaster> getBasePersistence() {
		return cannabisFeeMasterPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return cannabisFeeMasterPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the cannabis fee masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisFeeMasterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis fee masters
	 * @param end the upper bound of the range of cannabis fee masters (not inclusive)
	 * @return the range of cannabis fee masters
	 */
	@Override
	public List<CannabisFeeMaster> getCannabisFeeMasters(int start, int end) {
		return cannabisFeeMasterPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of cannabis fee masters.
	 *
	 * @return the number of cannabis fee masters
	 */
	@Override
	public int getCannabisFeeMastersCount() {
		return cannabisFeeMasterPersistence.countAll();
	}

	/**
	 * Updates the cannabis fee master in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisFeeMasterLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisFeeMaster the cannabis fee master
	 * @return the cannabis fee master that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public CannabisFeeMaster updateCannabisFeeMaster(
		CannabisFeeMaster cannabisFeeMaster) {

		return cannabisFeeMasterPersistence.update(cannabisFeeMaster);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			CannabisFeeMasterLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		cannabisFeeMasterLocalService = (CannabisFeeMasterLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return CannabisFeeMasterLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return CannabisFeeMaster.class;
	}

	protected String getModelClassName() {
		return CannabisFeeMaster.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				cannabisFeeMasterPersistence.getDataSource();

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

	protected CannabisFeeMasterLocalService cannabisFeeMasterLocalService;

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
		CannabisFeeMasterLocalServiceBaseImpl.class);

}