/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service.base;

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

import com.nbp.creative.application.form.service.model.CreativeCompanyEconomicEffect;
import com.nbp.creative.application.form.service.service.CreativeCompanyEconomicEffectLocalService;
import com.nbp.creative.application.form.service.service.persistence.CreativeApplicationCurrentStagePersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeApplicationPersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeCompanyApplicantInformationPersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeCompanyDetailsAddressPersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeCompanyDetailsPersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeCompanyDirectorInformationAddressPersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeCompanyDirectorInformationPersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeCompanyEconomicEffectPersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeCompanyGeneralInformationPersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeContactInfoAddBoxPersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeDirectorListinAddBoxPersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeIndividualDetailsAddressPersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeIndividualDetailsPersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeIndividualEconomicEffectPersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeIndividualGeneralInformationPersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeSocialMediaAddBoxPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the creative company economic effect local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.creative.application.form.service.service.impl.CreativeCompanyEconomicEffectLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.creative.application.form.service.service.impl.CreativeCompanyEconomicEffectLocalServiceImpl
 * @generated
 */
public abstract class CreativeCompanyEconomicEffectLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, CreativeCompanyEconomicEffectLocalService,
			   IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>CreativeCompanyEconomicEffectLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.creative.application.form.service.service.CreativeCompanyEconomicEffectLocalServiceUtil</code>.
	 */

	/**
	 * Adds the creative company economic effect to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeCompanyEconomicEffectLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeCompanyEconomicEffect the creative company economic effect
	 * @return the creative company economic effect that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public CreativeCompanyEconomicEffect addCreativeCompanyEconomicEffect(
		CreativeCompanyEconomicEffect creativeCompanyEconomicEffect) {

		creativeCompanyEconomicEffect.setNew(true);

		return creativeCompanyEconomicEffectPersistence.update(
			creativeCompanyEconomicEffect);
	}

	/**
	 * Creates a new creative company economic effect with the primary key. Does not add the creative company economic effect to the database.
	 *
	 * @param creativeComEconomicEffectId the primary key for the new creative company economic effect
	 * @return the new creative company economic effect
	 */
	@Override
	@Transactional(enabled = false)
	public CreativeCompanyEconomicEffect createCreativeCompanyEconomicEffect(
		long creativeComEconomicEffectId) {

		return creativeCompanyEconomicEffectPersistence.create(
			creativeComEconomicEffectId);
	}

	/**
	 * Deletes the creative company economic effect with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeCompanyEconomicEffectLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeComEconomicEffectId the primary key of the creative company economic effect
	 * @return the creative company economic effect that was removed
	 * @throws PortalException if a creative company economic effect with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public CreativeCompanyEconomicEffect deleteCreativeCompanyEconomicEffect(
			long creativeComEconomicEffectId)
		throws PortalException {

		return creativeCompanyEconomicEffectPersistence.remove(
			creativeComEconomicEffectId);
	}

	/**
	 * Deletes the creative company economic effect from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeCompanyEconomicEffectLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeCompanyEconomicEffect the creative company economic effect
	 * @return the creative company economic effect that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public CreativeCompanyEconomicEffect deleteCreativeCompanyEconomicEffect(
		CreativeCompanyEconomicEffect creativeCompanyEconomicEffect) {

		return creativeCompanyEconomicEffectPersistence.remove(
			creativeCompanyEconomicEffect);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return creativeCompanyEconomicEffectPersistence.dslQuery(dslQuery);
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
			CreativeCompanyEconomicEffect.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return creativeCompanyEconomicEffectPersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeCompanyEconomicEffectModelImpl</code>.
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

		return creativeCompanyEconomicEffectPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeCompanyEconomicEffectModelImpl</code>.
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

		return creativeCompanyEconomicEffectPersistence.findWithDynamicQuery(
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
		return creativeCompanyEconomicEffectPersistence.countWithDynamicQuery(
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

		return creativeCompanyEconomicEffectPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public CreativeCompanyEconomicEffect fetchCreativeCompanyEconomicEffect(
		long creativeComEconomicEffectId) {

		return creativeCompanyEconomicEffectPersistence.fetchByPrimaryKey(
			creativeComEconomicEffectId);
	}

	/**
	 * Returns the creative company economic effect with the primary key.
	 *
	 * @param creativeComEconomicEffectId the primary key of the creative company economic effect
	 * @return the creative company economic effect
	 * @throws PortalException if a creative company economic effect with the primary key could not be found
	 */
	@Override
	public CreativeCompanyEconomicEffect getCreativeCompanyEconomicEffect(
			long creativeComEconomicEffectId)
		throws PortalException {

		return creativeCompanyEconomicEffectPersistence.findByPrimaryKey(
			creativeComEconomicEffectId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			creativeCompanyEconomicEffectLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(
			CreativeCompanyEconomicEffect.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"creativeComEconomicEffectId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			creativeCompanyEconomicEffectLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			CreativeCompanyEconomicEffect.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"creativeComEconomicEffectId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			creativeCompanyEconomicEffectLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(
			CreativeCompanyEconomicEffect.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"creativeComEconomicEffectId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return creativeCompanyEconomicEffectPersistence.create(
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
				"Implement CreativeCompanyEconomicEffectLocalServiceImpl#deleteCreativeCompanyEconomicEffect(CreativeCompanyEconomicEffect) to avoid orphaned data");
		}

		return creativeCompanyEconomicEffectLocalService.
			deleteCreativeCompanyEconomicEffect(
				(CreativeCompanyEconomicEffect)persistedModel);
	}

	@Override
	public BasePersistence<CreativeCompanyEconomicEffect> getBasePersistence() {
		return creativeCompanyEconomicEffectPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return creativeCompanyEconomicEffectPersistence.findByPrimaryKey(
			primaryKeyObj);
	}

	/**
	 * Returns a range of all the creative company economic effects.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeCompanyEconomicEffectModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company economic effects
	 * @param end the upper bound of the range of creative company economic effects (not inclusive)
	 * @return the range of creative company economic effects
	 */
	@Override
	public List<CreativeCompanyEconomicEffect>
		getCreativeCompanyEconomicEffects(int start, int end) {

		return creativeCompanyEconomicEffectPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of creative company economic effects.
	 *
	 * @return the number of creative company economic effects
	 */
	@Override
	public int getCreativeCompanyEconomicEffectsCount() {
		return creativeCompanyEconomicEffectPersistence.countAll();
	}

	/**
	 * Updates the creative company economic effect in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeCompanyEconomicEffectLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeCompanyEconomicEffect the creative company economic effect
	 * @return the creative company economic effect that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public CreativeCompanyEconomicEffect updateCreativeCompanyEconomicEffect(
		CreativeCompanyEconomicEffect creativeCompanyEconomicEffect) {

		return creativeCompanyEconomicEffectPersistence.update(
			creativeCompanyEconomicEffect);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			CreativeCompanyEconomicEffectLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		creativeCompanyEconomicEffectLocalService =
			(CreativeCompanyEconomicEffectLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return CreativeCompanyEconomicEffectLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return CreativeCompanyEconomicEffect.class;
	}

	protected String getModelClassName() {
		return CreativeCompanyEconomicEffect.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				creativeCompanyEconomicEffectPersistence.getDataSource();

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
	protected CreativeApplicationPersistence creativeApplicationPersistence;

	@Reference
	protected CreativeApplicationCurrentStagePersistence
		creativeApplicationCurrentStagePersistence;

	@Reference
	protected CreativeCompanyApplicantInformationPersistence
		creativeCompanyApplicantInformationPersistence;

	@Reference
	protected CreativeCompanyDetailsPersistence
		creativeCompanyDetailsPersistence;

	@Reference
	protected CreativeCompanyDetailsAddressPersistence
		creativeCompanyDetailsAddressPersistence;

	@Reference
	protected CreativeCompanyDirectorInformationPersistence
		creativeCompanyDirectorInformationPersistence;

	@Reference
	protected CreativeCompanyDirectorInformationAddressPersistence
		creativeCompanyDirectorInformationAddressPersistence;

	protected CreativeCompanyEconomicEffectLocalService
		creativeCompanyEconomicEffectLocalService;

	@Reference
	protected CreativeCompanyEconomicEffectPersistence
		creativeCompanyEconomicEffectPersistence;

	@Reference
	protected CreativeCompanyGeneralInformationPersistence
		creativeCompanyGeneralInformationPersistence;

	@Reference
	protected CreativeContactInfoAddBoxPersistence
		creativeContactInfoAddBoxPersistence;

	@Reference
	protected CreativeDirectorListinAddBoxPersistence
		creativeDirectorListinAddBoxPersistence;

	@Reference
	protected CreativeIndividualDetailsPersistence
		creativeIndividualDetailsPersistence;

	@Reference
	protected CreativeIndividualDetailsAddressPersistence
		creativeIndividualDetailsAddressPersistence;

	@Reference
	protected CreativeIndividualEconomicEffectPersistence
		creativeIndividualEconomicEffectPersistence;

	@Reference
	protected CreativeIndividualGeneralInformationPersistence
		creativeIndividualGeneralInformationPersistence;

	@Reference
	protected CreativeSocialMediaAddBoxPersistence
		creativeSocialMediaAddBoxPersistence;

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
		CreativeCompanyEconomicEffectLocalServiceBaseImpl.class);

}