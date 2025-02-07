/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service.base;

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

import com.nbp.quary.application.form.service.model.QuarryMaterialInformationEquipmentList;
import com.nbp.quary.application.form.service.service.QuarryMaterialInformationEquipmentListLocalService;
import com.nbp.quary.application.form.service.service.persistence.DirectorDetailsAddPersistence;
import com.nbp.quary.application.form.service.service.persistence.QuarryApplicationMachinesAndEquipmentPersistence;
import com.nbp.quary.application.form.service.service.persistence.QuarryApplicationPaymentPersistence;
import com.nbp.quary.application.form.service.service.persistence.QuarryApplicationPersistence;
import com.nbp.quary.application.form.service.service.persistence.QuarryApplicatntInformationPersistence;
import com.nbp.quary.application.form.service.service.persistence.QuarryCurrentStagePersistence;
import com.nbp.quary.application.form.service.service.persistence.QuarryGeneralInformationPersistence;
import com.nbp.quary.application.form.service.service.persistence.QuarryInformaationPersistence;
import com.nbp.quary.application.form.service.service.persistence.QuarryMaterialInformationEquipmentListPersistence;
import com.nbp.quary.application.form.service.service.persistence.QuarryMaterialInformationPersistence;
import com.nbp.quary.application.form.service.service.persistence.QuarryTransferApplicantInfoPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the quarry material information equipment list local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.quary.application.form.service.service.impl.QuarryMaterialInformationEquipmentListLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.quary.application.form.service.service.impl.QuarryMaterialInformationEquipmentListLocalServiceImpl
 * @generated
 */
