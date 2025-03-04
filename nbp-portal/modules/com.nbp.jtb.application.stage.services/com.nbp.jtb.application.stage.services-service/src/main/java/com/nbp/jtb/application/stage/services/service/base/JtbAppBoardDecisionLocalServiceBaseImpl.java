/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.stage.services.service.base;

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

import com.nbp.jtb.application.stage.services.model.JtbAppBoardDecision;
import com.nbp.jtb.application.stage.services.service.JtbAppBoardDecisionLocalService;
import com.nbp.jtb.application.stage.services.service.persistence.JTBLicenceCertificatePersistence;
import com.nbp.jtb.application.stage.services.service.persistence.JtbAppBoardDecisionPersistence;
import com.nbp.jtb.application.stage.services.service.persistence.JtbApplicationDeskVeriPersistence;
import com.nbp.jtb.application.stage.services.service.persistence.JtbApplicationStagesPersistence;
import com.nbp.jtb.application.stage.services.service.persistence.JtbInspectionPersistence;
import com.nbp.jtb.application.stage.services.service.persistence.JtbPaymentConfirmationPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the jtb app board decision local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.jtb.application.stage.services.service.impl.JtbAppBoardDecisionLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.jtb.application.stage.services.service.impl.JtbAppBoardDecisionLocalServiceImpl
 * @generated
 */
public abstract class JtbAppBoardDecisionLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService,
			   JtbAppBoardDecisionLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>JtbAppBoardDecisionLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.jtb.application.stage.services.service.JtbAppBoardDecisionLocalServiceUtil</code>.
	 */

	/**
	 * Adds the jtb app board decision to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbAppBoardDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbAppBoardDecision the jtb app board decision
	 * @return the jtb app board decision that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public JtbAppBoardDecision addJtbAppBoardDecision(
		JtbAppBoardDecision jtbAppBoardDecision) {

		jtbAppBoardDecision.setNew(true);

		return jtbAppBoardDecisionPersistence.update(jtbAppBoardDecision);
	}

	/**
	 * Creates a new jtb app board decision with the primary key. Does not add the jtb app board decision to the database.
	 *
	 * @param jtbAppDeciBoardDecisionId the primary key for the new jtb app board decision
	 * @return the new jtb app board decision
	 */
	@Override
	@Transactional(enabled = false)
	public JtbAppBoardDecision createJtbAppBoardDecision(
		long jtbAppDeciBoardDecisionId) {

		return jtbAppBoardDecisionPersistence.create(jtbAppDeciBoardDecisionId);
	}

	/**
	 * Deletes the jtb app board decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbAppBoardDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbAppDeciBoardDecisionId the primary key of the jtb app board decision
	 * @return the jtb app board decision that was removed
	 * @throws PortalException if a jtb app board decision with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public JtbAppBoardDecision deleteJtbAppBoardDecision(
			long jtbAppDeciBoardDecisionId)
		throws PortalException {

		return jtbAppBoardDecisionPersistence.remove(jtbAppDeciBoardDecisionId);
	}

	/**
	 * Deletes the jtb app board decision from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbAppBoardDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbAppBoardDecision the jtb app board decision
	 * @return the jtb app board decision that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public JtbAppBoardDecision deleteJtbAppBoardDecision(
		JtbAppBoardDecision jtbAppBoardDecision) {

		return jtbAppBoardDecisionPersistence.remove(jtbAppBoardDecision);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return jtbAppBoardDecisionPersistence.dslQuery(dslQuery);
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
			JtbAppBoardDecision.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return jtbAppBoardDecisionPersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.stage.services.model.impl.JtbAppBoardDecisionModelImpl</code>.
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

		return jtbAppBoardDecisionPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.stage.services.model.impl.JtbAppBoardDecisionModelImpl</code>.
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

		return jtbAppBoardDecisionPersistence.findWithDynamicQuery(
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
		return jtbAppBoardDecisionPersistence.countWithDynamicQuery(
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

		return jtbAppBoardDecisionPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public JtbAppBoardDecision fetchJtbAppBoardDecision(
		long jtbAppDeciBoardDecisionId) {

		return jtbAppBoardDecisionPersistence.fetchByPrimaryKey(
			jtbAppDeciBoardDecisionId);
	}

	/**
	 * Returns the jtb app board decision with the primary key.
	 *
	 * @param jtbAppDeciBoardDecisionId the primary key of the jtb app board decision
	 * @return the jtb app board decision
	 * @throws PortalException if a jtb app board decision with the primary key could not be found
	 */
	@Override
	public JtbAppBoardDecision getJtbAppBoardDecision(
			long jtbAppDeciBoardDecisionId)
		throws PortalException {

		return jtbAppBoardDecisionPersistence.findByPrimaryKey(
			jtbAppDeciBoardDecisionId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			jtbAppBoardDecisionLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(JtbAppBoardDecision.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"jtbAppDeciBoardDecisionId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			jtbAppBoardDecisionLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			JtbAppBoardDecision.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"jtbAppDeciBoardDecisionId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			jtbAppBoardDecisionLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(JtbAppBoardDecision.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"jtbAppDeciBoardDecisionId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return jtbAppBoardDecisionPersistence.create(
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
				"Implement JtbAppBoardDecisionLocalServiceImpl#deleteJtbAppBoardDecision(JtbAppBoardDecision) to avoid orphaned data");
		}

		return jtbAppBoardDecisionLocalService.deleteJtbAppBoardDecision(
			(JtbAppBoardDecision)persistedModel);
	}

	@Override
	public BasePersistence<JtbAppBoardDecision> getBasePersistence() {
		return jtbAppBoardDecisionPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return jtbAppBoardDecisionPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the jtb app board decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.stage.services.model.impl.JtbAppBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb app board decisions
	 * @param end the upper bound of the range of jtb app board decisions (not inclusive)
	 * @return the range of jtb app board decisions
	 */
	@Override
	public List<JtbAppBoardDecision> getJtbAppBoardDecisions(
		int start, int end) {

		return jtbAppBoardDecisionPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of jtb app board decisions.
	 *
	 * @return the number of jtb app board decisions
	 */
	@Override
	public int getJtbAppBoardDecisionsCount() {
		return jtbAppBoardDecisionPersistence.countAll();
	}

	/**
	 * Updates the jtb app board decision in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbAppBoardDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbAppBoardDecision the jtb app board decision
	 * @return the jtb app board decision that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public JtbAppBoardDecision updateJtbAppBoardDecision(
		JtbAppBoardDecision jtbAppBoardDecision) {

		return jtbAppBoardDecisionPersistence.update(jtbAppBoardDecision);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			JtbAppBoardDecisionLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		jtbAppBoardDecisionLocalService =
			(JtbAppBoardDecisionLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return JtbAppBoardDecisionLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return JtbAppBoardDecision.class;
	}

	protected String getModelClassName() {
		return JtbAppBoardDecision.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				jtbAppBoardDecisionPersistence.getDataSource();

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

	protected JtbAppBoardDecisionLocalService jtbAppBoardDecisionLocalService;

	@Reference
	protected JtbAppBoardDecisionPersistence jtbAppBoardDecisionPersistence;

	@Reference
	protected JtbApplicationDeskVeriPersistence
		jtbApplicationDeskVeriPersistence;

	@Reference
	protected JtbApplicationStagesPersistence jtbApplicationStagesPersistence;

	@Reference
	protected JtbInspectionPersistence jtbInspectionPersistence;

	@Reference
	protected JTBLicenceCertificatePersistence jtbLicenceCertificatePersistence;

	@Reference
	protected JtbPaymentConfirmationPersistence
		jtbPaymentConfirmationPersistence;

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
		JtbAppBoardDecisionLocalServiceBaseImpl.class);

}