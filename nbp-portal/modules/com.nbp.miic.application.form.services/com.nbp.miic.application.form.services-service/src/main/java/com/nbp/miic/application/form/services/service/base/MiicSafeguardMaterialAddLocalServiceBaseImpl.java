/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.service.base;

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

import com.nbp.miic.application.form.services.model.MiicSafeguardMaterialAdd;
import com.nbp.miic.application.form.services.service.MiicSafeguardMaterialAddLocalService;
import com.nbp.miic.application.form.services.service.persistence.MiicApplicantDetailsPersistence;
import com.nbp.miic.application.form.services.service.persistence.MiicApplicationCurrentStagePersistence;
import com.nbp.miic.application.form.services.service.persistence.MiicApplicationPersistence;
import com.nbp.miic.application.form.services.service.persistence.MiicPaymentPersistence;
import com.nbp.miic.application.form.services.service.persistence.MiicSafeguardGoodAddPersistence;
import com.nbp.miic.application.form.services.service.persistence.MiicSafeguardMaterialAddPersistence;
import com.nbp.miic.application.form.services.service.persistence.MiicSuspensionOfCetAddPersistence;
import com.nbp.miic.application.form.services.service.persistence.MiicSuspensionOfCetPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the miic safeguard material add local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.miic.application.form.services.service.impl.MiicSafeguardMaterialAddLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.miic.application.form.services.service.impl.MiicSafeguardMaterialAddLocalServiceImpl
 * @generated
 */
public abstract class MiicSafeguardMaterialAddLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService,
			   MiicSafeguardMaterialAddLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>MiicSafeguardMaterialAddLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.miic.application.form.services.service.MiicSafeguardMaterialAddLocalServiceUtil</code>.
	 */

	/**
	 * Adds the miic safeguard material add to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicSafeguardMaterialAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicSafeguardMaterialAdd the miic safeguard material add
	 * @return the miic safeguard material add that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public MiicSafeguardMaterialAdd addMiicSafeguardMaterialAdd(
		MiicSafeguardMaterialAdd miicSafeguardMaterialAdd) {

		miicSafeguardMaterialAdd.setNew(true);

		return miicSafeguardMaterialAddPersistence.update(
			miicSafeguardMaterialAdd);
	}

	/**
	 * Creates a new miic safeguard material add with the primary key. Does not add the miic safeguard material add to the database.
	 *
	 * @param miicSafeguardMaterialAddId the primary key for the new miic safeguard material add
	 * @return the new miic safeguard material add
	 */
	@Override
	@Transactional(enabled = false)
	public MiicSafeguardMaterialAdd createMiicSafeguardMaterialAdd(
		long miicSafeguardMaterialAddId) {

		return miicSafeguardMaterialAddPersistence.create(
			miicSafeguardMaterialAddId);
	}

	/**
	 * Deletes the miic safeguard material add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicSafeguardMaterialAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicSafeguardMaterialAddId the primary key of the miic safeguard material add
	 * @return the miic safeguard material add that was removed
	 * @throws PortalException if a miic safeguard material add with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public MiicSafeguardMaterialAdd deleteMiicSafeguardMaterialAdd(
			long miicSafeguardMaterialAddId)
		throws PortalException {

		return miicSafeguardMaterialAddPersistence.remove(
			miicSafeguardMaterialAddId);
	}

	/**
	 * Deletes the miic safeguard material add from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicSafeguardMaterialAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicSafeguardMaterialAdd the miic safeguard material add
	 * @return the miic safeguard material add that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public MiicSafeguardMaterialAdd deleteMiicSafeguardMaterialAdd(
		MiicSafeguardMaterialAdd miicSafeguardMaterialAdd) {

		return miicSafeguardMaterialAddPersistence.remove(
			miicSafeguardMaterialAdd);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return miicSafeguardMaterialAddPersistence.dslQuery(dslQuery);
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
			MiicSafeguardMaterialAdd.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return miicSafeguardMaterialAddPersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.application.form.services.model.impl.MiicSafeguardMaterialAddModelImpl</code>.
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

		return miicSafeguardMaterialAddPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.application.form.services.model.impl.MiicSafeguardMaterialAddModelImpl</code>.
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

		return miicSafeguardMaterialAddPersistence.findWithDynamicQuery(
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
		return miicSafeguardMaterialAddPersistence.countWithDynamicQuery(
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

		return miicSafeguardMaterialAddPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public MiicSafeguardMaterialAdd fetchMiicSafeguardMaterialAdd(
		long miicSafeguardMaterialAddId) {

		return miicSafeguardMaterialAddPersistence.fetchByPrimaryKey(
			miicSafeguardMaterialAddId);
	}

	/**
	 * Returns the miic safeguard material add with the primary key.
	 *
	 * @param miicSafeguardMaterialAddId the primary key of the miic safeguard material add
	 * @return the miic safeguard material add
	 * @throws PortalException if a miic safeguard material add with the primary key could not be found
	 */
	@Override
	public MiicSafeguardMaterialAdd getMiicSafeguardMaterialAdd(
			long miicSafeguardMaterialAddId)
		throws PortalException {

		return miicSafeguardMaterialAddPersistence.findByPrimaryKey(
			miicSafeguardMaterialAddId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			miicSafeguardMaterialAddLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(MiicSafeguardMaterialAdd.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"miicSafeguardMaterialAddId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			miicSafeguardMaterialAddLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			MiicSafeguardMaterialAdd.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"miicSafeguardMaterialAddId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			miicSafeguardMaterialAddLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(MiicSafeguardMaterialAdd.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"miicSafeguardMaterialAddId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return miicSafeguardMaterialAddPersistence.create(
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
				"Implement MiicSafeguardMaterialAddLocalServiceImpl#deleteMiicSafeguardMaterialAdd(MiicSafeguardMaterialAdd) to avoid orphaned data");
		}

		return miicSafeguardMaterialAddLocalService.
			deleteMiicSafeguardMaterialAdd(
				(MiicSafeguardMaterialAdd)persistedModel);
	}

	@Override
	public BasePersistence<MiicSafeguardMaterialAdd> getBasePersistence() {
		return miicSafeguardMaterialAddPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return miicSafeguardMaterialAddPersistence.findByPrimaryKey(
			primaryKeyObj);
	}

	/**
	 * Returns a range of all the miic safeguard material adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.application.form.services.model.impl.MiicSafeguardMaterialAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic safeguard material adds
	 * @param end the upper bound of the range of miic safeguard material adds (not inclusive)
	 * @return the range of miic safeguard material adds
	 */
	@Override
	public List<MiicSafeguardMaterialAdd> getMiicSafeguardMaterialAdds(
		int start, int end) {

		return miicSafeguardMaterialAddPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of miic safeguard material adds.
	 *
	 * @return the number of miic safeguard material adds
	 */
	@Override
	public int getMiicSafeguardMaterialAddsCount() {
		return miicSafeguardMaterialAddPersistence.countAll();
	}

	/**
	 * Updates the miic safeguard material add in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicSafeguardMaterialAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicSafeguardMaterialAdd the miic safeguard material add
	 * @return the miic safeguard material add that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public MiicSafeguardMaterialAdd updateMiicSafeguardMaterialAdd(
		MiicSafeguardMaterialAdd miicSafeguardMaterialAdd) {

		return miicSafeguardMaterialAddPersistence.update(
			miicSafeguardMaterialAdd);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			MiicSafeguardMaterialAddLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		miicSafeguardMaterialAddLocalService =
			(MiicSafeguardMaterialAddLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return MiicSafeguardMaterialAddLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return MiicSafeguardMaterialAdd.class;
	}

	protected String getModelClassName() {
		return MiicSafeguardMaterialAdd.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				miicSafeguardMaterialAddPersistence.getDataSource();

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
	protected MiicApplicantDetailsPersistence miicApplicantDetailsPersistence;

	@Reference
	protected MiicApplicationPersistence miicApplicationPersistence;

	@Reference
	protected MiicApplicationCurrentStagePersistence
		miicApplicationCurrentStagePersistence;

	@Reference
	protected MiicPaymentPersistence miicPaymentPersistence;

	@Reference
	protected MiicSafeguardGoodAddPersistence miicSafeguardGoodAddPersistence;

	protected MiicSafeguardMaterialAddLocalService
		miicSafeguardMaterialAddLocalService;

	@Reference
	protected MiicSafeguardMaterialAddPersistence
		miicSafeguardMaterialAddPersistence;

	@Reference
	protected MiicSuspensionOfCetPersistence miicSuspensionOfCetPersistence;

	@Reference
	protected MiicSuspensionOfCetAddPersistence
		miicSuspensionOfCetAddPersistence;

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
		MiicSafeguardMaterialAddLocalServiceBaseImpl.class);

}