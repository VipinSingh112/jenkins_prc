/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link CreativeIndividualEconomicEffectLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeIndividualEconomicEffectLocalService
 * @generated
 */
public class CreativeIndividualEconomicEffectLocalServiceWrapper
	implements CreativeIndividualEconomicEffectLocalService,
			   ServiceWrapper<CreativeIndividualEconomicEffectLocalService> {

	public CreativeIndividualEconomicEffectLocalServiceWrapper() {
		this(null);
	}

	public CreativeIndividualEconomicEffectLocalServiceWrapper(
		CreativeIndividualEconomicEffectLocalService
			creativeIndividualEconomicEffectLocalService) {

		_creativeIndividualEconomicEffectLocalService =
			creativeIndividualEconomicEffectLocalService;
	}

	/**
	 * Adds the creative individual economic effect to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeIndividualEconomicEffectLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeIndividualEconomicEffect the creative individual economic effect
	 * @return the creative individual economic effect that was added
	 */
	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeIndividualEconomicEffect addCreativeIndividualEconomicEffect(
			com.nbp.creative.application.form.service.model.
				CreativeIndividualEconomicEffect
					creativeIndividualEconomicEffect) {

		return _creativeIndividualEconomicEffectLocalService.
			addCreativeIndividualEconomicEffect(
				creativeIndividualEconomicEffect);
	}

	/**
	 * Creates a new creative individual economic effect with the primary key. Does not add the creative individual economic effect to the database.
	 *
	 * @param creativeIndiEcoEffectId the primary key for the new creative individual economic effect
	 * @return the new creative individual economic effect
	 */
	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeIndividualEconomicEffect createCreativeIndividualEconomicEffect(
			long creativeIndiEcoEffectId) {

		return _creativeIndividualEconomicEffectLocalService.
			createCreativeIndividualEconomicEffect(creativeIndiEcoEffectId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeIndividualEconomicEffectLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the creative individual economic effect from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeIndividualEconomicEffectLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeIndividualEconomicEffect the creative individual economic effect
	 * @return the creative individual economic effect that was removed
	 */
	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeIndividualEconomicEffect deleteCreativeIndividualEconomicEffect(
			com.nbp.creative.application.form.service.model.
				CreativeIndividualEconomicEffect
					creativeIndividualEconomicEffect) {

		return _creativeIndividualEconomicEffectLocalService.
			deleteCreativeIndividualEconomicEffect(
				creativeIndividualEconomicEffect);
	}

	/**
	 * Deletes the creative individual economic effect with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeIndividualEconomicEffectLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeIndiEcoEffectId the primary key of the creative individual economic effect
	 * @return the creative individual economic effect that was removed
	 * @throws PortalException if a creative individual economic effect with the primary key could not be found
	 */
	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeIndividualEconomicEffect deleteCreativeIndividualEconomicEffect(
				long creativeIndiEcoEffectId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeIndividualEconomicEffectLocalService.
			deleteCreativeIndividualEconomicEffect(creativeIndiEcoEffectId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeIndividualEconomicEffectLocalService.
			deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _creativeIndividualEconomicEffectLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _creativeIndividualEconomicEffectLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _creativeIndividualEconomicEffectLocalService.dynamicQuery();
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

		return _creativeIndividualEconomicEffectLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeIndividualEconomicEffectModelImpl</code>.
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

		return _creativeIndividualEconomicEffectLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeIndividualEconomicEffectModelImpl</code>.
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

		return _creativeIndividualEconomicEffectLocalService.dynamicQuery(
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

		return _creativeIndividualEconomicEffectLocalService.dynamicQueryCount(
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

		return _creativeIndividualEconomicEffectLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeIndividualEconomicEffect fetchBygetCreativeById(
			long creativeApplicationId) {

		return _creativeIndividualEconomicEffectLocalService.
			fetchBygetCreativeById(creativeApplicationId);
	}

	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeIndividualEconomicEffect fetchCreativeIndividualEconomicEffect(
			long creativeIndiEcoEffectId) {

		return _creativeIndividualEconomicEffectLocalService.
			fetchCreativeIndividualEconomicEffect(creativeIndiEcoEffectId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _creativeIndividualEconomicEffectLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeIndividualEconomicEffect getCreativeById(
			long creativeApplicationId) {

		return _creativeIndividualEconomicEffectLocalService.getCreativeById(
			creativeApplicationId);
	}

	/**
	 * Returns the creative individual economic effect with the primary key.
	 *
	 * @param creativeIndiEcoEffectId the primary key of the creative individual economic effect
	 * @return the creative individual economic effect
	 * @throws PortalException if a creative individual economic effect with the primary key could not be found
	 */
	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeIndividualEconomicEffect getCreativeIndividualEconomicEffect(
				long creativeIndiEcoEffectId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeIndividualEconomicEffectLocalService.
			getCreativeIndividualEconomicEffect(creativeIndiEcoEffectId);
	}

	/**
	 * Returns a range of all the creative individual economic effects.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeIndividualEconomicEffectModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative individual economic effects
	 * @param end the upper bound of the range of creative individual economic effects (not inclusive)
	 * @return the range of creative individual economic effects
	 */
	@Override
	public java.util.List
		<com.nbp.creative.application.form.service.model.
			CreativeIndividualEconomicEffect>
				getCreativeIndividualEconomicEffects(int start, int end) {

		return _creativeIndividualEconomicEffectLocalService.
			getCreativeIndividualEconomicEffects(start, end);
	}

	/**
	 * Returns the number of creative individual economic effects.
	 *
	 * @return the number of creative individual economic effects
	 */
	@Override
	public int getCreativeIndividualEconomicEffectsCount() {
		return _creativeIndividualEconomicEffectLocalService.
			getCreativeIndividualEconomicEffectsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _creativeIndividualEconomicEffectLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _creativeIndividualEconomicEffectLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeIndividualEconomicEffectLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the creative individual economic effect in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeIndividualEconomicEffectLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeIndividualEconomicEffect the creative individual economic effect
	 * @return the creative individual economic effect that was updated
	 */
	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeIndividualEconomicEffect updateCreativeIndividualEconomicEffect(
			com.nbp.creative.application.form.service.model.
				CreativeIndividualEconomicEffect
					creativeIndividualEconomicEffect) {

		return _creativeIndividualEconomicEffectLocalService.
			updateCreativeIndividualEconomicEffect(
				creativeIndividualEconomicEffect);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _creativeIndividualEconomicEffectLocalService.
			getBasePersistence();
	}

	@Override
	public CreativeIndividualEconomicEffectLocalService getWrappedService() {
		return _creativeIndividualEconomicEffectLocalService;
	}

	@Override
	public void setWrappedService(
		CreativeIndividualEconomicEffectLocalService
			creativeIndividualEconomicEffectLocalService) {

		_creativeIndividualEconomicEffectLocalService =
			creativeIndividualEconomicEffectLocalService;
	}

	private CreativeIndividualEconomicEffectLocalService
		_creativeIndividualEconomicEffectLocalService;

}