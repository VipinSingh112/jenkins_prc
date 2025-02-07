/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.stages.services.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.film.stages.services.exception.NoSuchFilmDeskVerificationException;
import com.nbp.film.stages.services.model.FilmDeskVerification;
import com.nbp.film.stages.services.model.FilmDeskVerificationTable;
import com.nbp.film.stages.services.model.impl.FilmDeskVerificationImpl;
import com.nbp.film.stages.services.model.impl.FilmDeskVerificationModelImpl;
import com.nbp.film.stages.services.service.persistence.FilmDeskVerificationPersistence;
import com.nbp.film.stages.services.service.persistence.FilmDeskVerificationUtil;
import com.nbp.film.stages.services.service.persistence.impl.constants.FILM_STAGESPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the film desk verification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = FilmDeskVerificationPersistence.class)
public class FilmDeskVerificationPersistenceImpl
	extends BasePersistenceImpl<FilmDeskVerification>
	implements FilmDeskVerificationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FilmDeskVerificationUtil</code> to access the film desk verification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FilmDeskVerificationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath
		_finderPathWithPaginationFindBygetFilmDeskVerificationByStatus_ApplicationId;
	private FinderPath
		_finderPathWithoutPaginationFindBygetFilmDeskVerificationByStatus_ApplicationId;
	private FinderPath
		_finderPathCountBygetFilmDeskVerificationByStatus_ApplicationId;

	/**
	 * Returns all the film desk verifications where status = &#63; and filmApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param filmApplicationId the film application ID
	 * @return the matching film desk verifications
	 */
	@Override
	public List<FilmDeskVerification>
		findBygetFilmDeskVerificationByStatus_ApplicationId(
			String status, long filmApplicationId) {

		return findBygetFilmDeskVerificationByStatus_ApplicationId(
			status, filmApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the film desk verifications where status = &#63; and filmApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param filmApplicationId the film application ID
	 * @param start the lower bound of the range of film desk verifications
	 * @param end the upper bound of the range of film desk verifications (not inclusive)
	 * @return the range of matching film desk verifications
	 */
	@Override
	public List<FilmDeskVerification>
		findBygetFilmDeskVerificationByStatus_ApplicationId(
			String status, long filmApplicationId, int start, int end) {

		return findBygetFilmDeskVerificationByStatus_ApplicationId(
			status, filmApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the film desk verifications where status = &#63; and filmApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param filmApplicationId the film application ID
	 * @param start the lower bound of the range of film desk verifications
	 * @param end the upper bound of the range of film desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching film desk verifications
	 */
	@Override
	public List<FilmDeskVerification>
		findBygetFilmDeskVerificationByStatus_ApplicationId(
			String status, long filmApplicationId, int start, int end,
			OrderByComparator<FilmDeskVerification> orderByComparator) {

		return findBygetFilmDeskVerificationByStatus_ApplicationId(
			status, filmApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the film desk verifications where status = &#63; and filmApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param filmApplicationId the film application ID
	 * @param start the lower bound of the range of film desk verifications
	 * @param end the upper bound of the range of film desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching film desk verifications
	 */
	@Override
	public List<FilmDeskVerification>
		findBygetFilmDeskVerificationByStatus_ApplicationId(
			String status, long filmApplicationId, int start, int end,
			OrderByComparator<FilmDeskVerification> orderByComparator,
			boolean useFinderCache) {

		status = Objects.toString(status, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetFilmDeskVerificationByStatus_ApplicationId;
				finderArgs = new Object[] {status, filmApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetFilmDeskVerificationByStatus_ApplicationId;
			finderArgs = new Object[] {
				status, filmApplicationId, start, end, orderByComparator
			};
		}

		List<FilmDeskVerification> list = null;

		if (useFinderCache) {
			list = (List<FilmDeskVerification>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FilmDeskVerification filmDeskVerification : list) {
					if (!status.equals(filmDeskVerification.getStatus()) ||
						(filmApplicationId !=
							filmDeskVerification.getFilmApplicationId())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_FILMDESKVERIFICATION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFILMDESKVERIFICATIONBYSTATUS_APPLICATIONID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(
					_FINDER_COLUMN_GETFILMDESKVERIFICATIONBYSTATUS_APPLICATIONID_STATUS_2);
			}

			sb.append(
				_FINDER_COLUMN_GETFILMDESKVERIFICATIONBYSTATUS_APPLICATIONID_FILMAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FilmDeskVerificationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				queryPos.add(filmApplicationId);

				list = (List<FilmDeskVerification>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first film desk verification in the ordered set where status = &#63; and filmApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film desk verification
	 * @throws NoSuchFilmDeskVerificationException if a matching film desk verification could not be found
	 */
	@Override
	public FilmDeskVerification
			findBygetFilmDeskVerificationByStatus_ApplicationId_First(
				String status, long filmApplicationId,
				OrderByComparator<FilmDeskVerification> orderByComparator)
		throws NoSuchFilmDeskVerificationException {

		FilmDeskVerification filmDeskVerification =
			fetchBygetFilmDeskVerificationByStatus_ApplicationId_First(
				status, filmApplicationId, orderByComparator);

		if (filmDeskVerification != null) {
			return filmDeskVerification;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", filmApplicationId=");
		sb.append(filmApplicationId);

		sb.append("}");

		throw new NoSuchFilmDeskVerificationException(sb.toString());
	}

	/**
	 * Returns the first film desk verification in the ordered set where status = &#63; and filmApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film desk verification, or <code>null</code> if a matching film desk verification could not be found
	 */
	@Override
	public FilmDeskVerification
		fetchBygetFilmDeskVerificationByStatus_ApplicationId_First(
			String status, long filmApplicationId,
			OrderByComparator<FilmDeskVerification> orderByComparator) {

		List<FilmDeskVerification> list =
			findBygetFilmDeskVerificationByStatus_ApplicationId(
				status, filmApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last film desk verification in the ordered set where status = &#63; and filmApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film desk verification
	 * @throws NoSuchFilmDeskVerificationException if a matching film desk verification could not be found
	 */
	@Override
	public FilmDeskVerification
			findBygetFilmDeskVerificationByStatus_ApplicationId_Last(
				String status, long filmApplicationId,
				OrderByComparator<FilmDeskVerification> orderByComparator)
		throws NoSuchFilmDeskVerificationException {

		FilmDeskVerification filmDeskVerification =
			fetchBygetFilmDeskVerificationByStatus_ApplicationId_Last(
				status, filmApplicationId, orderByComparator);

		if (filmDeskVerification != null) {
			return filmDeskVerification;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", filmApplicationId=");
		sb.append(filmApplicationId);

		sb.append("}");

		throw new NoSuchFilmDeskVerificationException(sb.toString());
	}

	/**
	 * Returns the last film desk verification in the ordered set where status = &#63; and filmApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film desk verification, or <code>null</code> if a matching film desk verification could not be found
	 */
	@Override
	public FilmDeskVerification
		fetchBygetFilmDeskVerificationByStatus_ApplicationId_Last(
			String status, long filmApplicationId,
			OrderByComparator<FilmDeskVerification> orderByComparator) {

		int count = countBygetFilmDeskVerificationByStatus_ApplicationId(
			status, filmApplicationId);

		if (count == 0) {
			return null;
		}

		List<FilmDeskVerification> list =
			findBygetFilmDeskVerificationByStatus_ApplicationId(
				status, filmApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the film desk verifications before and after the current film desk verification in the ordered set where status = &#63; and filmApplicationId = &#63;.
	 *
	 * @param filmDeskVerificaId the primary key of the current film desk verification
	 * @param status the status
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next film desk verification
	 * @throws NoSuchFilmDeskVerificationException if a film desk verification with the primary key could not be found
	 */
	@Override
	public FilmDeskVerification[]
			findBygetFilmDeskVerificationByStatus_ApplicationId_PrevAndNext(
				long filmDeskVerificaId, String status, long filmApplicationId,
				OrderByComparator<FilmDeskVerification> orderByComparator)
		throws NoSuchFilmDeskVerificationException {

		status = Objects.toString(status, "");

		FilmDeskVerification filmDeskVerification = findByPrimaryKey(
			filmDeskVerificaId);

		Session session = null;

		try {
			session = openSession();

			FilmDeskVerification[] array = new FilmDeskVerificationImpl[3];

			array[0] =
				getBygetFilmDeskVerificationByStatus_ApplicationId_PrevAndNext(
					session, filmDeskVerification, status, filmApplicationId,
					orderByComparator, true);

			array[1] = filmDeskVerification;

			array[2] =
				getBygetFilmDeskVerificationByStatus_ApplicationId_PrevAndNext(
					session, filmDeskVerification, status, filmApplicationId,
					orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected FilmDeskVerification
		getBygetFilmDeskVerificationByStatus_ApplicationId_PrevAndNext(
			Session session, FilmDeskVerification filmDeskVerification,
			String status, long filmApplicationId,
			OrderByComparator<FilmDeskVerification> orderByComparator,
			boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_FILMDESKVERIFICATION_WHERE);

		boolean bindStatus = false;

		if (status.isEmpty()) {
			sb.append(
				_FINDER_COLUMN_GETFILMDESKVERIFICATIONBYSTATUS_APPLICATIONID_STATUS_3);
		}
		else {
			bindStatus = true;

			sb.append(
				_FINDER_COLUMN_GETFILMDESKVERIFICATIONBYSTATUS_APPLICATIONID_STATUS_2);
		}

		sb.append(
			_FINDER_COLUMN_GETFILMDESKVERIFICATIONBYSTATUS_APPLICATIONID_FILMAPPLICATIONID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(FilmDeskVerificationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindStatus) {
			queryPos.add(status);
		}

		queryPos.add(filmApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						filmDeskVerification)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FilmDeskVerification> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the film desk verifications where status = &#63; and filmApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param filmApplicationId the film application ID
	 */
	@Override
	public void removeBygetFilmDeskVerificationByStatus_ApplicationId(
		String status, long filmApplicationId) {

		for (FilmDeskVerification filmDeskVerification :
				findBygetFilmDeskVerificationByStatus_ApplicationId(
					status, filmApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(filmDeskVerification);
		}
	}

	/**
	 * Returns the number of film desk verifications where status = &#63; and filmApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param filmApplicationId the film application ID
	 * @return the number of matching film desk verifications
	 */
	@Override
	public int countBygetFilmDeskVerificationByStatus_ApplicationId(
		String status, long filmApplicationId) {

		status = Objects.toString(status, "");

		FinderPath finderPath =
			_finderPathCountBygetFilmDeskVerificationByStatus_ApplicationId;

		Object[] finderArgs = new Object[] {status, filmApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_FILMDESKVERIFICATION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFILMDESKVERIFICATIONBYSTATUS_APPLICATIONID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(
					_FINDER_COLUMN_GETFILMDESKVERIFICATIONBYSTATUS_APPLICATIONID_STATUS_2);
			}

			sb.append(
				_FINDER_COLUMN_GETFILMDESKVERIFICATIONBYSTATUS_APPLICATIONID_FILMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				queryPos.add(filmApplicationId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_GETFILMDESKVERIFICATIONBYSTATUS_APPLICATIONID_STATUS_2 =
			"filmDeskVerification.status = ? AND ";

	private static final String
		_FINDER_COLUMN_GETFILMDESKVERIFICATIONBYSTATUS_APPLICATIONID_STATUS_3 =
			"(filmDeskVerification.status IS NULL OR filmDeskVerification.status = '') AND ";

	private static final String
		_FINDER_COLUMN_GETFILMDESKVERIFICATIONBYSTATUS_APPLICATIONID_FILMAPPLICATIONID_2 =
			"filmDeskVerification.filmApplicationId = ?";

	private FinderPath _finderPathFetchBygetFilmById;
	private FinderPath _finderPathCountBygetFilmById;

	/**
	 * Returns the film desk verification where filmApplicationId = &#63; or throws a <code>NoSuchFilmDeskVerificationException</code> if it could not be found.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film desk verification
	 * @throws NoSuchFilmDeskVerificationException if a matching film desk verification could not be found
	 */
	@Override
	public FilmDeskVerification findBygetFilmById(long filmApplicationId)
		throws NoSuchFilmDeskVerificationException {

		FilmDeskVerification filmDeskVerification = fetchBygetFilmById(
			filmApplicationId);

		if (filmDeskVerification == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("filmApplicationId=");
			sb.append(filmApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFilmDeskVerificationException(sb.toString());
		}

		return filmDeskVerification;
	}

	/**
	 * Returns the film desk verification where filmApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film desk verification, or <code>null</code> if a matching film desk verification could not be found
	 */
	@Override
	public FilmDeskVerification fetchBygetFilmById(long filmApplicationId) {
		return fetchBygetFilmById(filmApplicationId, true);
	}

	/**
	 * Returns the film desk verification where filmApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film desk verification, or <code>null</code> if a matching film desk verification could not be found
	 */
	@Override
	public FilmDeskVerification fetchBygetFilmById(
		long filmApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {filmApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetFilmById, finderArgs, this);
		}

		if (result instanceof FilmDeskVerification) {
			FilmDeskVerification filmDeskVerification =
				(FilmDeskVerification)result;

			if (filmApplicationId !=
					filmDeskVerification.getFilmApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FILMDESKVERIFICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETFILMBYID_FILMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(filmApplicationId);

				List<FilmDeskVerification> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetFilmById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {filmApplicationId};
							}

							_log.warn(
								"FilmDeskVerificationPersistenceImpl.fetchBygetFilmById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FilmDeskVerification filmDeskVerification = list.get(0);

					result = filmDeskVerification;

					cacheResult(filmDeskVerification);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (FilmDeskVerification)result;
		}
	}

	/**
	 * Removes the film desk verification where filmApplicationId = &#63; from the database.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the film desk verification that was removed
	 */
	@Override
	public FilmDeskVerification removeBygetFilmById(long filmApplicationId)
		throws NoSuchFilmDeskVerificationException {

		FilmDeskVerification filmDeskVerification = findBygetFilmById(
			filmApplicationId);

		return remove(filmDeskVerification);
	}

	/**
	 * Returns the number of film desk verifications where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the number of matching film desk verifications
	 */
	@Override
	public int countBygetFilmById(long filmApplicationId) {
		FinderPath finderPath = _finderPathCountBygetFilmById;

		Object[] finderArgs = new Object[] {filmApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FILMDESKVERIFICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETFILMBYID_FILMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(filmApplicationId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GETFILMBYID_FILMAPPLICATIONID_2 =
		"filmDeskVerification.filmApplicationId = ?";

	private FinderPath
		_finderPathWithPaginationFindBygetDeskVerificationFilmById;
	private FinderPath
		_finderPathWithoutPaginationFindBygetDeskVerificationFilmById;
	private FinderPath _finderPathCountBygetDeskVerificationFilmById;

	/**
	 * Returns all the film desk verifications where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film desk verifications
	 */
	@Override
	public List<FilmDeskVerification> findBygetDeskVerificationFilmById(
		long filmApplicationId) {

		return findBygetDeskVerificationFilmById(
			filmApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the film desk verifications where filmApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param filmApplicationId the film application ID
	 * @param start the lower bound of the range of film desk verifications
	 * @param end the upper bound of the range of film desk verifications (not inclusive)
	 * @return the range of matching film desk verifications
	 */
	@Override
	public List<FilmDeskVerification> findBygetDeskVerificationFilmById(
		long filmApplicationId, int start, int end) {

		return findBygetDeskVerificationFilmById(
			filmApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the film desk verifications where filmApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param filmApplicationId the film application ID
	 * @param start the lower bound of the range of film desk verifications
	 * @param end the upper bound of the range of film desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching film desk verifications
	 */
	@Override
	public List<FilmDeskVerification> findBygetDeskVerificationFilmById(
		long filmApplicationId, int start, int end,
		OrderByComparator<FilmDeskVerification> orderByComparator) {

		return findBygetDeskVerificationFilmById(
			filmApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the film desk verifications where filmApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param filmApplicationId the film application ID
	 * @param start the lower bound of the range of film desk verifications
	 * @param end the upper bound of the range of film desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching film desk verifications
	 */
	@Override
	public List<FilmDeskVerification> findBygetDeskVerificationFilmById(
		long filmApplicationId, int start, int end,
		OrderByComparator<FilmDeskVerification> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetDeskVerificationFilmById;
				finderArgs = new Object[] {filmApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetDeskVerificationFilmById;
			finderArgs = new Object[] {
				filmApplicationId, start, end, orderByComparator
			};
		}

		List<FilmDeskVerification> list = null;

		if (useFinderCache) {
			list = (List<FilmDeskVerification>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FilmDeskVerification filmDeskVerification : list) {
					if (filmApplicationId !=
							filmDeskVerification.getFilmApplicationId()) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_FILMDESKVERIFICATION_WHERE);

			sb.append(
				_FINDER_COLUMN_GETDESKVERIFICATIONFILMBYID_FILMAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FilmDeskVerificationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(filmApplicationId);

				list = (List<FilmDeskVerification>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first film desk verification in the ordered set where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film desk verification
	 * @throws NoSuchFilmDeskVerificationException if a matching film desk verification could not be found
	 */
	@Override
	public FilmDeskVerification findBygetDeskVerificationFilmById_First(
			long filmApplicationId,
			OrderByComparator<FilmDeskVerification> orderByComparator)
		throws NoSuchFilmDeskVerificationException {

		FilmDeskVerification filmDeskVerification =
			fetchBygetDeskVerificationFilmById_First(
				filmApplicationId, orderByComparator);

		if (filmDeskVerification != null) {
			return filmDeskVerification;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("filmApplicationId=");
		sb.append(filmApplicationId);

		sb.append("}");

		throw new NoSuchFilmDeskVerificationException(sb.toString());
	}

	/**
	 * Returns the first film desk verification in the ordered set where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film desk verification, or <code>null</code> if a matching film desk verification could not be found
	 */
	@Override
	public FilmDeskVerification fetchBygetDeskVerificationFilmById_First(
		long filmApplicationId,
		OrderByComparator<FilmDeskVerification> orderByComparator) {

		List<FilmDeskVerification> list = findBygetDeskVerificationFilmById(
			filmApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last film desk verification in the ordered set where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film desk verification
	 * @throws NoSuchFilmDeskVerificationException if a matching film desk verification could not be found
	 */
	@Override
	public FilmDeskVerification findBygetDeskVerificationFilmById_Last(
			long filmApplicationId,
			OrderByComparator<FilmDeskVerification> orderByComparator)
		throws NoSuchFilmDeskVerificationException {

		FilmDeskVerification filmDeskVerification =
			fetchBygetDeskVerificationFilmById_Last(
				filmApplicationId, orderByComparator);

		if (filmDeskVerification != null) {
			return filmDeskVerification;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("filmApplicationId=");
		sb.append(filmApplicationId);

		sb.append("}");

		throw new NoSuchFilmDeskVerificationException(sb.toString());
	}

	/**
	 * Returns the last film desk verification in the ordered set where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film desk verification, or <code>null</code> if a matching film desk verification could not be found
	 */
	@Override
	public FilmDeskVerification fetchBygetDeskVerificationFilmById_Last(
		long filmApplicationId,
		OrderByComparator<FilmDeskVerification> orderByComparator) {

		int count = countBygetDeskVerificationFilmById(filmApplicationId);

		if (count == 0) {
			return null;
		}

		List<FilmDeskVerification> list = findBygetDeskVerificationFilmById(
			filmApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the film desk verifications before and after the current film desk verification in the ordered set where filmApplicationId = &#63;.
	 *
	 * @param filmDeskVerificaId the primary key of the current film desk verification
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next film desk verification
	 * @throws NoSuchFilmDeskVerificationException if a film desk verification with the primary key could not be found
	 */
	@Override
	public FilmDeskVerification[] findBygetDeskVerificationFilmById_PrevAndNext(
			long filmDeskVerificaId, long filmApplicationId,
			OrderByComparator<FilmDeskVerification> orderByComparator)
		throws NoSuchFilmDeskVerificationException {

		FilmDeskVerification filmDeskVerification = findByPrimaryKey(
			filmDeskVerificaId);

		Session session = null;

		try {
			session = openSession();

			FilmDeskVerification[] array = new FilmDeskVerificationImpl[3];

			array[0] = getBygetDeskVerificationFilmById_PrevAndNext(
				session, filmDeskVerification, filmApplicationId,
				orderByComparator, true);

			array[1] = filmDeskVerification;

			array[2] = getBygetDeskVerificationFilmById_PrevAndNext(
				session, filmDeskVerification, filmApplicationId,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected FilmDeskVerification getBygetDeskVerificationFilmById_PrevAndNext(
		Session session, FilmDeskVerification filmDeskVerification,
		long filmApplicationId,
		OrderByComparator<FilmDeskVerification> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_FILMDESKVERIFICATION_WHERE);

		sb.append(
			_FINDER_COLUMN_GETDESKVERIFICATIONFILMBYID_FILMAPPLICATIONID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(FilmDeskVerificationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(filmApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						filmDeskVerification)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FilmDeskVerification> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the film desk verifications where filmApplicationId = &#63; from the database.
	 *
	 * @param filmApplicationId the film application ID
	 */
	@Override
	public void removeBygetDeskVerificationFilmById(long filmApplicationId) {
		for (FilmDeskVerification filmDeskVerification :
				findBygetDeskVerificationFilmById(
					filmApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(filmDeskVerification);
		}
	}

	/**
	 * Returns the number of film desk verifications where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the number of matching film desk verifications
	 */
	@Override
	public int countBygetDeskVerificationFilmById(long filmApplicationId) {
		FinderPath finderPath = _finderPathCountBygetDeskVerificationFilmById;

		Object[] finderArgs = new Object[] {filmApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FILMDESKVERIFICATION_WHERE);

			sb.append(
				_FINDER_COLUMN_GETDESKVERIFICATIONFILMBYID_FILMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(filmApplicationId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_GETDESKVERIFICATIONFILMBYID_FILMAPPLICATIONID_2 =
			"filmDeskVerification.filmApplicationId = ?";

	public FilmDeskVerificationPersistenceImpl() {
		setModelClass(FilmDeskVerification.class);

		setModelImplClass(FilmDeskVerificationImpl.class);
		setModelPKClass(long.class);

		setTable(FilmDeskVerificationTable.INSTANCE);
	}

	/**
	 * Caches the film desk verification in the entity cache if it is enabled.
	 *
	 * @param filmDeskVerification the film desk verification
	 */
	@Override
	public void cacheResult(FilmDeskVerification filmDeskVerification) {
		entityCache.putResult(
			FilmDeskVerificationImpl.class,
			filmDeskVerification.getPrimaryKey(), filmDeskVerification);

		finderCache.putResult(
			_finderPathFetchBygetFilmById,
			new Object[] {filmDeskVerification.getFilmApplicationId()},
			filmDeskVerification);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the film desk verifications in the entity cache if it is enabled.
	 *
	 * @param filmDeskVerifications the film desk verifications
	 */
	@Override
	public void cacheResult(List<FilmDeskVerification> filmDeskVerifications) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (filmDeskVerifications.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FilmDeskVerification filmDeskVerification :
				filmDeskVerifications) {

			if (entityCache.getResult(
					FilmDeskVerificationImpl.class,
					filmDeskVerification.getPrimaryKey()) == null) {

				cacheResult(filmDeskVerification);
			}
		}
	}

	/**
	 * Clears the cache for all film desk verifications.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FilmDeskVerificationImpl.class);

		finderCache.clearCache(FilmDeskVerificationImpl.class);
	}

	/**
	 * Clears the cache for the film desk verification.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FilmDeskVerification filmDeskVerification) {
		entityCache.removeResult(
			FilmDeskVerificationImpl.class, filmDeskVerification);
	}

	@Override
	public void clearCache(List<FilmDeskVerification> filmDeskVerifications) {
		for (FilmDeskVerification filmDeskVerification :
				filmDeskVerifications) {

			entityCache.removeResult(
				FilmDeskVerificationImpl.class, filmDeskVerification);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FilmDeskVerificationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				FilmDeskVerificationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		FilmDeskVerificationModelImpl filmDeskVerificationModelImpl) {

		Object[] args = new Object[] {
			filmDeskVerificationModelImpl.getFilmApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetFilmById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFilmById, args, filmDeskVerificationModelImpl);
	}

	/**
	 * Creates a new film desk verification with the primary key. Does not add the film desk verification to the database.
	 *
	 * @param filmDeskVerificaId the primary key for the new film desk verification
	 * @return the new film desk verification
	 */
	@Override
	public FilmDeskVerification create(long filmDeskVerificaId) {
		FilmDeskVerification filmDeskVerification =
			new FilmDeskVerificationImpl();

		filmDeskVerification.setNew(true);
		filmDeskVerification.setPrimaryKey(filmDeskVerificaId);

		filmDeskVerification.setCompanyId(CompanyThreadLocal.getCompanyId());

		return filmDeskVerification;
	}

	/**
	 * Removes the film desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param filmDeskVerificaId the primary key of the film desk verification
	 * @return the film desk verification that was removed
	 * @throws NoSuchFilmDeskVerificationException if a film desk verification with the primary key could not be found
	 */
	@Override
	public FilmDeskVerification remove(long filmDeskVerificaId)
		throws NoSuchFilmDeskVerificationException {

		return remove((Serializable)filmDeskVerificaId);
	}

	/**
	 * Removes the film desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the film desk verification
	 * @return the film desk verification that was removed
	 * @throws NoSuchFilmDeskVerificationException if a film desk verification with the primary key could not be found
	 */
	@Override
	public FilmDeskVerification remove(Serializable primaryKey)
		throws NoSuchFilmDeskVerificationException {

		Session session = null;

		try {
			session = openSession();

			FilmDeskVerification filmDeskVerification =
				(FilmDeskVerification)session.get(
					FilmDeskVerificationImpl.class, primaryKey);

			if (filmDeskVerification == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFilmDeskVerificationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(filmDeskVerification);
		}
		catch (NoSuchFilmDeskVerificationException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected FilmDeskVerification removeImpl(
		FilmDeskVerification filmDeskVerification) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(filmDeskVerification)) {
				filmDeskVerification = (FilmDeskVerification)session.get(
					FilmDeskVerificationImpl.class,
					filmDeskVerification.getPrimaryKeyObj());
			}

			if (filmDeskVerification != null) {
				session.delete(filmDeskVerification);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (filmDeskVerification != null) {
			clearCache(filmDeskVerification);
		}

		return filmDeskVerification;
	}

	@Override
	public FilmDeskVerification updateImpl(
		FilmDeskVerification filmDeskVerification) {

		boolean isNew = filmDeskVerification.isNew();

		if (!(filmDeskVerification instanceof FilmDeskVerificationModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(filmDeskVerification.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					filmDeskVerification);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in filmDeskVerification proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FilmDeskVerification implementation " +
					filmDeskVerification.getClass());
		}

		FilmDeskVerificationModelImpl filmDeskVerificationModelImpl =
			(FilmDeskVerificationModelImpl)filmDeskVerification;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (filmDeskVerification.getCreateDate() == null)) {
			if (serviceContext == null) {
				filmDeskVerification.setCreateDate(date);
			}
			else {
				filmDeskVerification.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!filmDeskVerificationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				filmDeskVerification.setModifiedDate(date);
			}
			else {
				filmDeskVerification.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(filmDeskVerification);
			}
			else {
				filmDeskVerification = (FilmDeskVerification)session.merge(
					filmDeskVerification);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FilmDeskVerificationImpl.class, filmDeskVerificationModelImpl,
			false, true);

		cacheUniqueFindersCache(filmDeskVerificationModelImpl);

		if (isNew) {
			filmDeskVerification.setNew(false);
		}

		filmDeskVerification.resetOriginalValues();

		return filmDeskVerification;
	}

	/**
	 * Returns the film desk verification with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the film desk verification
	 * @return the film desk verification
	 * @throws NoSuchFilmDeskVerificationException if a film desk verification with the primary key could not be found
	 */
	@Override
	public FilmDeskVerification findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFilmDeskVerificationException {

		FilmDeskVerification filmDeskVerification = fetchByPrimaryKey(
			primaryKey);

		if (filmDeskVerification == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFilmDeskVerificationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return filmDeskVerification;
	}

	/**
	 * Returns the film desk verification with the primary key or throws a <code>NoSuchFilmDeskVerificationException</code> if it could not be found.
	 *
	 * @param filmDeskVerificaId the primary key of the film desk verification
	 * @return the film desk verification
	 * @throws NoSuchFilmDeskVerificationException if a film desk verification with the primary key could not be found
	 */
	@Override
	public FilmDeskVerification findByPrimaryKey(long filmDeskVerificaId)
		throws NoSuchFilmDeskVerificationException {

		return findByPrimaryKey((Serializable)filmDeskVerificaId);
	}

	/**
	 * Returns the film desk verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param filmDeskVerificaId the primary key of the film desk verification
	 * @return the film desk verification, or <code>null</code> if a film desk verification with the primary key could not be found
	 */
	@Override
	public FilmDeskVerification fetchByPrimaryKey(long filmDeskVerificaId) {
		return fetchByPrimaryKey((Serializable)filmDeskVerificaId);
	}

	/**
	 * Returns all the film desk verifications.
	 *
	 * @return the film desk verifications
	 */
	@Override
	public List<FilmDeskVerification> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the film desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film desk verifications
	 * @param end the upper bound of the range of film desk verifications (not inclusive)
	 * @return the range of film desk verifications
	 */
	@Override
	public List<FilmDeskVerification> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the film desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film desk verifications
	 * @param end the upper bound of the range of film desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of film desk verifications
	 */
	@Override
	public List<FilmDeskVerification> findAll(
		int start, int end,
		OrderByComparator<FilmDeskVerification> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the film desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film desk verifications
	 * @param end the upper bound of the range of film desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of film desk verifications
	 */
	@Override
	public List<FilmDeskVerification> findAll(
		int start, int end,
		OrderByComparator<FilmDeskVerification> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<FilmDeskVerification> list = null;

		if (useFinderCache) {
			list = (List<FilmDeskVerification>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FILMDESKVERIFICATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FILMDESKVERIFICATION;

				sql = sql.concat(FilmDeskVerificationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FilmDeskVerification>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the film desk verifications from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FilmDeskVerification filmDeskVerification : findAll()) {
			remove(filmDeskVerification);
		}
	}

	/**
	 * Returns the number of film desk verifications.
	 *
	 * @return the number of film desk verifications
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_FILMDESKVERIFICATION);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "filmDeskVerificaId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FILMDESKVERIFICATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FilmDeskVerificationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the film desk verification persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindBygetFilmDeskVerificationByStatus_ApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetFilmDeskVerificationByStatus_ApplicationId",
				new String[] {
					String.class.getName(), Long.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				},
				new String[] {"status", "filmApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetFilmDeskVerificationByStatus_ApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetFilmDeskVerificationByStatus_ApplicationId",
				new String[] {String.class.getName(), Long.class.getName()},
				new String[] {"status", "filmApplicationId"}, true);

		_finderPathCountBygetFilmDeskVerificationByStatus_ApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"countBygetFilmDeskVerificationByStatus_ApplicationId",
				new String[] {String.class.getName(), Long.class.getName()},
				new String[] {"status", "filmApplicationId"}, false);

		_finderPathFetchBygetFilmById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetFilmById",
			new String[] {Long.class.getName()},
			new String[] {"filmApplicationId"}, true);

		_finderPathCountBygetFilmById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetFilmById",
			new String[] {Long.class.getName()},
			new String[] {"filmApplicationId"}, false);

		_finderPathWithPaginationFindBygetDeskVerificationFilmById =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetDeskVerificationFilmById",
				new String[] {
					Long.class.getName(), Integer.class.getName(),
					Integer.class.getName(), OrderByComparator.class.getName()
				},
				new String[] {"filmApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetDeskVerificationFilmById =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetDeskVerificationFilmById",
				new String[] {Long.class.getName()},
				new String[] {"filmApplicationId"}, true);

		_finderPathCountBygetDeskVerificationFilmById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetDeskVerificationFilmById",
			new String[] {Long.class.getName()},
			new String[] {"filmApplicationId"}, false);

		FilmDeskVerificationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		FilmDeskVerificationUtil.setPersistence(null);

		entityCache.removeCache(FilmDeskVerificationImpl.class.getName());
	}

	@Override
	@Reference(
		target = FILM_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = FILM_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = FILM_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_FILMDESKVERIFICATION =
		"SELECT filmDeskVerification FROM FilmDeskVerification filmDeskVerification";

	private static final String _SQL_SELECT_FILMDESKVERIFICATION_WHERE =
		"SELECT filmDeskVerification FROM FilmDeskVerification filmDeskVerification WHERE ";

	private static final String _SQL_COUNT_FILMDESKVERIFICATION =
		"SELECT COUNT(filmDeskVerification) FROM FilmDeskVerification filmDeskVerification";

	private static final String _SQL_COUNT_FILMDESKVERIFICATION_WHERE =
		"SELECT COUNT(filmDeskVerification) FROM FilmDeskVerification filmDeskVerification WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"filmDeskVerification.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FilmDeskVerification exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FilmDeskVerification exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FilmDeskVerificationPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}