/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.stage.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.jtb.application.stage.services.exception.NoSuchJtbApplicationDeskVeriException;
import com.nbp.jtb.application.stage.services.model.JtbApplicationDeskVeri;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the jtb application desk veri service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JtbApplicationDeskVeriUtil
 * @generated
 */
@ProviderType
public interface JtbApplicationDeskVeriPersistence
	extends BasePersistence<JtbApplicationDeskVeri> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link JtbApplicationDeskVeriUtil} to access the jtb application desk veri persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the jtb application desk veris where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb application desk veris
	 */
	public java.util.List<JtbApplicationDeskVeri> findBygetJtbAppDV_ById(
		long jtbApplicationId);

	/**
	 * Returns a range of all the jtb application desk veris where jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb application desk veris
	 * @param end the upper bound of the range of jtb application desk veris (not inclusive)
	 * @return the range of matching jtb application desk veris
	 */
	public java.util.List<JtbApplicationDeskVeri> findBygetJtbAppDV_ById(
		long jtbApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the jtb application desk veris where jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb application desk veris
	 * @param end the upper bound of the range of jtb application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb application desk veris
	 */
	public java.util.List<JtbApplicationDeskVeri> findBygetJtbAppDV_ById(
		long jtbApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JtbApplicationDeskVeri>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jtb application desk veris where jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb application desk veris
	 * @param end the upper bound of the range of jtb application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb application desk veris
	 */
	public java.util.List<JtbApplicationDeskVeri> findBygetJtbAppDV_ById(
		long jtbApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JtbApplicationDeskVeri>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jtb application desk veri in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application desk veri
	 * @throws NoSuchJtbApplicationDeskVeriException if a matching jtb application desk veri could not be found
	 */
	public JtbApplicationDeskVeri findBygetJtbAppDV_ById_First(
			long jtbApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JtbApplicationDeskVeri> orderByComparator)
		throws NoSuchJtbApplicationDeskVeriException;

	/**
	 * Returns the first jtb application desk veri in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application desk veri, or <code>null</code> if a matching jtb application desk veri could not be found
	 */
	public JtbApplicationDeskVeri fetchBygetJtbAppDV_ById_First(
		long jtbApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<JtbApplicationDeskVeri>
			orderByComparator);

	/**
	 * Returns the last jtb application desk veri in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application desk veri
	 * @throws NoSuchJtbApplicationDeskVeriException if a matching jtb application desk veri could not be found
	 */
	public JtbApplicationDeskVeri findBygetJtbAppDV_ById_Last(
			long jtbApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JtbApplicationDeskVeri> orderByComparator)
		throws NoSuchJtbApplicationDeskVeriException;

	/**
	 * Returns the last jtb application desk veri in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application desk veri, or <code>null</code> if a matching jtb application desk veri could not be found
	 */
	public JtbApplicationDeskVeri fetchBygetJtbAppDV_ById_Last(
		long jtbApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<JtbApplicationDeskVeri>
			orderByComparator);

	/**
	 * Returns the jtb application desk veris before and after the current jtb application desk veri in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationDeskVeriId the primary key of the current jtb application desk veri
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb application desk veri
	 * @throws NoSuchJtbApplicationDeskVeriException if a jtb application desk veri with the primary key could not be found
	 */
	public JtbApplicationDeskVeri[] findBygetJtbAppDV_ById_PrevAndNext(
			long jtbApplicationDeskVeriId, long jtbApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JtbApplicationDeskVeri> orderByComparator)
		throws NoSuchJtbApplicationDeskVeriException;

	/**
	 * Removes all the jtb application desk veris where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 */
	public void removeBygetJtbAppDV_ById(long jtbApplicationId);

	/**
	 * Returns the number of jtb application desk veris where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching jtb application desk veris
	 */
	public int countBygetJtbAppDV_ById(long jtbApplicationId);

	/**
	 * Caches the jtb application desk veri in the entity cache if it is enabled.
	 *
	 * @param jtbApplicationDeskVeri the jtb application desk veri
	 */
	public void cacheResult(JtbApplicationDeskVeri jtbApplicationDeskVeri);

	/**
	 * Caches the jtb application desk veris in the entity cache if it is enabled.
	 *
	 * @param jtbApplicationDeskVeris the jtb application desk veris
	 */
	public void cacheResult(
		java.util.List<JtbApplicationDeskVeri> jtbApplicationDeskVeris);

	/**
	 * Creates a new jtb application desk veri with the primary key. Does not add the jtb application desk veri to the database.
	 *
	 * @param jtbApplicationDeskVeriId the primary key for the new jtb application desk veri
	 * @return the new jtb application desk veri
	 */
	public JtbApplicationDeskVeri create(long jtbApplicationDeskVeriId);

	/**
	 * Removes the jtb application desk veri with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jtbApplicationDeskVeriId the primary key of the jtb application desk veri
	 * @return the jtb application desk veri that was removed
	 * @throws NoSuchJtbApplicationDeskVeriException if a jtb application desk veri with the primary key could not be found
	 */
	public JtbApplicationDeskVeri remove(long jtbApplicationDeskVeriId)
		throws NoSuchJtbApplicationDeskVeriException;

	public JtbApplicationDeskVeri updateImpl(
		JtbApplicationDeskVeri jtbApplicationDeskVeri);

	/**
	 * Returns the jtb application desk veri with the primary key or throws a <code>NoSuchJtbApplicationDeskVeriException</code> if it could not be found.
	 *
	 * @param jtbApplicationDeskVeriId the primary key of the jtb application desk veri
	 * @return the jtb application desk veri
	 * @throws NoSuchJtbApplicationDeskVeriException if a jtb application desk veri with the primary key could not be found
	 */
	public JtbApplicationDeskVeri findByPrimaryKey(
			long jtbApplicationDeskVeriId)
		throws NoSuchJtbApplicationDeskVeriException;

	/**
	 * Returns the jtb application desk veri with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jtbApplicationDeskVeriId the primary key of the jtb application desk veri
	 * @return the jtb application desk veri, or <code>null</code> if a jtb application desk veri with the primary key could not be found
	 */
	public JtbApplicationDeskVeri fetchByPrimaryKey(
		long jtbApplicationDeskVeriId);

	/**
	 * Returns all the jtb application desk veris.
	 *
	 * @return the jtb application desk veris
	 */
	public java.util.List<JtbApplicationDeskVeri> findAll();

	/**
	 * Returns a range of all the jtb application desk veris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb application desk veris
	 * @param end the upper bound of the range of jtb application desk veris (not inclusive)
	 * @return the range of jtb application desk veris
	 */
	public java.util.List<JtbApplicationDeskVeri> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the jtb application desk veris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb application desk veris
	 * @param end the upper bound of the range of jtb application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jtb application desk veris
	 */
	public java.util.List<JtbApplicationDeskVeri> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JtbApplicationDeskVeri>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jtb application desk veris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb application desk veris
	 * @param end the upper bound of the range of jtb application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jtb application desk veris
	 */
	public java.util.List<JtbApplicationDeskVeri> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JtbApplicationDeskVeri>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the jtb application desk veris from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of jtb application desk veris.
	 *
	 * @return the number of jtb application desk veris
	 */
	public int countAll();

}