/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link CreativeContactInfoAddBoxLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeContactInfoAddBoxLocalService
 * @generated
 */
public class CreativeContactInfoAddBoxLocalServiceWrapper
	implements CreativeContactInfoAddBoxLocalService,
			   ServiceWrapper<CreativeContactInfoAddBoxLocalService> {

	public CreativeContactInfoAddBoxLocalServiceWrapper() {
		this(null);
	}

	public CreativeContactInfoAddBoxLocalServiceWrapper(
		CreativeContactInfoAddBoxLocalService
			creativeContactInfoAddBoxLocalService) {

		_creativeContactInfoAddBoxLocalService =
			creativeContactInfoAddBoxLocalService;
	}

	/**
	 * Adds the creative contact info add box to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeContactInfoAddBoxLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeContactInfoAddBox the creative contact info add box
	 * @return the creative contact info add box that was added
	 */
	@Override
	public
		com.nbp.creative.application.form.service.model.
			CreativeContactInfoAddBox addCreativeContactInfoAddBox(
				com.nbp.creative.application.form.service.model.
					CreativeContactInfoAddBox creativeContactInfoAddBox) {

		return _creativeContactInfoAddBoxLocalService.
			addCreativeContactInfoAddBox(creativeContactInfoAddBox);
	}

	/**
	 * Creates a new creative contact info add box with the primary key. Does not add the creative contact info add box to the database.
	 *
	 * @param creativeContactBoxId the primary key for the new creative contact info add box
	 * @return the new creative contact info add box
	 */
	@Override
	public
		com.nbp.creative.application.form.service.model.
			CreativeContactInfoAddBox createCreativeContactInfoAddBox(
				long creativeContactBoxId) {

		return _creativeContactInfoAddBoxLocalService.
			createCreativeContactInfoAddBox(creativeContactBoxId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeContactInfoAddBoxLocalService.createPersistedModel(
			primaryKeyObj);
	}

	@Override
	public void deleteCA_CCB_CAI(long creativeApplicationId) {
		_creativeContactInfoAddBoxLocalService.deleteCA_CCB_CAI(
			creativeApplicationId);
	}

	/**
	 * Deletes the creative contact info add box from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeContactInfoAddBoxLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeContactInfoAddBox the creative contact info add box
	 * @return the creative contact info add box that was removed
	 */
	@Override
	public
		com.nbp.creative.application.form.service.model.
			CreativeContactInfoAddBox deleteCreativeContactInfoAddBox(
				com.nbp.creative.application.form.service.model.
					CreativeContactInfoAddBox creativeContactInfoAddBox) {

		return _creativeContactInfoAddBoxLocalService.
			deleteCreativeContactInfoAddBox(creativeContactInfoAddBox);
	}

	/**
	 * Deletes the creative contact info add box with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeContactInfoAddBoxLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeContactBoxId the primary key of the creative contact info add box
	 * @return the creative contact info add box that was removed
	 * @throws PortalException if a creative contact info add box with the primary key could not be found
	 */
	@Override
	public
		com.nbp.creative.application.form.service.model.
			CreativeContactInfoAddBox deleteCreativeContactInfoAddBox(
					long creativeContactBoxId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeContactInfoAddBoxLocalService.
			deleteCreativeContactInfoAddBox(creativeContactBoxId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeContactInfoAddBoxLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _creativeContactInfoAddBoxLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _creativeContactInfoAddBoxLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _creativeContactInfoAddBoxLocalService.dynamicQuery();
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

		return _creativeContactInfoAddBoxLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeContactInfoAddBoxModelImpl</code>.
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

		return _creativeContactInfoAddBoxLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeContactInfoAddBoxModelImpl</code>.
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

		return _creativeContactInfoAddBoxLocalService.dynamicQuery(
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

		return _creativeContactInfoAddBoxLocalService.dynamicQueryCount(
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

		return _creativeContactInfoAddBoxLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.creative.application.form.service.model.
			CreativeContactInfoAddBox fetchCreativeContactInfoAddBox(
				long creativeContactBoxId) {

		return _creativeContactInfoAddBoxLocalService.
			fetchCreativeContactInfoAddBox(creativeContactBoxId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _creativeContactInfoAddBoxLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.creative.application.form.service.model.
			CreativeContactInfoAddBox> getCA_CCB_CAI(
				long creativeApplicationId) {

		return _creativeContactInfoAddBoxLocalService.getCA_CCB_CAI(
			creativeApplicationId);
	}

	/**
	 * Returns the creative contact info add box with the primary key.
	 *
	 * @param creativeContactBoxId the primary key of the creative contact info add box
	 * @return the creative contact info add box
	 * @throws PortalException if a creative contact info add box with the primary key could not be found
	 */
	@Override
	public
		com.nbp.creative.application.form.service.model.
			CreativeContactInfoAddBox getCreativeContactInfoAddBox(
					long creativeContactBoxId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeContactInfoAddBoxLocalService.
			getCreativeContactInfoAddBox(creativeContactBoxId);
	}

	/**
	 * Returns a range of all the creative contact info add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeContactInfoAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative contact info add boxes
	 * @param end the upper bound of the range of creative contact info add boxes (not inclusive)
	 * @return the range of creative contact info add boxes
	 */
	@Override
	public java.util.List
		<com.nbp.creative.application.form.service.model.
			CreativeContactInfoAddBox> getCreativeContactInfoAddBoxes(
				int start, int end) {

		return _creativeContactInfoAddBoxLocalService.
			getCreativeContactInfoAddBoxes(start, end);
	}

	/**
	 * Returns the number of creative contact info add boxes.
	 *
	 * @return the number of creative contact info add boxes
	 */
	@Override
	public int getCreativeContactInfoAddBoxesCount() {
		return _creativeContactInfoAddBoxLocalService.
			getCreativeContactInfoAddBoxesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _creativeContactInfoAddBoxLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _creativeContactInfoAddBoxLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeContactInfoAddBoxLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the creative contact info add box in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeContactInfoAddBoxLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeContactInfoAddBox the creative contact info add box
	 * @return the creative contact info add box that was updated
	 */
	@Override
	public
		com.nbp.creative.application.form.service.model.
			CreativeContactInfoAddBox updateCreativeContactInfoAddBox(
				com.nbp.creative.application.form.service.model.
					CreativeContactInfoAddBox creativeContactInfoAddBox) {

		return _creativeContactInfoAddBoxLocalService.
			updateCreativeContactInfoAddBox(creativeContactInfoAddBox);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _creativeContactInfoAddBoxLocalService.getBasePersistence();
	}

	@Override
	public CreativeContactInfoAddBoxLocalService getWrappedService() {
		return _creativeContactInfoAddBoxLocalService;
	}

	@Override
	public void setWrappedService(
		CreativeContactInfoAddBoxLocalService
			creativeContactInfoAddBoxLocalService) {

		_creativeContactInfoAddBoxLocalService =
			creativeContactInfoAddBoxLocalService;
	}

	private CreativeContactInfoAddBoxLocalService
		_creativeContactInfoAddBoxLocalService;

}