/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link CreativeSocialMediaAddBoxLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeSocialMediaAddBoxLocalService
 * @generated
 */
public class CreativeSocialMediaAddBoxLocalServiceWrapper
	implements CreativeSocialMediaAddBoxLocalService,
			   ServiceWrapper<CreativeSocialMediaAddBoxLocalService> {

	public CreativeSocialMediaAddBoxLocalServiceWrapper() {
		this(null);
	}

	public CreativeSocialMediaAddBoxLocalServiceWrapper(
		CreativeSocialMediaAddBoxLocalService
			creativeSocialMediaAddBoxLocalService) {

		_creativeSocialMediaAddBoxLocalService =
			creativeSocialMediaAddBoxLocalService;
	}

	/**
	 * Adds the creative social media add box to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeSocialMediaAddBoxLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeSocialMediaAddBox the creative social media add box
	 * @return the creative social media add box that was added
	 */
	@Override
	public
		com.nbp.creative.application.form.service.model.
			CreativeSocialMediaAddBox addCreativeSocialMediaAddBox(
				com.nbp.creative.application.form.service.model.
					CreativeSocialMediaAddBox creativeSocialMediaAddBox) {

		return _creativeSocialMediaAddBoxLocalService.
			addCreativeSocialMediaAddBox(creativeSocialMediaAddBox);
	}

	/**
	 * Creates a new creative social media add box with the primary key. Does not add the creative social media add box to the database.
	 *
	 * @param creativeSocialBoxId the primary key for the new creative social media add box
	 * @return the new creative social media add box
	 */
	@Override
	public
		com.nbp.creative.application.form.service.model.
			CreativeSocialMediaAddBox createCreativeSocialMediaAddBox(
				long creativeSocialBoxId) {

		return _creativeSocialMediaAddBoxLocalService.
			createCreativeSocialMediaAddBox(creativeSocialBoxId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeSocialMediaAddBoxLocalService.createPersistedModel(
			primaryKeyObj);
	}

	@Override
	public void deleteCA_CSB_CAI(long creativeApplicationId) {
		_creativeSocialMediaAddBoxLocalService.deleteCA_CSB_CAI(
			creativeApplicationId);
	}

	/**
	 * Deletes the creative social media add box from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeSocialMediaAddBoxLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeSocialMediaAddBox the creative social media add box
	 * @return the creative social media add box that was removed
	 */
	@Override
	public
		com.nbp.creative.application.form.service.model.
			CreativeSocialMediaAddBox deleteCreativeSocialMediaAddBox(
				com.nbp.creative.application.form.service.model.
					CreativeSocialMediaAddBox creativeSocialMediaAddBox) {

		return _creativeSocialMediaAddBoxLocalService.
			deleteCreativeSocialMediaAddBox(creativeSocialMediaAddBox);
	}

	/**
	 * Deletes the creative social media add box with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeSocialMediaAddBoxLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeSocialBoxId the primary key of the creative social media add box
	 * @return the creative social media add box that was removed
	 * @throws PortalException if a creative social media add box with the primary key could not be found
	 */
	@Override
	public
		com.nbp.creative.application.form.service.model.
			CreativeSocialMediaAddBox deleteCreativeSocialMediaAddBox(
					long creativeSocialBoxId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeSocialMediaAddBoxLocalService.
			deleteCreativeSocialMediaAddBox(creativeSocialBoxId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeSocialMediaAddBoxLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _creativeSocialMediaAddBoxLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _creativeSocialMediaAddBoxLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _creativeSocialMediaAddBoxLocalService.dynamicQuery();
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

		return _creativeSocialMediaAddBoxLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeSocialMediaAddBoxModelImpl</code>.
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

		return _creativeSocialMediaAddBoxLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeSocialMediaAddBoxModelImpl</code>.
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

		return _creativeSocialMediaAddBoxLocalService.dynamicQuery(
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

		return _creativeSocialMediaAddBoxLocalService.dynamicQueryCount(
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

		return _creativeSocialMediaAddBoxLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.creative.application.form.service.model.
			CreativeSocialMediaAddBox fetchCreativeSocialMediaAddBox(
				long creativeSocialBoxId) {

		return _creativeSocialMediaAddBoxLocalService.
			fetchCreativeSocialMediaAddBox(creativeSocialBoxId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _creativeSocialMediaAddBoxLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.creative.application.form.service.model.
			CreativeSocialMediaAddBox> getCA_SMB_CAI(
				long creativeApplicationId) {

		return _creativeSocialMediaAddBoxLocalService.getCA_SMB_CAI(
			creativeApplicationId);
	}

	/**
	 * Returns the creative social media add box with the primary key.
	 *
	 * @param creativeSocialBoxId the primary key of the creative social media add box
	 * @return the creative social media add box
	 * @throws PortalException if a creative social media add box with the primary key could not be found
	 */
	@Override
	public
		com.nbp.creative.application.form.service.model.
			CreativeSocialMediaAddBox getCreativeSocialMediaAddBox(
					long creativeSocialBoxId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeSocialMediaAddBoxLocalService.
			getCreativeSocialMediaAddBox(creativeSocialBoxId);
	}

	/**
	 * Returns a range of all the creative social media add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeSocialMediaAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative social media add boxes
	 * @param end the upper bound of the range of creative social media add boxes (not inclusive)
	 * @return the range of creative social media add boxes
	 */
	@Override
	public java.util.List
		<com.nbp.creative.application.form.service.model.
			CreativeSocialMediaAddBox> getCreativeSocialMediaAddBoxes(
				int start, int end) {

		return _creativeSocialMediaAddBoxLocalService.
			getCreativeSocialMediaAddBoxes(start, end);
	}

	/**
	 * Returns the number of creative social media add boxes.
	 *
	 * @return the number of creative social media add boxes
	 */
	@Override
	public int getCreativeSocialMediaAddBoxesCount() {
		return _creativeSocialMediaAddBoxLocalService.
			getCreativeSocialMediaAddBoxesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _creativeSocialMediaAddBoxLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _creativeSocialMediaAddBoxLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeSocialMediaAddBoxLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the creative social media add box in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeSocialMediaAddBoxLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeSocialMediaAddBox the creative social media add box
	 * @return the creative social media add box that was updated
	 */
	@Override
	public
		com.nbp.creative.application.form.service.model.
			CreativeSocialMediaAddBox updateCreativeSocialMediaAddBox(
				com.nbp.creative.application.form.service.model.
					CreativeSocialMediaAddBox creativeSocialMediaAddBox) {

		return _creativeSocialMediaAddBoxLocalService.
			updateCreativeSocialMediaAddBox(creativeSocialMediaAddBox);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _creativeSocialMediaAddBoxLocalService.getBasePersistence();
	}

	@Override
	public CreativeSocialMediaAddBoxLocalService getWrappedService() {
		return _creativeSocialMediaAddBoxLocalService;
	}

	@Override
	public void setWrappedService(
		CreativeSocialMediaAddBoxLocalService
			creativeSocialMediaAddBoxLocalService) {

		_creativeSocialMediaAddBoxLocalService =
			creativeSocialMediaAddBoxLocalService;
	}

	private CreativeSocialMediaAddBoxLocalService
		_creativeSocialMediaAddBoxLocalService;

}