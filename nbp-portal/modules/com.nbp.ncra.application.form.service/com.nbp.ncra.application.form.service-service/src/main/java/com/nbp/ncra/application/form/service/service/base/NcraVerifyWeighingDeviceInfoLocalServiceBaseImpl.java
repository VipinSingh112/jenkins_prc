/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.application.form.service.service.base;

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

import com.nbp.ncra.application.form.service.model.NcraVerifyWeighingDeviceInfo;
import com.nbp.ncra.application.form.service.service.NcraVerifyWeighingDeviceInfoLocalService;
import com.nbp.ncra.application.form.service.service.persistence.NcraApplicantDetailInfoPersistence;
import com.nbp.ncra.application.form.service.service.persistence.NcraApplicationPersistence;
import com.nbp.ncra.application.form.service.service.persistence.NcraCurrentStagePersistence;
import com.nbp.ncra.application.form.service.service.persistence.NcraFeeSubmissionPersistence;
import com.nbp.ncra.application.form.service.service.persistence.NcraVerifyWeighingDatePersistence;
import com.nbp.ncra.application.form.service.service.persistence.NcraVerifyWeighingDeviceInfoPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the ncra verify weighing device info local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.ncra.application.form.service.service.impl.NcraVerifyWeighingDeviceInfoLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.ncra.application.form.service.service.impl.NcraVerifyWeighingDeviceInfoLocalServiceImpl
 * @generated
 */