public abstract class QuarryMaterialInformationEquipmentListLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService,
			   QuarryMaterialInformationEquipmentListLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>QuarryMaterialInformationEquipmentListLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.quary.application.form.service.service.QuarryMaterialInformationEquipmentListLocalServiceUtil</code>.
	 */

	/**
	 * Adds the quarry material information equipment list to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryMaterialInformationEquipmentListLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryMaterialInformationEquipmentList the quarry material information equipment list
	 * @return the quarry material information equipment list that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public QuarryMaterialInformationEquipmentList
		addQuarryMaterialInformationEquipmentList(
			QuarryMaterialInformationEquipmentList
				quarryMaterialInformationEquipmentList) {

		quarryMaterialInformationEquipmentList.setNew(true);

		return quarryMaterialInformationEquipmentListPersistence.update(
			quarryMaterialInformationEquipmentList);
	}

	/**
	 * Creates a new quarry material information equipment list with the primary key. Does not add the quarry material information equipment list to the database.
	 *
	 * @param materialInfoId the primary key for the new quarry material information equipment list
	 * @return the new quarry material information equipment list
	 */
	@Override
	@Transactional(enabled = false)
	public QuarryMaterialInformationEquipmentList
		createQuarryMaterialInformationEquipmentList(long materialInfoId) {

		return quarryMaterialInformationEquipmentListPersistence.create(
			materialInfoId);
	}

	/**
	 * Deletes the quarry material information equipment list with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryMaterialInformationEquipmentListLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param materialInfoId the primary key of the quarry material information equipment list
	 * @return the quarry material information equipment list that was removed
	 * @throws PortalException if a quarry material information equipment list with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public QuarryMaterialInformationEquipmentList
			deleteQuarryMaterialInformationEquipmentList(long materialInfoId)
		throws PortalException {

		return quarryMaterialInformationEquipmentListPersistence.remove(
			materialInfoId);
	}

	/**
	 * Deletes the quarry material information equipment list from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryMaterialInformationEquipmentListLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryMaterialInformationEquipmentList the quarry material information equipment list
	 * @return the quarry material information equipment list that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public QuarryMaterialInformationEquipmentList
		deleteQuarryMaterialInformationEquipmentList(
			QuarryMaterialInformationEquipmentList
				quarryMaterialInformationEquipmentList) {

		return quarryMaterialInformationEquipmentListPersistence.remove(
			quarryMaterialInformationEquipmentList);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return quarryMaterialInformationEquipmentListPersistence.dslQuery(
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
			QuarryMaterialInformationEquipmentList.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return quarryMaterialInformationEquipmentListPersistence.
			findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quary.application.form.service.model.impl.QuarryMaterialInformationEquipmentListModelImpl</code>.
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

		return quarryMaterialInformationEquipmentListPersistence.
			findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quary.application.form.service.model.impl.QuarryMaterialInformationEquipmentListModelImpl</code>.
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

		return quarryMaterialInformationEquipmentListPersistence.
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
		return quarryMaterialInformationEquipmentListPersistence.
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

		return quarryMaterialInformationEquipmentListPersistence.
			countWithDynamicQuery(dynamicQuery, projection);
	}

	@Override
	public QuarryMaterialInformationEquipmentList
		fetchQuarryMaterialInformationEquipmentList(long materialInfoId) {

		return quarryMaterialInformationEquipmentListPersistence.
			fetchByPrimaryKey(materialInfoId);
	}

	/**
	 * Returns the quarry material information equipment list with the primary key.
	 *
	 * @param materialInfoId the primary key of the quarry material information equipment list
	 * @return the quarry material information equipment list
	 * @throws PortalException if a quarry material information equipment list with the primary key could not be found
	 */
	@Override
	public QuarryMaterialInformationEquipmentList
			getQuarryMaterialInformationEquipmentList(long materialInfoId)
		throws PortalException {

		return quarryMaterialInformationEquipmentListPersistence.
			findByPrimaryKey(materialInfoId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			quarryMaterialInformationEquipmentListLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(
			QuarryMaterialInformationEquipmentList.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("materialInfoId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			quarryMaterialInformationEquipmentListLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			QuarryMaterialInformationEquipmentList.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"materialInfoId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			quarryMaterialInformationEquipmentListLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(
			QuarryMaterialInformationEquipmentList.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("materialInfoId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return quarryMaterialInformationEquipmentListPersistence.create(
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
				"Implement QuarryMaterialInformationEquipmentListLocalServiceImpl#deleteQuarryMaterialInformationEquipmentList(QuarryMaterialInformationEquipmentList) to avoid orphaned data");
		}

		return quarryMaterialInformationEquipmentListLocalService.
			deleteQuarryMaterialInformationEquipmentList(
				(QuarryMaterialInformationEquipmentList)persistedModel);
	}

	@Override
	public BasePersistence<QuarryMaterialInformationEquipmentList>
		getBasePersistence() {

		return quarryMaterialInformationEquipmentListPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return quarryMaterialInformationEquipmentListPersistence.
			findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the quarry material information equipment lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quary.application.form.service.model.impl.QuarryMaterialInformationEquipmentListModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry material information equipment lists
	 * @param end the upper bound of the range of quarry material information equipment lists (not inclusive)
	 * @return the range of quarry material information equipment lists
	 */
	@Override
	public List<QuarryMaterialInformationEquipmentList>
		getQuarryMaterialInformationEquipmentLists(int start, int end) {

		return quarryMaterialInformationEquipmentListPersistence.findAll(
			start, end);
	}

	/**
	 * Returns the number of quarry material information equipment lists.
	 *
	 * @return the number of quarry material information equipment lists
	 */
	@Override
	public int getQuarryMaterialInformationEquipmentListsCount() {
		return quarryMaterialInformationEquipmentListPersistence.countAll();
	}

	/**
	 * Updates the quarry material information equipment list in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryMaterialInformationEquipmentListLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryMaterialInformationEquipmentList the quarry material information equipment list
	 * @return the quarry material information equipment list that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public QuarryMaterialInformationEquipmentList
		updateQuarryMaterialInformationEquipmentList(
			QuarryMaterialInformationEquipmentList
				quarryMaterialInformationEquipmentList) {

		return quarryMaterialInformationEquipmentListPersistence.update(
			quarryMaterialInformationEquipmentList);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			QuarryMaterialInformationEquipmentListLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		quarryMaterialInformationEquipmentListLocalService =
			(QuarryMaterialInformationEquipmentListLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return QuarryMaterialInformationEquipmentListLocalService.class.
			getName();
	}

	protected Class<?> getModelClass() {
		return QuarryMaterialInformationEquipmentList.class;
	}

	protected String getModelClassName() {
		return QuarryMaterialInformationEquipmentList.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				quarryMaterialInformationEquipmentListPersistence.
					getDataSource();

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
	protected DirectorDetailsAddPersistence directorDetailsAddPersistence;

	@Reference
	protected QuarryApplicationPersistence quarryApplicationPersistence;

	@Reference
	protected QuarryApplicationMachinesAndEquipmentPersistence
		quarryApplicationMachinesAndEquipmentPersistence;

	@Reference
	protected QuarryApplicationPaymentPersistence
		quarryApplicationPaymentPersistence;

	@Reference
	protected QuarryApplicatntInformationPersistence
		quarryApplicatntInformationPersistence;

	@Reference
	protected QuarryCurrentStagePersistence quarryCurrentStagePersistence;

	@Reference
	protected QuarryGeneralInformationPersistence
		quarryGeneralInformationPersistence;

	@Reference
	protected QuarryInformaationPersistence quarryInformaationPersistence;

	@Reference
	protected QuarryMaterialInformationPersistence
		quarryMaterialInformationPersistence;

	protected QuarryMaterialInformationEquipmentListLocalService
		quarryMaterialInformationEquipmentListLocalService;

	@Reference
	protected QuarryMaterialInformationEquipmentListPersistence
		quarryMaterialInformationEquipmentListPersistence;

	@Reference
	protected QuarryTransferApplicantInfoPersistence
		quarryTransferApplicantInfoPersistence;

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
		QuarryMaterialInformationEquipmentListLocalServiceBaseImpl.class);

}