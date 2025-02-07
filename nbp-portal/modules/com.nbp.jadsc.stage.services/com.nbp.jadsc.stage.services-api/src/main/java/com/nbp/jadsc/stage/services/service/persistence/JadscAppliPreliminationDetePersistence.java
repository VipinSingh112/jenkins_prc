/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.stage.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.jadsc.stage.services.exception.NoSuchJadscAppliPreliminationDeteException;
import com.nbp.jadsc.stage.services.model.JadscAppliPreliminationDete;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the jadsc appli prelimination dete service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JadscAppliPreliminationDeteUtil
 * @generated
 */
@ProviderType
public interface JadscAppliPreliminationDetePersistence
	extends BasePersistence<JadscAppliPreliminationDete> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link JadscAppliPreliminationDeteUtil} to access the jadsc appli prelimination dete persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the jadsc appli prelimination dete where caseId = &#63; or throws a <code>NoSuchJadscAppliPreliminationDeteException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching jadsc appli prelimination dete
	 * @throws NoSuchJadscAppliPreliminationDeteException if a matching jadsc appli prelimination dete could not be found
	 */
	public JadscAppliPreliminationDete findBygetJadsc_PD_CI(String caseId)
		throws NoSuchJadscAppliPreliminationDeteException;

	/**
	 * Returns the jadsc appli prelimination dete where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching jadsc appli prelimination dete, or <code>null</code> if a matching jadsc appli prelimination dete could not be found
	 */
	public JadscAppliPreliminationDete fetchBygetJadsc_PD_CI(String caseId);

	/**
	 * Returns the jadsc appli prelimination dete where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc appli prelimination dete, or <code>null</code> if a matching jadsc appli prelimination dete could not be found
	 */
	public JadscAppliPreliminationDete fetchBygetJadsc_PD_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the jadsc appli prelimination dete where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the jadsc appli prelimination dete that was removed
	 */
	public JadscAppliPreliminationDete removeBygetJadsc_PD_CI(String caseId)
		throws NoSuchJadscAppliPreliminationDeteException;

	/**
	 * Returns the number of jadsc appli prelimination detes where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jadsc appli prelimination detes
	 */
	public int countBygetJadsc_PD_CI(String caseId);

	/**
	 * Returns all the jadsc appli prelimination detes where Outcome = &#63;.
	 *
	 * @param Outcome the outcome
	 * @return the matching jadsc appli prelimination detes
	 */
	public java.util.List<JadscAppliPreliminationDete> findBygetJadsc_By_PD(
		String Outcome);

	/**
	 * Returns a range of all the jadsc appli prelimination detes where Outcome = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliPreliminationDeteModelImpl</code>.
	 * </p>
	 *
	 * @param Outcome the outcome
	 * @param start the lower bound of the range of jadsc appli prelimination detes
	 * @param end the upper bound of the range of jadsc appli prelimination detes (not inclusive)
	 * @return the range of matching jadsc appli prelimination detes
	 */
	public java.util.List<JadscAppliPreliminationDete> findBygetJadsc_By_PD(
		String Outcome, int start, int end);

	/**
	 * Returns an ordered range of all the jadsc appli prelimination detes where Outcome = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliPreliminationDeteModelImpl</code>.
	 * </p>
	 *
	 * @param Outcome the outcome
	 * @param start the lower bound of the range of jadsc appli prelimination detes
	 * @param end the upper bound of the range of jadsc appli prelimination detes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc appli prelimination detes
	 */
	public java.util.List<JadscAppliPreliminationDete> findBygetJadsc_By_PD(
		String Outcome, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JadscAppliPreliminationDete> orderByComparator);

	/**
	 * Returns an ordered range of all the jadsc appli prelimination detes where Outcome = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliPreliminationDeteModelImpl</code>.
	 * </p>
	 *
	 * @param Outcome the outcome
	 * @param start the lower bound of the range of jadsc appli prelimination detes
	 * @param end the upper bound of the range of jadsc appli prelimination detes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc appli prelimination detes
	 */
	public java.util.List<JadscAppliPreliminationDete> findBygetJadsc_By_PD(
		String Outcome, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JadscAppliPreliminationDete> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jadsc appli prelimination dete in the ordered set where Outcome = &#63;.
	 *
	 * @param Outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc appli prelimination dete
	 * @throws NoSuchJadscAppliPreliminationDeteException if a matching jadsc appli prelimination dete could not be found
	 */
	public JadscAppliPreliminationDete findBygetJadsc_By_PD_First(
			String Outcome,
			com.liferay.portal.kernel.util.OrderByComparator
				<JadscAppliPreliminationDete> orderByComparator)
		throws NoSuchJadscAppliPreliminationDeteException;

	/**
	 * Returns the first jadsc appli prelimination dete in the ordered set where Outcome = &#63;.
	 *
	 * @param Outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc appli prelimination dete, or <code>null</code> if a matching jadsc appli prelimination dete could not be found
	 */
	public JadscAppliPreliminationDete fetchBygetJadsc_By_PD_First(
		String Outcome,
		com.liferay.portal.kernel.util.OrderByComparator
			<JadscAppliPreliminationDete> orderByComparator);

	/**
	 * Returns the last jadsc appli prelimination dete in the ordered set where Outcome = &#63;.
	 *
	 * @param Outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc appli prelimination dete
	 * @throws NoSuchJadscAppliPreliminationDeteException if a matching jadsc appli prelimination dete could not be found
	 */
	public JadscAppliPreliminationDete findBygetJadsc_By_PD_Last(
			String Outcome,
			com.liferay.portal.kernel.util.OrderByComparator
				<JadscAppliPreliminationDete> orderByComparator)
		throws NoSuchJadscAppliPreliminationDeteException;

	/**
	 * Returns the last jadsc appli prelimination dete in the ordered set where Outcome = &#63;.
	 *
	 * @param Outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc appli prelimination dete, or <code>null</code> if a matching jadsc appli prelimination dete could not be found
	 */
	public JadscAppliPreliminationDete fetchBygetJadsc_By_PD_Last(
		String Outcome,
		com.liferay.portal.kernel.util.OrderByComparator
			<JadscAppliPreliminationDete> orderByComparator);

	/**
	 * Returns the jadsc appli prelimination detes before and after the current jadsc appli prelimination dete in the ordered set where Outcome = &#63;.
	 *
	 * @param jadscAppliPreliminationDeteId the primary key of the current jadsc appli prelimination dete
	 * @param Outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc appli prelimination dete
	 * @throws NoSuchJadscAppliPreliminationDeteException if a jadsc appli prelimination dete with the primary key could not be found
	 */
	public JadscAppliPreliminationDete[] findBygetJadsc_By_PD_PrevAndNext(
			long jadscAppliPreliminationDeteId, String Outcome,
			com.liferay.portal.kernel.util.OrderByComparator
				<JadscAppliPreliminationDete> orderByComparator)
		throws NoSuchJadscAppliPreliminationDeteException;

	/**
	 * Removes all the jadsc appli prelimination detes where Outcome = &#63; from the database.
	 *
	 * @param Outcome the outcome
	 */
	public void removeBygetJadsc_By_PD(String Outcome);

	/**
	 * Returns the number of jadsc appli prelimination detes where Outcome = &#63;.
	 *
	 * @param Outcome the outcome
	 * @return the number of matching jadsc appli prelimination detes
	 */
	public int countBygetJadsc_By_PD(String Outcome);

	/**
	 * Caches the jadsc appli prelimination dete in the entity cache if it is enabled.
	 *
	 * @param jadscAppliPreliminationDete the jadsc appli prelimination dete
	 */
	public void cacheResult(
		JadscAppliPreliminationDete jadscAppliPreliminationDete);

	/**
	 * Caches the jadsc appli prelimination detes in the entity cache if it is enabled.
	 *
	 * @param jadscAppliPreliminationDetes the jadsc appli prelimination detes
	 */
	public void cacheResult(
		java.util.List<JadscAppliPreliminationDete>
			jadscAppliPreliminationDetes);

	/**
	 * Creates a new jadsc appli prelimination dete with the primary key. Does not add the jadsc appli prelimination dete to the database.
	 *
	 * @param jadscAppliPreliminationDeteId the primary key for the new jadsc appli prelimination dete
	 * @return the new jadsc appli prelimination dete
	 */
	public JadscAppliPreliminationDete create(
		long jadscAppliPreliminationDeteId);

	/**
	 * Removes the jadsc appli prelimination dete with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jadscAppliPreliminationDeteId the primary key of the jadsc appli prelimination dete
	 * @return the jadsc appli prelimination dete that was removed
	 * @throws NoSuchJadscAppliPreliminationDeteException if a jadsc appli prelimination dete with the primary key could not be found
	 */
	public JadscAppliPreliminationDete remove(
			long jadscAppliPreliminationDeteId)
		throws NoSuchJadscAppliPreliminationDeteException;

	public JadscAppliPreliminationDete updateImpl(
		JadscAppliPreliminationDete jadscAppliPreliminationDete);

	/**
	 * Returns the jadsc appli prelimination dete with the primary key or throws a <code>NoSuchJadscAppliPreliminationDeteException</code> if it could not be found.
	 *
	 * @param jadscAppliPreliminationDeteId the primary key of the jadsc appli prelimination dete
	 * @return the jadsc appli prelimination dete
	 * @throws NoSuchJadscAppliPreliminationDeteException if a jadsc appli prelimination dete with the primary key could not be found
	 */
	public JadscAppliPreliminationDete findByPrimaryKey(
			long jadscAppliPreliminationDeteId)
		throws NoSuchJadscAppliPreliminationDeteException;

	/**
	 * Returns the jadsc appli prelimination dete with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jadscAppliPreliminationDeteId the primary key of the jadsc appli prelimination dete
	 * @return the jadsc appli prelimination dete, or <code>null</code> if a jadsc appli prelimination dete with the primary key could not be found
	 */
	public JadscAppliPreliminationDete fetchByPrimaryKey(
		long jadscAppliPreliminationDeteId);

	/**
	 * Returns all the jadsc appli prelimination detes.
	 *
	 * @return the jadsc appli prelimination detes
	 */
	public java.util.List<JadscAppliPreliminationDete> findAll();

	/**
	 * Returns a range of all the jadsc appli prelimination detes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliPreliminationDeteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc appli prelimination detes
	 * @param end the upper bound of the range of jadsc appli prelimination detes (not inclusive)
	 * @return the range of jadsc appli prelimination detes
	 */
	public java.util.List<JadscAppliPreliminationDete> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the jadsc appli prelimination detes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliPreliminationDeteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc appli prelimination detes
	 * @param end the upper bound of the range of jadsc appli prelimination detes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jadsc appli prelimination detes
	 */
	public java.util.List<JadscAppliPreliminationDete> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JadscAppliPreliminationDete> orderByComparator);

	/**
	 * Returns an ordered range of all the jadsc appli prelimination detes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliPreliminationDeteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc appli prelimination detes
	 * @param end the upper bound of the range of jadsc appli prelimination detes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jadsc appli prelimination detes
	 */
	public java.util.List<JadscAppliPreliminationDete> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JadscAppliPreliminationDete> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the jadsc appli prelimination detes from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of jadsc appli prelimination detes.
	 *
	 * @return the number of jadsc appli prelimination detes
	 */
	public int countAll();

}