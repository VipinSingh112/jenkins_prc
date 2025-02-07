/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.stages.services.service.base;

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

import com.nbp.janaac.stages.services.model.JanaacPaymentVerification;
import com.nbp.janaac.stages.services.service.JanaacPaymentVerificationLocalService;
import com.nbp.janaac.stages.services.service.persistence.JanaacApplicationStagesPersistence;
import com.nbp.janaac.stages.services.service.persistence.JanaacCommitteeDecisionPersistence;
import com.nbp.janaac.stages.services.service.persistence.JanaacInspectionPersistence;
import com.nbp.janaac.stages.services.service.persistence.JanaacPaymentVerificationPersistence;
import com.nbp.janaac.stages.services.service.persistence.JanaacReportPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the janaac payment verification local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.janaac.stages.services.service.impl.JanaacPaymentVerificationLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.janaac.stages.services.service.impl.JanaacPaymentVerificationLocalServiceImpl
 * @generated
 */
public abstract class JanaacPaymentVerificationLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService,
			   JanaacPaymentVerificationLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>JanaacPaymentVerificationLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.janaac.stages.services.service.JanaacPaymentVerificationLocalServiceUtil</code>.
	 */

	/**
	 * Adds the janaac payment verification to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JanaacPaymentVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param janaacPaymentVerification the janaac payment verification
	 * @return the janaac payment verification that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public JanaacPaymentVerification addJanaacPaymentVerification(
		JanaacPaymentVerification janaacPaymentVerification) {

		janaacPaymentVerification.setNew(true);

		return janaacPaymentVerificationPersistence.update(
			janaacPaymentVerification);
	}

	/**
	 * Creates a new janaac payment verification with the primary key. Does not add the janaac payment verification to the database.
	 *
	 * @param janaacPaymentVerificationId the primary key for the new janaac payment verification
	 * @return the new janaac payment verification
	 */
	@Override
	@Transactional(enabled = false)
	public JanaacPaymentVerification createJanaacPaymentVerification(
		long janaacPaymentVerificationId) {

		return janaacPaymentVerificationPersistence.create(
			janaacPaymentVerificationId);
	}

	/**
	 * Deletes the janaac payment verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JanaacPaymentVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param janaacPaymentVerificationId the primary key of the janaac payment verification
	 * @return the janaac payment verification that was removed
	 * @throws PortalException if a janaac payment verification with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public JanaacPaymentVerification deleteJanaacPaymentVerification(
			long janaacPaymentVerificationId)
		throws PortalException {

		return janaacPaymentVerificationPersistence.remove(
			janaacPaymentVerificationId);
	}

	/**
	 * Deletes the janaac payment verification from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JanaacPaymentVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param janaacPaymentVerification the janaac payment verification
	 * @return the janaac payment verification that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public JanaacPaymentVerification deleteJanaacPaymentVerification(
		JanaacPaymentVerification janaacPaymentVerification) {

		return janaacPaymentVerificationPersistence.remove(
			janaacPaymentVerification);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return janaacPaymentVerificationPersistence.dslQuery(dslQuery);
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
			JanaacPaymentVerification.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return janaacPaymentVerificationPersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.stages.services.model.impl.JanaacPaymentVerificationModelImpl</code>.
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

		return janaacPaymentVerificationPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.stages.services.model.impl.JanaacPaymentVerificationModelImpl</code>.
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

		return janaacPaymentVerificationPersistence.findWithDynamicQuery(
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
		return janaacPaymentVerificationPersistence.countWithDynamicQuery(
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

		return janaacPaymentVerificationPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public JanaacPaymentVerification fetchJanaacPaymentVerification(
		long janaacPaymentVerificationId) {

		return janaacPaymentVerificationPersistence.fetchByPrimaryKey(
			janaacPaymentVerificationId);
	}

	/**
	 * Returns the janaac payment verification with the primary key.
	 *
	 * @param janaacPaymentVerificationId the primary key of the janaac payment verification
	 * @return the janaac payment verification
	 * @throws PortalException if a janaac payment verification with the primary key could not be found
	 */
	@Override
	public JanaacPaymentVerification getJanaacPaymentVerification(
			long janaacPaymentVerificationId)
		throws PortalException {

		return janaacPaymentVerificationPersistence.findByPrimaryKey(
			janaacPaymentVerificationId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			janaacPaymentVerificationLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(JanaacPaymentVerification.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"janaacPaymentVerificationId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			janaacPaymentVerificationLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			JanaacPaymentVerification.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"janaacPaymentVerificationId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			janaacPaymentVerificationLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(JanaacPaymentVerification.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"janaacPaymentVerificationId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return janaacPaymentVerificationPersistence.create(
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
				"Implement JanaacPaymentVerificationLocalServiceImpl#deleteJanaacPaymentVerification(JanaacPaymentVerification) to avoid orphaned data");
		}

		return janaacPaymentVerificationLocalService.
			deleteJanaacPaymentVerification(
				(JanaacPaymentVerification)persistedModel);
	}

	@Override
	public BasePersistence<JanaacPaymentVerification> getBasePersistence() {
		return janaacPaymentVerificationPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return janaacPaymentVerificationPersistence.findByPrimaryKey(
			primaryKeyObj);
	}

	/**
	 * Returns a range of all the janaac payment verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.stages.services.model.impl.JanaacPaymentVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac payment verifications
	 * @param end the upper bound of the range of janaac payment verifications (not inclusive)
	 * @return the range of janaac payment verifications
	 */
	@Override
	public List<JanaacPaymentVerification> getJanaacPaymentVerifications(
		int start, int end) {

		return janaacPaymentVerificationPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of janaac payment verifications.
	 *
	 * @return the number of janaac payment verifications
	 */
	@Override
	public int getJanaacPaymentVerificationsCount() {
		return janaacPaymentVerificationPersistence.countAll();
	}

	/**
	 * Updates the janaac payment verification in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JanaacPaymentVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param janaacPaymentVerification the janaac payment verification
	 * @return the janaac payment verification that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public JanaacPaymentVerification updateJanaacPaymentVerification(
		JanaacPaymentVerification janaacPaymentVerification) {

		return janaacPaymentVerificationPersistence.update(
			janaacPaymentVerification);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			JanaacPaymentVerificationLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		janaacPaymentVerificationLocalService =
			(JanaacPaymentVerificationLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return JanaacPaymentVerificationLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return JanaacPaymentVerification.class;
	}

	protected String getModelClassName() {
		return JanaacPaymentVerification.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				janaacPaymentVerificationPersistence.getDataSource();

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
	protected JanaacApplicationStagesPersistence
		janaacApplicationStagesPersistence;

	@Reference
	protected JanaacCommitteeDecisionPersistence
		janaacCommitteeDecisionPersistence;

	@Reference
	protected JanaacInspectionPersistence janaacInspectionPersistence;

	protected JanaacPaymentVerificationLocalService
		janaacPaymentVerificationLocalService;

	@Reference
	protected JanaacPaymentVerificationPersistence
		janaacPaymentVerificationPersistence;

	@Reference
	protected JanaacReportPersistence janaacReportPersistence;

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
		JanaacPaymentVerificationLocalServiceBaseImpl.class);

}