/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.creative.application.form.service.model.CreativeContactInfoAddBox;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for CreativeContactInfoAddBox. This utility wraps
 * <code>com.nbp.creative.application.form.service.service.impl.CreativeContactInfoAddBoxLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeContactInfoAddBoxLocalService
 * @generated
 */
public class CreativeContactInfoAddBoxLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.creative.application.form.service.service.impl.CreativeContactInfoAddBoxLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

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
	public static CreativeContactInfoAddBox addCreativeContactInfoAddBox(
		CreativeContactInfoAddBox creativeContactInfoAddBox) {

		return getService().addCreativeContactInfoAddBox(
			creativeContactInfoAddBox);
	}

	/**
	 * Creates a new creative contact info add box with the primary key. Does not add the creative contact info add box to the database.
	 *
	 * @param creativeContactBoxId the primary key for the new creative contact info add box
	 * @return the new creative contact info add box
	 */
	public static CreativeContactInfoAddBox createCreativeContactInfoAddBox(
		long creativeContactBoxId) {

		return getService().createCreativeContactInfoAddBox(
			creativeContactBoxId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	public static void deleteCA_CCB_CAI(long creativeApplicationId) {
		getService().deleteCA_CCB_CAI(creativeApplicationId);
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
	public static CreativeContactInfoAddBox deleteCreativeContactInfoAddBox(
		CreativeContactInfoAddBox creativeContactInfoAddBox) {

		return getService().deleteCreativeContactInfoAddBox(
			creativeContactInfoAddBox);
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
	public static CreativeContactInfoAddBox deleteCreativeContactInfoAddBox(
			long creativeContactBoxId)
		throws PortalException {

		return getService().deleteCreativeContactInfoAddBox(
			creativeContactBoxId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static CreativeContactInfoAddBox fetchCreativeContactInfoAddBox(
		long creativeContactBoxId) {

		return getService().fetchCreativeContactInfoAddBox(
			creativeContactBoxId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static List<CreativeContactInfoAddBox> getCA_CCB_CAI(
		long creativeApplicationId) {

		return getService().getCA_CCB_CAI(creativeApplicationId);
	}

	/**
	 * Returns the creative contact info add box with the primary key.
	 *
	 * @param creativeContactBoxId the primary key of the creative contact info add box
	 * @return the creative contact info add box
	 * @throws PortalException if a creative contact info add box with the primary key could not be found
	 */
	public static CreativeContactInfoAddBox getCreativeContactInfoAddBox(
			long creativeContactBoxId)
		throws PortalException {

		return getService().getCreativeContactInfoAddBox(creativeContactBoxId);
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
	public static List<CreativeContactInfoAddBox>
		getCreativeContactInfoAddBoxes(int start, int end) {

		return getService().getCreativeContactInfoAddBoxes(start, end);
	}

	/**
	 * Returns the number of creative contact info add boxes.
	 *
	 * @return the number of creative contact info add boxes
	 */
	public static int getCreativeContactInfoAddBoxesCount() {
		return getService().getCreativeContactInfoAddBoxesCount();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
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
	public static CreativeContactInfoAddBox updateCreativeContactInfoAddBox(
		CreativeContactInfoAddBox creativeContactInfoAddBox) {

		return getService().updateCreativeContactInfoAddBox(
			creativeContactInfoAddBox);
	}

	public static CreativeContactInfoAddBoxLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<CreativeContactInfoAddBoxLocalService>
		_serviceSnapshot = new Snapshot<>(
			CreativeContactInfoAddBoxLocalServiceUtil.class,
			CreativeContactInfoAddBoxLocalService.class);

}