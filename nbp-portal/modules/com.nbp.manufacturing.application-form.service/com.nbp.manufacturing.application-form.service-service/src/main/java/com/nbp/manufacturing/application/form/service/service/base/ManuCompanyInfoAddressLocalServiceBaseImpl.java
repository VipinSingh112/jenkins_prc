/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service.base;

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

import com.nbp.manufacturing.application.form.service.model.ManuCompanyInfoAddress;
import com.nbp.manufacturing.application.form.service.service.ManuCompanyInfoAddressLocalService;
import com.nbp.manufacturing.application.form.service.service.persistence.ManuAdditionalCompanyInfoPersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.ManuApplicationCurrentStagePersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.ManuCompanyInfoAddressPersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.ManuCompanyInfoPersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.ManuEquipmentAddPersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.ManuEquipmentPersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.ManuExportDataPersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.ManuInternationalCertificatePersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.ManufacturingApplicationPersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.PackagingProcessPersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.ProductionProcessPersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.ProductiveInputsFormAddPersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.ProductiveInputsFormPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the manu company info address local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.manufacturing.application.form.service.service.impl.ManuCompanyInfoAddressLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.manufacturing.application.form.service.service.impl.ManuCompanyInfoAddressLocalServiceImpl
 * @generated
 */
public abstract class ManuCompanyInfoAddressLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService,
			   ManuCompanyInfoAddressLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>ManuCompanyInfoAddressLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.manufacturing.application.form.service.service.ManuCompanyInfoAddressLocalServiceUtil</code>.
	 */

	/**
	 * Adds the manu company info address to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuCompanyInfoAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuCompanyInfoAddress the manu company info address
	 * @return the manu company info address that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public ManuCompanyInfoAddress addManuCompanyInfoAddress(
		ManuCompanyInfoAddress manuCompanyInfoAddress) {

		manuCompanyInfoAddress.setNew(true);

		return manuCompanyInfoAddressPersistence.update(manuCompanyInfoAddress);
	}

	/**
	 * Creates a new manu company info address with the primary key. Does not add the manu company info address to the database.
	 *
	 * @param manuCompanyInfoAddressId the primary key for the new manu company info address
	 * @return the new manu company info address
	 */
	@Override
	@Transactional(enabled = false)
	public ManuCompanyInfoAddress createManuCompanyInfoAddress(
		long manuCompanyInfoAddressId) {

		return manuCompanyInfoAddressPersistence.create(
			manuCompanyInfoAddressId);
	}

	/**
	 * Deletes the manu company info address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuCompanyInfoAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuCompanyInfoAddressId the primary key of the manu company info address
	 * @return the manu company info address that was removed
	 * @throws PortalException if a manu company info address with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public ManuCompanyInfoAddress deleteManuCompanyInfoAddress(
			long manuCompanyInfoAddressId)
		throws PortalException {

		return manuCompanyInfoAddressPersistence.remove(
			manuCompanyInfoAddressId);
	}

	/**
	 * Deletes the manu company info address from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuCompanyInfoAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuCompanyInfoAddress the manu company info address
	 * @return the manu company info address that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public ManuCompanyInfoAddress deleteManuCompanyInfoAddress(
		ManuCompanyInfoAddress manuCompanyInfoAddress) {

		return manuCompanyInfoAddressPersistence.remove(manuCompanyInfoAddress);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return manuCompanyInfoAddressPersistence.dslQuery(dslQuery);
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
			ManuCompanyInfoAddress.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return manuCompanyInfoAddressPersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ManuCompanyInfoAddressModelImpl</code>.
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

		return manuCompanyInfoAddressPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ManuCompanyInfoAddressModelImpl</code>.
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

		return manuCompanyInfoAddressPersistence.findWithDynamicQuery(
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
		return manuCompanyInfoAddressPersistence.countWithDynamicQuery(
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

		return manuCompanyInfoAddressPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public ManuCompanyInfoAddress fetchManuCompanyInfoAddress(
		long manuCompanyInfoAddressId) {

		return manuCompanyInfoAddressPersistence.fetchByPrimaryKey(
			manuCompanyInfoAddressId);
	}

	/**
	 * Returns the manu company info address with the primary key.
	 *
	 * @param manuCompanyInfoAddressId the primary key of the manu company info address
	 * @return the manu company info address
	 * @throws PortalException if a manu company info address with the primary key could not be found
	 */
	@Override
	public ManuCompanyInfoAddress getManuCompanyInfoAddress(
			long manuCompanyInfoAddressId)
		throws PortalException {

		return manuCompanyInfoAddressPersistence.findByPrimaryKey(
			manuCompanyInfoAddressId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			manuCompanyInfoAddressLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(ManuCompanyInfoAddress.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"manuCompanyInfoAddressId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			manuCompanyInfoAddressLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			ManuCompanyInfoAddress.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"manuCompanyInfoAddressId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			manuCompanyInfoAddressLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(ManuCompanyInfoAddress.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"manuCompanyInfoAddressId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return manuCompanyInfoAddressPersistence.create(
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
				"Implement ManuCompanyInfoAddressLocalServiceImpl#deleteManuCompanyInfoAddress(ManuCompanyInfoAddress) to avoid orphaned data");
		}

		return manuCompanyInfoAddressLocalService.deleteManuCompanyInfoAddress(
			(ManuCompanyInfoAddress)persistedModel);
	}

	@Override
	public BasePersistence<ManuCompanyInfoAddress> getBasePersistence() {
		return manuCompanyInfoAddressPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return manuCompanyInfoAddressPersistence.findByPrimaryKey(
			primaryKeyObj);
	}

	/**
	 * Returns a range of all the manu company info addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ManuCompanyInfoAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu company info addresses
	 * @param end the upper bound of the range of manu company info addresses (not inclusive)
	 * @return the range of manu company info addresses
	 */
	@Override
	public List<ManuCompanyInfoAddress> getManuCompanyInfoAddresses(
		int start, int end) {

		return manuCompanyInfoAddressPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of manu company info addresses.
	 *
	 * @return the number of manu company info addresses
	 */
	@Override
	public int getManuCompanyInfoAddressesCount() {
		return manuCompanyInfoAddressPersistence.countAll();
	}

	/**
	 * Updates the manu company info address in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuCompanyInfoAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuCompanyInfoAddress the manu company info address
	 * @return the manu company info address that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public ManuCompanyInfoAddress updateManuCompanyInfoAddress(
		ManuCompanyInfoAddress manuCompanyInfoAddress) {

		return manuCompanyInfoAddressPersistence.update(manuCompanyInfoAddress);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			ManuCompanyInfoAddressLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		manuCompanyInfoAddressLocalService =
			(ManuCompanyInfoAddressLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return ManuCompanyInfoAddressLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return ManuCompanyInfoAddress.class;
	}

	protected String getModelClassName() {
		return ManuCompanyInfoAddress.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				manuCompanyInfoAddressPersistence.getDataSource();

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
	protected ManuAdditionalCompanyInfoPersistence
		manuAdditionalCompanyInfoPersistence;

	@Reference
	protected ManuApplicationCurrentStagePersistence
		manuApplicationCurrentStagePersistence;

	@Reference
	protected ManuCompanyInfoPersistence manuCompanyInfoPersistence;

	protected ManuCompanyInfoAddressLocalService
		manuCompanyInfoAddressLocalService;

	@Reference
	protected ManuCompanyInfoAddressPersistence
		manuCompanyInfoAddressPersistence;

	@Reference
	protected ManuEquipmentPersistence manuEquipmentPersistence;

	@Reference
	protected ManuEquipmentAddPersistence manuEquipmentAddPersistence;

	@Reference
	protected ManuExportDataPersistence manuExportDataPersistence;

	@Reference
	protected ManufacturingApplicationPersistence
		manufacturingApplicationPersistence;

	@Reference
	protected ManuInternationalCertificatePersistence
		manuInternationalCertificatePersistence;

	@Reference
	protected PackagingProcessPersistence packagingProcessPersistence;

	@Reference
	protected ProductionProcessPersistence productionProcessPersistence;

	@Reference
	protected ProductiveInputsFormPersistence productiveInputsFormPersistence;

	@Reference
	protected ProductiveInputsFormAddPersistence
		productiveInputsFormAddPersistence;

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
		ManuCompanyInfoAddressLocalServiceBaseImpl.class);

}