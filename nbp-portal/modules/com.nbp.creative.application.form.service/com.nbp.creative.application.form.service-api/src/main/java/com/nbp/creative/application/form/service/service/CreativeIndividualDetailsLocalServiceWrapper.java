/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link CreativeIndividualDetailsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeIndividualDetailsLocalService
 * @generated
 */
public class CreativeIndividualDetailsLocalServiceWrapper
	implements CreativeIndividualDetailsLocalService,
			   ServiceWrapper<CreativeIndividualDetailsLocalService> {

	public CreativeIndividualDetailsLocalServiceWrapper() {
		this(null);
	}

	public CreativeIndividualDetailsLocalServiceWrapper(
		CreativeIndividualDetailsLocalService
			creativeIndividualDetailsLocalService) {

		_creativeIndividualDetailsLocalService =
			creativeIndividualDetailsLocalService;
	}

	/**
	 * Adds the creative individual details to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeIndividualDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeIndividualDetails the creative individual details
	 * @return the creative individual details that was added
	 */
	@Override
	public
		com.nbp.creative.application.form.service.model.
			CreativeIndividualDetails addCreativeIndividualDetails(
				com.nbp.creative.application.form.service.model.
					CreativeIndividualDetails creativeIndividualDetails) {

		return _creativeIndividualDetailsLocalService.
			addCreativeIndividualDetails(creativeIndividualDetails);
	}

	/**
	 * Creates a new creative individual details with the primary key. Does not add the creative individual details to the database.
	 *
	 * @param creativeIndividualDetailsId the primary key for the new creative individual details
	 * @return the new creative individual details
	 */
	@Override
	public
		com.nbp.creative.application.form.service.model.
			CreativeIndividualDetails createCreativeIndividualDetails(
				long creativeIndividualDetailsId) {

		return _creativeIndividualDetailsLocalService.
			createCreativeIndividualDetails(creativeIndividualDetailsId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeIndividualDetailsLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the creative individual details from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeIndividualDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeIndividualDetails the creative individual details
	 * @return the creative individual details that was removed
	 */
	@Override
	public
		com.nbp.creative.application.form.service.model.
			CreativeIndividualDetails deleteCreativeIndividualDetails(
				com.nbp.creative.application.form.service.model.
					CreativeIndividualDetails creativeIndividualDetails) {

		return _creativeIndividualDetailsLocalService.
			deleteCreativeIndividualDetails(creativeIndividualDetails);
	}

	/**
	 * Deletes the creative individual details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeIndividualDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeIndividualDetailsId the primary key of the creative individual details
	 * @return the creative individual details that was removed
	 * @throws PortalException if a creative individual details with the primary key could not be found
	 */
	@Override
	public
		com.nbp.creative.application.form.service.model.
			CreativeIndividualDetails deleteCreativeIndividualDetails(
					long creativeIndividualDetailsId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeIndividualDetailsLocalService.
			deleteCreativeIndividualDetails(creativeIndividualDetailsId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeIndividualDetailsLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _creativeIndividualDetailsLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _creativeIndividualDetailsLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _creativeIndividualDetailsLocalService.dynamicQuery();
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

		return _creativeIndividualDetailsLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeIndividualDetailsModelImpl</code>.
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

		return _creativeIndividualDetailsLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeIndividualDetailsModelImpl</code>.
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

		return _creativeIndividualDetailsLocalService.dynamicQuery(
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

		return _creativeIndividualDetailsLocalService.dynamicQueryCount(
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

		return _creativeIndividualDetailsLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.creative.application.form.service.model.
			CreativeIndividualDetails fetchCreativeIndividualDetails(
				long creativeIndividualDetailsId) {

		return _creativeIndividualDetailsLocalService.
			fetchCreativeIndividualDetails(creativeIndividualDetailsId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _creativeIndividualDetailsLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public
		com.nbp.creative.application.form.service.model.
			CreativeIndividualDetails getCreativeById(
				long creativeApplicationId) {

		return _creativeIndividualDetailsLocalService.getCreativeById(
			creativeApplicationId);
	}

	/**
	 * Returns the creative individual details with the primary key.
	 *
	 * @param creativeIndividualDetailsId the primary key of the creative individual details
	 * @return the creative individual details
	 * @throws PortalException if a creative individual details with the primary key could not be found
	 */
	@Override
	public
		com.nbp.creative.application.form.service.model.
			CreativeIndividualDetails getCreativeIndividualDetails(
					long creativeIndividualDetailsId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeIndividualDetailsLocalService.
			getCreativeIndividualDetails(creativeIndividualDetailsId);
	}

	/**
	 * Returns a range of all the creative individual detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeIndividualDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative individual detailses
	 * @param end the upper bound of the range of creative individual detailses (not inclusive)
	 * @return the range of creative individual detailses
	 */
	@Override
	public java.util.List
		<com.nbp.creative.application.form.service.model.
			CreativeIndividualDetails> getCreativeIndividualDetailses(
				int start, int end) {

		return _creativeIndividualDetailsLocalService.
			getCreativeIndividualDetailses(start, end);
	}

	/**
	 * Returns the number of creative individual detailses.
	 *
	 * @return the number of creative individual detailses
	 */
	@Override
	public int getCreativeIndividualDetailsesCount() {
		return _creativeIndividualDetailsLocalService.
			getCreativeIndividualDetailsesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _creativeIndividualDetailsLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _creativeIndividualDetailsLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeIndividualDetailsLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the creative individual details in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeIndividualDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeIndividualDetails the creative individual details
	 * @return the creative individual details that was updated
	 */
	@Override
	public
		com.nbp.creative.application.form.service.model.
			CreativeIndividualDetails updateCreativeIndividualDetails(
				com.nbp.creative.application.form.service.model.
					CreativeIndividualDetails creativeIndividualDetails) {

		return _creativeIndividualDetailsLocalService.
			updateCreativeIndividualDetails(creativeIndividualDetails);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _creativeIndividualDetailsLocalService.getBasePersistence();
	}

	@Override
	public CreativeIndividualDetailsLocalService getWrappedService() {
		return _creativeIndividualDetailsLocalService;
	}

	@Override
	public void setWrappedService(
		CreativeIndividualDetailsLocalService
			creativeIndividualDetailsLocalService) {

		_creativeIndividualDetailsLocalService =
			creativeIndividualDetailsLocalService;
	}

	private CreativeIndividualDetailsLocalService
		_creativeIndividualDetailsLocalService;

}