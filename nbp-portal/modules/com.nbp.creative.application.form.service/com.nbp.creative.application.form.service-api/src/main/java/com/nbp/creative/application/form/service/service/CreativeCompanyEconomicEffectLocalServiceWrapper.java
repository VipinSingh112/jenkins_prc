/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link CreativeCompanyEconomicEffectLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeCompanyEconomicEffectLocalService
 * @generated
 */
public class CreativeCompanyEconomicEffectLocalServiceWrapper
	implements CreativeCompanyEconomicEffectLocalService,
			   ServiceWrapper<CreativeCompanyEconomicEffectLocalService> {

	public CreativeCompanyEconomicEffectLocalServiceWrapper() {
		this(null);
	}

	public CreativeCompanyEconomicEffectLocalServiceWrapper(
		CreativeCompanyEconomicEffectLocalService
			creativeCompanyEconomicEffectLocalService) {

		_creativeCompanyEconomicEffectLocalService =
			creativeCompanyEconomicEffectLocalService;
	}

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
	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeCompanyEconomicEffect addCreativeCompanyEconomicEffect(
			com.nbp.creative.application.form.service.model.
				CreativeCompanyEconomicEffect creativeCompanyEconomicEffect) {

		return _creativeCompanyEconomicEffectLocalService.
			addCreativeCompanyEconomicEffect(creativeCompanyEconomicEffect);
	}

	/**
	 * Creates a new creative company economic effect with the primary key. Does not add the creative company economic effect to the database.
	 *
	 * @param creativeComEconomicEffectId the primary key for the new creative company economic effect
	 * @return the new creative company economic effect
	 */
	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeCompanyEconomicEffect createCreativeCompanyEconomicEffect(
			long creativeComEconomicEffectId) {

		return _creativeCompanyEconomicEffectLocalService.
			createCreativeCompanyEconomicEffect(creativeComEconomicEffectId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeCompanyEconomicEffectLocalService.createPersistedModel(
			primaryKeyObj);
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
	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeCompanyEconomicEffect deleteCreativeCompanyEconomicEffect(
			com.nbp.creative.application.form.service.model.
				CreativeCompanyEconomicEffect creativeCompanyEconomicEffect) {

		return _creativeCompanyEconomicEffectLocalService.
			deleteCreativeCompanyEconomicEffect(creativeCompanyEconomicEffect);
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
	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeCompanyEconomicEffect deleteCreativeCompanyEconomicEffect(
				long creativeComEconomicEffectId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeCompanyEconomicEffectLocalService.
			deleteCreativeCompanyEconomicEffect(creativeComEconomicEffectId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeCompanyEconomicEffectLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _creativeCompanyEconomicEffectLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _creativeCompanyEconomicEffectLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _creativeCompanyEconomicEffectLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _creativeCompanyEconomicEffectLocalService.dynamicQuery(
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
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _creativeCompanyEconomicEffectLocalService.dynamicQuery(
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
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _creativeCompanyEconomicEffectLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _creativeCompanyEconomicEffectLocalService.dynamicQueryCount(
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
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _creativeCompanyEconomicEffectLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeCompanyEconomicEffect fetchbygetCreativeById(
			long creativeApplicationId) {

		return _creativeCompanyEconomicEffectLocalService.
			fetchbygetCreativeById(creativeApplicationId);
	}

	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeCompanyEconomicEffect fetchCreativeCompanyEconomicEffect(
			long creativeComEconomicEffectId) {

		return _creativeCompanyEconomicEffectLocalService.
			fetchCreativeCompanyEconomicEffect(creativeComEconomicEffectId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _creativeCompanyEconomicEffectLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeCompanyEconomicEffect getCreativeById(
			long creativeApplicationId) {

		return _creativeCompanyEconomicEffectLocalService.getCreativeById(
			creativeApplicationId);
	}

	/**
	 * Returns the creative company economic effect with the primary key.
	 *
	 * @param creativeComEconomicEffectId the primary key of the creative company economic effect
	 * @return the creative company economic effect
	 * @throws PortalException if a creative company economic effect with the primary key could not be found
	 */
	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeCompanyEconomicEffect getCreativeCompanyEconomicEffect(
				long creativeComEconomicEffectId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeCompanyEconomicEffectLocalService.
			getCreativeCompanyEconomicEffect(creativeComEconomicEffectId);
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
	public java.util.List
		<com.nbp.creative.application.form.service.model.
			CreativeCompanyEconomicEffect> getCreativeCompanyEconomicEffects(
				int start, int end) {

		return _creativeCompanyEconomicEffectLocalService.
			getCreativeCompanyEconomicEffects(start, end);
	}

	/**
	 * Returns the number of creative company economic effects.
	 *
	 * @return the number of creative company economic effects
	 */
	@Override
	public int getCreativeCompanyEconomicEffectsCount() {
		return _creativeCompanyEconomicEffectLocalService.
			getCreativeCompanyEconomicEffectsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _creativeCompanyEconomicEffectLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _creativeCompanyEconomicEffectLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeCompanyEconomicEffectLocalService.getPersistedModel(
			primaryKeyObj);
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
	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeCompanyEconomicEffect updateCreativeCompanyEconomicEffect(
			com.nbp.creative.application.form.service.model.
				CreativeCompanyEconomicEffect creativeCompanyEconomicEffect) {

		return _creativeCompanyEconomicEffectLocalService.
			updateCreativeCompanyEconomicEffect(creativeCompanyEconomicEffect);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _creativeCompanyEconomicEffectLocalService.getBasePersistence();
	}

	@Override
	public CreativeCompanyEconomicEffectLocalService getWrappedService() {
		return _creativeCompanyEconomicEffectLocalService;
	}

	@Override
	public void setWrappedService(
		CreativeCompanyEconomicEffectLocalService
			creativeCompanyEconomicEffectLocalService) {

		_creativeCompanyEconomicEffectLocalService =
			creativeCompanyEconomicEffectLocalService;
	}

	private CreativeCompanyEconomicEffectLocalService
		_creativeCompanyEconomicEffectLocalService;

}