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

import com.nbp.creative.application.form.service.model.CreativeSocialMediaAddBox;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for CreativeSocialMediaAddBox. This utility wraps
 * <code>com.nbp.creative.application.form.service.service.impl.CreativeSocialMediaAddBoxLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeSocialMediaAddBoxLocalService
 * @generated
 */
public class CreativeSocialMediaAddBoxLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.creative.application.form.service.service.impl.CreativeSocialMediaAddBoxLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

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
	public static CreativeSocialMediaAddBox addCreativeSocialMediaAddBox(
		CreativeSocialMediaAddBox creativeSocialMediaAddBox) {

		return getService().addCreativeSocialMediaAddBox(
			creativeSocialMediaAddBox);
	}

	/**
	 * Creates a new creative social media add box with the primary key. Does not add the creative social media add box to the database.
	 *
	 * @param creativeSocialBoxId the primary key for the new creative social media add box
	 * @return the new creative social media add box
	 */
	public static CreativeSocialMediaAddBox createCreativeSocialMediaAddBox(
		long creativeSocialBoxId) {

		return getService().createCreativeSocialMediaAddBox(
			creativeSocialBoxId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	public static void deleteCA_CSB_CAI(long creativeApplicationId) {
		getService().deleteCA_CSB_CAI(creativeApplicationId);
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
	public static CreativeSocialMediaAddBox deleteCreativeSocialMediaAddBox(
		CreativeSocialMediaAddBox creativeSocialMediaAddBox) {

		return getService().deleteCreativeSocialMediaAddBox(
			creativeSocialMediaAddBox);
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
	public static CreativeSocialMediaAddBox deleteCreativeSocialMediaAddBox(
			long creativeSocialBoxId)
		throws PortalException {

		return getService().deleteCreativeSocialMediaAddBox(
			creativeSocialBoxId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeSocialMediaAddBoxModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeSocialMediaAddBoxModelImpl</code>.
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

	public static CreativeSocialMediaAddBox fetchCreativeSocialMediaAddBox(
		long creativeSocialBoxId) {

		return getService().fetchCreativeSocialMediaAddBox(creativeSocialBoxId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static List<CreativeSocialMediaAddBox> getCA_SMB_CAI(
		long creativeApplicationId) {

		return getService().getCA_SMB_CAI(creativeApplicationId);
	}

	/**
	 * Returns the creative social media add box with the primary key.
	 *
	 * @param creativeSocialBoxId the primary key of the creative social media add box
	 * @return the creative social media add box
	 * @throws PortalException if a creative social media add box with the primary key could not be found
	 */
	public static CreativeSocialMediaAddBox getCreativeSocialMediaAddBox(
			long creativeSocialBoxId)
		throws PortalException {

		return getService().getCreativeSocialMediaAddBox(creativeSocialBoxId);
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
	public static List<CreativeSocialMediaAddBox>
		getCreativeSocialMediaAddBoxes(int start, int end) {

		return getService().getCreativeSocialMediaAddBoxes(start, end);
	}

	/**
	 * Returns the number of creative social media add boxes.
	 *
	 * @return the number of creative social media add boxes
	 */
	public static int getCreativeSocialMediaAddBoxesCount() {
		return getService().getCreativeSocialMediaAddBoxesCount();
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
	 * Updates the creative social media add box in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeSocialMediaAddBoxLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeSocialMediaAddBox the creative social media add box
	 * @return the creative social media add box that was updated
	 */
	public static CreativeSocialMediaAddBox updateCreativeSocialMediaAddBox(
		CreativeSocialMediaAddBox creativeSocialMediaAddBox) {

		return getService().updateCreativeSocialMediaAddBox(
			creativeSocialMediaAddBox);
	}

	public static CreativeSocialMediaAddBoxLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<CreativeSocialMediaAddBoxLocalService>
		_serviceSnapshot = new Snapshot<>(
			CreativeSocialMediaAddBoxLocalServiceUtil.class,
			CreativeSocialMediaAddBoxLocalService.class);

}