public abstract class NcraVerifyWeighingDeviceInfoLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService,
			   NcraVerifyWeighingDeviceInfoLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>NcraVerifyWeighingDeviceInfoLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.ncra.application.form.service.service.NcraVerifyWeighingDeviceInfoLocalServiceUtil</code>.
	 */

	/**
	 * Adds the ncra verify weighing device info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcraVerifyWeighingDeviceInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncraVerifyWeighingDeviceInfo the ncra verify weighing device info
	 * @return the ncra verify weighing device info that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public NcraVerifyWeighingDeviceInfo addNcraVerifyWeighingDeviceInfo(
		NcraVerifyWeighingDeviceInfo ncraVerifyWeighingDeviceInfo) {

		ncraVerifyWeighingDeviceInfo.setNew(true);

		return ncraVerifyWeighingDeviceInfoPersistence.update(
			ncraVerifyWeighingDeviceInfo);
	}

	/**
	 * Creates a new ncra verify weighing device info with the primary key. Does not add the ncra verify weighing device info to the database.
	 *
	 * @param ncraVerifyWeighingDeviceInfoId the primary key for the new ncra verify weighing device info
	 * @return the new ncra verify weighing device info
	 */
	@Override
	@Transactional(enabled = false)
	public NcraVerifyWeighingDeviceInfo createNcraVerifyWeighingDeviceInfo(
		long ncraVerifyWeighingDeviceInfoId) {

		return ncraVerifyWeighingDeviceInfoPersistence.create(
			ncraVerifyWeighingDeviceInfoId);
	}

	/**
	 * Deletes the ncra verify weighing device info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcraVerifyWeighingDeviceInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncraVerifyWeighingDeviceInfoId the primary key of the ncra verify weighing device info
	 * @return the ncra verify weighing device info that was removed
	 * @throws PortalException if a ncra verify weighing device info with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public NcraVerifyWeighingDeviceInfo deleteNcraVerifyWeighingDeviceInfo(
			long ncraVerifyWeighingDeviceInfoId)
		throws PortalException {

		return ncraVerifyWeighingDeviceInfoPersistence.remove(
			ncraVerifyWeighingDeviceInfoId);
	}

	/**
	 * Deletes the ncra verify weighing device info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcraVerifyWeighingDeviceInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncraVerifyWeighingDeviceInfo the ncra verify weighing device info
	 * @return the ncra verify weighing device info that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public NcraVerifyWeighingDeviceInfo deleteNcraVerifyWeighingDeviceInfo(
		NcraVerifyWeighingDeviceInfo ncraVerifyWeighingDeviceInfo) {

		return ncraVerifyWeighingDeviceInfoPersistence.remove(
			ncraVerifyWeighingDeviceInfo);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return ncraVerifyWeighingDeviceInfoPersistence.dslQuery(dslQuery);
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
			NcraVerifyWeighingDeviceInfo.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return ncraVerifyWeighingDeviceInfoPersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncra.application.form.service.model.impl.NcraVerifyWeighingDeviceInfoModelImpl</code>.
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

		return ncraVerifyWeighingDeviceInfoPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncra.application.form.service.model.impl.NcraVerifyWeighingDeviceInfoModelImpl</code>.
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

		return ncraVerifyWeighingDeviceInfoPersistence.findWithDynamicQuery(
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
		return ncraVerifyWeighingDeviceInfoPersistence.countWithDynamicQuery(
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

		return ncraVerifyWeighingDeviceInfoPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public NcraVerifyWeighingDeviceInfo fetchNcraVerifyWeighingDeviceInfo(
		long ncraVerifyWeighingDeviceInfoId) {

		return ncraVerifyWeighingDeviceInfoPersistence.fetchByPrimaryKey(
			ncraVerifyWeighingDeviceInfoId);
	}

	/**
	 * Returns the ncra verify weighing device info with the primary key.
	 *
	 * @param ncraVerifyWeighingDeviceInfoId the primary key of the ncra verify weighing device info
	 * @return the ncra verify weighing device info
	 * @throws PortalException if a ncra verify weighing device info with the primary key could not be found
	 */
	@Override
	public NcraVerifyWeighingDeviceInfo getNcraVerifyWeighingDeviceInfo(
			long ncraVerifyWeighingDeviceInfoId)
		throws PortalException {

		return ncraVerifyWeighingDeviceInfoPersistence.findByPrimaryKey(
			ncraVerifyWeighingDeviceInfoId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			ncraVerifyWeighingDeviceInfoLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(
			NcraVerifyWeighingDeviceInfo.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"ncraVerifyWeighingDeviceInfoId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			ncraVerifyWeighingDeviceInfoLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			NcraVerifyWeighingDeviceInfo.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"ncraVerifyWeighingDeviceInfoId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			ncraVerifyWeighingDeviceInfoLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(
			NcraVerifyWeighingDeviceInfo.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"ncraVerifyWeighingDeviceInfoId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return ncraVerifyWeighingDeviceInfoPersistence.create(
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
				"Implement NcraVerifyWeighingDeviceInfoLocalServiceImpl#deleteNcraVerifyWeighingDeviceInfo(NcraVerifyWeighingDeviceInfo) to avoid orphaned data");
		}

		return ncraVerifyWeighingDeviceInfoLocalService.
			deleteNcraVerifyWeighingDeviceInfo(
				(NcraVerifyWeighingDeviceInfo)persistedModel);
	}

	@Override
	public BasePersistence<NcraVerifyWeighingDeviceInfo> getBasePersistence() {
		return ncraVerifyWeighingDeviceInfoPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return ncraVerifyWeighingDeviceInfoPersistence.findByPrimaryKey(
			primaryKeyObj);
	}

	/**
	 * Returns a range of all the ncra verify weighing device infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncra.application.form.service.model.impl.NcraVerifyWeighingDeviceInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra verify weighing device infos
	 * @param end the upper bound of the range of ncra verify weighing device infos (not inclusive)
	 * @return the range of ncra verify weighing device infos
	 */
	@Override
	public List<NcraVerifyWeighingDeviceInfo> getNcraVerifyWeighingDeviceInfos(
		int start, int end) {

		return ncraVerifyWeighingDeviceInfoPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of ncra verify weighing device infos.
	 *
	 * @return the number of ncra verify weighing device infos
	 */
	@Override
	public int getNcraVerifyWeighingDeviceInfosCount() {
		return ncraVerifyWeighingDeviceInfoPersistence.countAll();
	}

	/**
	 * Updates the ncra verify weighing device info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcraVerifyWeighingDeviceInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncraVerifyWeighingDeviceInfo the ncra verify weighing device info
	 * @return the ncra verify weighing device info that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public NcraVerifyWeighingDeviceInfo updateNcraVerifyWeighingDeviceInfo(
		NcraVerifyWeighingDeviceInfo ncraVerifyWeighingDeviceInfo) {

		return ncraVerifyWeighingDeviceInfoPersistence.update(
			ncraVerifyWeighingDeviceInfo);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			NcraVerifyWeighingDeviceInfoLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		ncraVerifyWeighingDeviceInfoLocalService =
			(NcraVerifyWeighingDeviceInfoLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return NcraVerifyWeighingDeviceInfoLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return NcraVerifyWeighingDeviceInfo.class;
	}

	protected String getModelClassName() {
		return NcraVerifyWeighingDeviceInfo.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				ncraVerifyWeighingDeviceInfoPersistence.getDataSource();

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
	protected NcraApplicantDetailInfoPersistence
		ncraApplicantDetailInfoPersistence;

	@Reference
	protected NcraApplicationPersistence ncraApplicationPersistence;

	@Reference
	protected NcraCurrentStagePersistence ncraCurrentStagePersistence;

	@Reference
	protected NcraFeeSubmissionPersistence ncraFeeSubmissionPersistence;

	@Reference
	protected NcraVerifyWeighingDatePersistence
		ncraVerifyWeighingDatePersistence;

	protected NcraVerifyWeighingDeviceInfoLocalService
		ncraVerifyWeighingDeviceInfoLocalService;

	@Reference
	protected NcraVerifyWeighingDeviceInfoPersistence
		ncraVerifyWeighingDeviceInfoPersistence;

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
		NcraVerifyWeighingDeviceInfoLocalServiceBaseImpl.class);

}