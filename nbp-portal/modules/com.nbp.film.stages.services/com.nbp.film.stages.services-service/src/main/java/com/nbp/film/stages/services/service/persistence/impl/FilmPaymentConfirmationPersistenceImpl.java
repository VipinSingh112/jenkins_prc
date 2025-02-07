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
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.film.stages.services.exception.NoSuchFilmPaymentConfirmationException;
import com.nbp.film.stages.services.model.FilmPaymentConfirmation;
import com.nbp.film.stages.services.model.FilmPaymentConfirmationTable;
import com.nbp.film.stages.services.model.impl.FilmPaymentConfirmationImpl;
import com.nbp.film.stages.services.model.impl.FilmPaymentConfirmationModelImpl;
import com.nbp.film.stages.services.service.persistence.FilmPaymentConfirmationPersistence;
import com.nbp.film.stages.services.service.persistence.FilmPaymentConfirmationUtil;
import com.nbp.film.stages.services.service.persistence.impl.constants.FILM_STAGESPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
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
 * The persistence implementation for the film payment confirmation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = FilmPaymentConfirmationPersistence.class)
public class FilmPaymentConfirmationPersistenceImpl
	extends BasePersistenceImpl<FilmPaymentConfirmation>
	implements FilmPaymentConfirmationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FilmPaymentConfirmationUtil</code> to access the film payment confirmation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FilmPaymentConfirmationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetFilmFullPaymentConfirmationBy_CI;
	private FinderPath _finderPathCountBygetFilmFullPaymentConfirmationBy_CI;

	/**
	 * Returns the film payment confirmation where caseId = &#63; or throws a <code>NoSuchFilmPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching film payment confirmation
	 * @throws NoSuchFilmPaymentConfirmationException if a matching film payment confirmation could not be found
	 */
	@Override
	public FilmPaymentConfirmation findBygetFilmFullPaymentConfirmationBy_CI(
			String caseId)
		throws NoSuchFilmPaymentConfirmationException {

		FilmPaymentConfirmation filmPaymentConfirmation =
			fetchBygetFilmFullPaymentConfirmationBy_CI(caseId);

		if (filmPaymentConfirmation == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFilmPaymentConfirmationException(sb.toString());
		}

		return filmPaymentConfirmation;
	}

	/**
	 * Returns the film payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching film payment confirmation, or <code>null</code> if a matching film payment confirmation could not be found
	 */
	@Override
	public FilmPaymentConfirmation fetchBygetFilmFullPaymentConfirmationBy_CI(
		String caseId) {

		return fetchBygetFilmFullPaymentConfirmationBy_CI(caseId, true);
	}

	/**
	 * Returns the film payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film payment confirmation, or <code>null</code> if a matching film payment confirmation could not be found
	 */
	@Override
	public FilmPaymentConfirmation fetchBygetFilmFullPaymentConfirmationBy_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetFilmFullPaymentConfirmationBy_CI,
				finderArgs, this);
		}

		if (result instanceof FilmPaymentConfirmation) {
			FilmPaymentConfirmation filmPaymentConfirmation =
				(FilmPaymentConfirmation)result;

			if (!Objects.equals(caseId, filmPaymentConfirmation.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FILMPAYMENTCONFIRMATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFILMFULLPAYMENTCONFIRMATIONBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETFILMFULLPAYMENTCONFIRMATIONBY_CI_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				List<FilmPaymentConfirmation> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetFilmFullPaymentConfirmationBy_CI,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {caseId};
							}

							_log.warn(
								"FilmPaymentConfirmationPersistenceImpl.fetchBygetFilmFullPaymentConfirmationBy_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FilmPaymentConfirmation filmPaymentConfirmation = list.get(
						0);

					result = filmPaymentConfirmation;

					cacheResult(filmPaymentConfirmation);
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
			return (FilmPaymentConfirmation)result;
		}
	}

	/**
	 * Removes the film payment confirmation where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the film payment confirmation that was removed
	 */
	@Override
	public FilmPaymentConfirmation removeBygetFilmFullPaymentConfirmationBy_CI(
			String caseId)
		throws NoSuchFilmPaymentConfirmationException {

		FilmPaymentConfirmation filmPaymentConfirmation =
			findBygetFilmFullPaymentConfirmationBy_CI(caseId);

		return remove(filmPaymentConfirmation);
	}

	/**
	 * Returns the number of film payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching film payment confirmations
	 */
	@Override
	public int countBygetFilmFullPaymentConfirmationBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath =
			_finderPathCountBygetFilmFullPaymentConfirmationBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FILMPAYMENTCONFIRMATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFILMFULLPAYMENTCONFIRMATIONBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETFILMFULLPAYMENTCONFIRMATIONBY_CI_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

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
		_FINDER_COLUMN_GETFILMFULLPAYMENTCONFIRMATIONBY_CI_CASEID_2 =
			"filmPaymentConfirmation.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETFILMFULLPAYMENTCONFIRMATIONBY_CI_CASEID_3 =
			"(filmPaymentConfirmation.caseId IS NULL OR filmPaymentConfirmation.caseId = '')";

	private FinderPath
		_finderPathWithPaginationFindBygetFilmFullPaymentConfirmations_By_CI;
	private FinderPath
		_finderPathWithoutPaginationFindBygetFilmFullPaymentConfirmations_By_CI;
	private FinderPath _finderPathCountBygetFilmFullPaymentConfirmations_By_CI;

	/**
	 * Returns all the film payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching film payment confirmations
	 */
	@Override
	public List<FilmPaymentConfirmation>
		findBygetFilmFullPaymentConfirmations_By_CI(String caseId) {

		return findBygetFilmFullPaymentConfirmations_By_CI(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the film payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of film payment confirmations
	 * @param end the upper bound of the range of film payment confirmations (not inclusive)
	 * @return the range of matching film payment confirmations
	 */
	@Override
	public List<FilmPaymentConfirmation>
		findBygetFilmFullPaymentConfirmations_By_CI(
			String caseId, int start, int end) {

		return findBygetFilmFullPaymentConfirmations_By_CI(
			caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the film payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of film payment confirmations
	 * @param end the upper bound of the range of film payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching film payment confirmations
	 */
	@Override
	public List<FilmPaymentConfirmation>
		findBygetFilmFullPaymentConfirmations_By_CI(
			String caseId, int start, int end,
			OrderByComparator<FilmPaymentConfirmation> orderByComparator) {

		return findBygetFilmFullPaymentConfirmations_By_CI(
			caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the film payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of film payment confirmations
	 * @param end the upper bound of the range of film payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching film payment confirmations
	 */
	@Override
	public List<FilmPaymentConfirmation>
		findBygetFilmFullPaymentConfirmations_By_CI(
			String caseId, int start, int end,
			OrderByComparator<FilmPaymentConfirmation> orderByComparator,
			boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetFilmFullPaymentConfirmations_By_CI;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetFilmFullPaymentConfirmations_By_CI;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<FilmPaymentConfirmation> list = null;

		if (useFinderCache) {
			list = (List<FilmPaymentConfirmation>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FilmPaymentConfirmation filmPaymentConfirmation : list) {
					if (!caseId.equals(filmPaymentConfirmation.getCaseId())) {
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

			sb.append(_SQL_SELECT_FILMPAYMENTCONFIRMATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFILMFULLPAYMENTCONFIRMATIONS_BY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETFILMFULLPAYMENTCONFIRMATIONS_BY_CI_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FilmPaymentConfirmationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				list = (List<FilmPaymentConfirmation>)QueryUtil.list(
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
	 * Returns the first film payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film payment confirmation
	 * @throws NoSuchFilmPaymentConfirmationException if a matching film payment confirmation could not be found
	 */
	@Override
	public FilmPaymentConfirmation
			findBygetFilmFullPaymentConfirmations_By_CI_First(
				String caseId,
				OrderByComparator<FilmPaymentConfirmation> orderByComparator)
		throws NoSuchFilmPaymentConfirmationException {

		FilmPaymentConfirmation filmPaymentConfirmation =
			fetchBygetFilmFullPaymentConfirmations_By_CI_First(
				caseId, orderByComparator);

		if (filmPaymentConfirmation != null) {
			return filmPaymentConfirmation;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchFilmPaymentConfirmationException(sb.toString());
	}

	/**
	 * Returns the first film payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film payment confirmation, or <code>null</code> if a matching film payment confirmation could not be found
	 */
	@Override
	public FilmPaymentConfirmation
		fetchBygetFilmFullPaymentConfirmations_By_CI_First(
			String caseId,
			OrderByComparator<FilmPaymentConfirmation> orderByComparator) {

		List<FilmPaymentConfirmation> list =
			findBygetFilmFullPaymentConfirmations_By_CI(
				caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last film payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film payment confirmation
	 * @throws NoSuchFilmPaymentConfirmationException if a matching film payment confirmation could not be found
	 */
	@Override
	public FilmPaymentConfirmation
			findBygetFilmFullPaymentConfirmations_By_CI_Last(
				String caseId,
				OrderByComparator<FilmPaymentConfirmation> orderByComparator)
		throws NoSuchFilmPaymentConfirmationException {

		FilmPaymentConfirmation filmPaymentConfirmation =
			fetchBygetFilmFullPaymentConfirmations_By_CI_Last(
				caseId, orderByComparator);

		if (filmPaymentConfirmation != null) {
			return filmPaymentConfirmation;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchFilmPaymentConfirmationException(sb.toString());
	}

	/**
	 * Returns the last film payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film payment confirmation, or <code>null</code> if a matching film payment confirmation could not be found
	 */
	@Override
	public FilmPaymentConfirmation
		fetchBygetFilmFullPaymentConfirmations_By_CI_Last(
			String caseId,
			OrderByComparator<FilmPaymentConfirmation> orderByComparator) {

		int count = countBygetFilmFullPaymentConfirmations_By_CI(caseId);

		if (count == 0) {
			return null;
		}

		List<FilmPaymentConfirmation> list =
			findBygetFilmFullPaymentConfirmations_By_CI(
				caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the film payment confirmations before and after the current film payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param filmPaymentId the primary key of the current film payment confirmation
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next film payment confirmation
	 * @throws NoSuchFilmPaymentConfirmationException if a film payment confirmation with the primary key could not be found
	 */
	@Override
	public FilmPaymentConfirmation[]
			findBygetFilmFullPaymentConfirmations_By_CI_PrevAndNext(
				long filmPaymentId, String caseId,
				OrderByComparator<FilmPaymentConfirmation> orderByComparator)
		throws NoSuchFilmPaymentConfirmationException {

		caseId = Objects.toString(caseId, "");

		FilmPaymentConfirmation filmPaymentConfirmation = findByPrimaryKey(
			filmPaymentId);

		Session session = null;

		try {
			session = openSession();

			FilmPaymentConfirmation[] array =
				new FilmPaymentConfirmationImpl[3];

			array[0] = getBygetFilmFullPaymentConfirmations_By_CI_PrevAndNext(
				session, filmPaymentConfirmation, caseId, orderByComparator,
				true);

			array[1] = filmPaymentConfirmation;

			array[2] = getBygetFilmFullPaymentConfirmations_By_CI_PrevAndNext(
				session, filmPaymentConfirmation, caseId, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected FilmPaymentConfirmation
		getBygetFilmFullPaymentConfirmations_By_CI_PrevAndNext(
			Session session, FilmPaymentConfirmation filmPaymentConfirmation,
			String caseId,
			OrderByComparator<FilmPaymentConfirmation> orderByComparator,
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

		sb.append(_SQL_SELECT_FILMPAYMENTCONFIRMATION_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(
				_FINDER_COLUMN_GETFILMFULLPAYMENTCONFIRMATIONS_BY_CI_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(
				_FINDER_COLUMN_GETFILMFULLPAYMENTCONFIRMATIONS_BY_CI_CASEID_2);
		}

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
			sb.append(FilmPaymentConfirmationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindCaseId) {
			queryPos.add(caseId);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						filmPaymentConfirmation)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FilmPaymentConfirmation> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the film payment confirmations where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetFilmFullPaymentConfirmations_By_CI(String caseId) {
		for (FilmPaymentConfirmation filmPaymentConfirmation :
				findBygetFilmFullPaymentConfirmations_By_CI(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(filmPaymentConfirmation);
		}
	}

	/**
	 * Returns the number of film payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching film payment confirmations
	 */
	@Override
	public int countBygetFilmFullPaymentConfirmations_By_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath =
			_finderPathCountBygetFilmFullPaymentConfirmations_By_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FILMPAYMENTCONFIRMATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFILMFULLPAYMENTCONFIRMATIONS_BY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETFILMFULLPAYMENTCONFIRMATIONS_BY_CI_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

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
		_FINDER_COLUMN_GETFILMFULLPAYMENTCONFIRMATIONS_BY_CI_CASEID_2 =
			"filmPaymentConfirmation.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETFILMFULLPAYMENTCONFIRMATIONS_BY_CI_CASEID_3 =
			"(filmPaymentConfirmation.caseId IS NULL OR filmPaymentConfirmation.caseId = '')";

	public FilmPaymentConfirmationPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("comment", "comment_");

		setDBColumnNames(dbColumnNames);

		setModelClass(FilmPaymentConfirmation.class);

		setModelImplClass(FilmPaymentConfirmationImpl.class);
		setModelPKClass(long.class);

		setTable(FilmPaymentConfirmationTable.INSTANCE);
	}

	/**
	 * Caches the film payment confirmation in the entity cache if it is enabled.
	 *
	 * @param filmPaymentConfirmation the film payment confirmation
	 */
	@Override
	public void cacheResult(FilmPaymentConfirmation filmPaymentConfirmation) {
		entityCache.putResult(
			FilmPaymentConfirmationImpl.class,
			filmPaymentConfirmation.getPrimaryKey(), filmPaymentConfirmation);

		finderCache.putResult(
			_finderPathFetchBygetFilmFullPaymentConfirmationBy_CI,
			new Object[] {filmPaymentConfirmation.getCaseId()},
			filmPaymentConfirmation);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the film payment confirmations in the entity cache if it is enabled.
	 *
	 * @param filmPaymentConfirmations the film payment confirmations
	 */
	@Override
	public void cacheResult(
		List<FilmPaymentConfirmation> filmPaymentConfirmations) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (filmPaymentConfirmations.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FilmPaymentConfirmation filmPaymentConfirmation :
				filmPaymentConfirmations) {

			if (entityCache.getResult(
					FilmPaymentConfirmationImpl.class,
					filmPaymentConfirmation.getPrimaryKey()) == null) {

				cacheResult(filmPaymentConfirmation);
			}
		}
	}

	/**
	 * Clears the cache for all film payment confirmations.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FilmPaymentConfirmationImpl.class);

		finderCache.clearCache(FilmPaymentConfirmationImpl.class);
	}

	/**
	 * Clears the cache for the film payment confirmation.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FilmPaymentConfirmation filmPaymentConfirmation) {
		entityCache.removeResult(
			FilmPaymentConfirmationImpl.class, filmPaymentConfirmation);
	}

	@Override
	public void clearCache(
		List<FilmPaymentConfirmation> filmPaymentConfirmations) {

		for (FilmPaymentConfirmation filmPaymentConfirmation :
				filmPaymentConfirmations) {

			entityCache.removeResult(
				FilmPaymentConfirmationImpl.class, filmPaymentConfirmation);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FilmPaymentConfirmationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				FilmPaymentConfirmationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		FilmPaymentConfirmationModelImpl filmPaymentConfirmationModelImpl) {

		Object[] args = new Object[] {
			filmPaymentConfirmationModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetFilmFullPaymentConfirmationBy_CI, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFilmFullPaymentConfirmationBy_CI, args,
			filmPaymentConfirmationModelImpl);
	}

	/**
	 * Creates a new film payment confirmation with the primary key. Does not add the film payment confirmation to the database.
	 *
	 * @param filmPaymentId the primary key for the new film payment confirmation
	 * @return the new film payment confirmation
	 */
	@Override
	public FilmPaymentConfirmation create(long filmPaymentId) {
		FilmPaymentConfirmation filmPaymentConfirmation =
			new FilmPaymentConfirmationImpl();

		filmPaymentConfirmation.setNew(true);
		filmPaymentConfirmation.setPrimaryKey(filmPaymentId);

		filmPaymentConfirmation.setCompanyId(CompanyThreadLocal.getCompanyId());

		return filmPaymentConfirmation;
	}

	/**
	 * Removes the film payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param filmPaymentId the primary key of the film payment confirmation
	 * @return the film payment confirmation that was removed
	 * @throws NoSuchFilmPaymentConfirmationException if a film payment confirmation with the primary key could not be found
	 */
	@Override
	public FilmPaymentConfirmation remove(long filmPaymentId)
		throws NoSuchFilmPaymentConfirmationException {

		return remove((Serializable)filmPaymentId);
	}

	/**
	 * Removes the film payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the film payment confirmation
	 * @return the film payment confirmation that was removed
	 * @throws NoSuchFilmPaymentConfirmationException if a film payment confirmation with the primary key could not be found
	 */
	@Override
	public FilmPaymentConfirmation remove(Serializable primaryKey)
		throws NoSuchFilmPaymentConfirmationException {

		Session session = null;

		try {
			session = openSession();

			FilmPaymentConfirmation filmPaymentConfirmation =
				(FilmPaymentConfirmation)session.get(
					FilmPaymentConfirmationImpl.class, primaryKey);

			if (filmPaymentConfirmation == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFilmPaymentConfirmationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(filmPaymentConfirmation);
		}
		catch (NoSuchFilmPaymentConfirmationException noSuchEntityException) {
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
	protected FilmPaymentConfirmation removeImpl(
		FilmPaymentConfirmation filmPaymentConfirmation) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(filmPaymentConfirmation)) {
				filmPaymentConfirmation = (FilmPaymentConfirmation)session.get(
					FilmPaymentConfirmationImpl.class,
					filmPaymentConfirmation.getPrimaryKeyObj());
			}

			if (filmPaymentConfirmation != null) {
				session.delete(filmPaymentConfirmation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (filmPaymentConfirmation != null) {
			clearCache(filmPaymentConfirmation);
		}

		return filmPaymentConfirmation;
	}

	@Override
	public FilmPaymentConfirmation updateImpl(
		FilmPaymentConfirmation filmPaymentConfirmation) {

		boolean isNew = filmPaymentConfirmation.isNew();

		if (!(filmPaymentConfirmation instanceof
				FilmPaymentConfirmationModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(filmPaymentConfirmation.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					filmPaymentConfirmation);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in filmPaymentConfirmation proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FilmPaymentConfirmation implementation " +
					filmPaymentConfirmation.getClass());
		}

		FilmPaymentConfirmationModelImpl filmPaymentConfirmationModelImpl =
			(FilmPaymentConfirmationModelImpl)filmPaymentConfirmation;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (filmPaymentConfirmation.getCreateDate() == null)) {
			if (serviceContext == null) {
				filmPaymentConfirmation.setCreateDate(date);
			}
			else {
				filmPaymentConfirmation.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!filmPaymentConfirmationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				filmPaymentConfirmation.setModifiedDate(date);
			}
			else {
				filmPaymentConfirmation.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(filmPaymentConfirmation);
			}
			else {
				filmPaymentConfirmation =
					(FilmPaymentConfirmation)session.merge(
						filmPaymentConfirmation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FilmPaymentConfirmationImpl.class, filmPaymentConfirmationModelImpl,
			false, true);

		cacheUniqueFindersCache(filmPaymentConfirmationModelImpl);

		if (isNew) {
			filmPaymentConfirmation.setNew(false);
		}

		filmPaymentConfirmation.resetOriginalValues();

		return filmPaymentConfirmation;
	}

	/**
	 * Returns the film payment confirmation with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the film payment confirmation
	 * @return the film payment confirmation
	 * @throws NoSuchFilmPaymentConfirmationException if a film payment confirmation with the primary key could not be found
	 */
	@Override
	public FilmPaymentConfirmation findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFilmPaymentConfirmationException {

		FilmPaymentConfirmation filmPaymentConfirmation = fetchByPrimaryKey(
			primaryKey);

		if (filmPaymentConfirmation == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFilmPaymentConfirmationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return filmPaymentConfirmation;
	}

	/**
	 * Returns the film payment confirmation with the primary key or throws a <code>NoSuchFilmPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param filmPaymentId the primary key of the film payment confirmation
	 * @return the film payment confirmation
	 * @throws NoSuchFilmPaymentConfirmationException if a film payment confirmation with the primary key could not be found
	 */
	@Override
	public FilmPaymentConfirmation findByPrimaryKey(long filmPaymentId)
		throws NoSuchFilmPaymentConfirmationException {

		return findByPrimaryKey((Serializable)filmPaymentId);
	}

	/**
	 * Returns the film payment confirmation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param filmPaymentId the primary key of the film payment confirmation
	 * @return the film payment confirmation, or <code>null</code> if a film payment confirmation with the primary key could not be found
	 */
	@Override
	public FilmPaymentConfirmation fetchByPrimaryKey(long filmPaymentId) {
		return fetchByPrimaryKey((Serializable)filmPaymentId);
	}

	/**
	 * Returns all the film payment confirmations.
	 *
	 * @return the film payment confirmations
	 */
	@Override
	public List<FilmPaymentConfirmation> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the film payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film payment confirmations
	 * @param end the upper bound of the range of film payment confirmations (not inclusive)
	 * @return the range of film payment confirmations
	 */
	@Override
	public List<FilmPaymentConfirmation> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the film payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film payment confirmations
	 * @param end the upper bound of the range of film payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of film payment confirmations
	 */
	@Override
	public List<FilmPaymentConfirmation> findAll(
		int start, int end,
		OrderByComparator<FilmPaymentConfirmation> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the film payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film payment confirmations
	 * @param end the upper bound of the range of film payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of film payment confirmations
	 */
	@Override
	public List<FilmPaymentConfirmation> findAll(
		int start, int end,
		OrderByComparator<FilmPaymentConfirmation> orderByComparator,
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

		List<FilmPaymentConfirmation> list = null;

		if (useFinderCache) {
			list = (List<FilmPaymentConfirmation>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FILMPAYMENTCONFIRMATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FILMPAYMENTCONFIRMATION;

				sql = sql.concat(
					FilmPaymentConfirmationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FilmPaymentConfirmation>)QueryUtil.list(
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
	 * Removes all the film payment confirmations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FilmPaymentConfirmation filmPaymentConfirmation : findAll()) {
			remove(filmPaymentConfirmation);
		}
	}

	/**
	 * Returns the number of film payment confirmations.
	 *
	 * @return the number of film payment confirmations
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
					_SQL_COUNT_FILMPAYMENTCONFIRMATION);

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
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "filmPaymentId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FILMPAYMENTCONFIRMATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FilmPaymentConfirmationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the film payment confirmation persistence.
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

		_finderPathFetchBygetFilmFullPaymentConfirmationBy_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY,
			"fetchBygetFilmFullPaymentConfirmationBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetFilmFullPaymentConfirmationBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFilmFullPaymentConfirmationBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetFilmFullPaymentConfirmations_By_CI =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetFilmFullPaymentConfirmations_By_CI",
				new String[] {
					String.class.getName(), Integer.class.getName(),
					Integer.class.getName(), OrderByComparator.class.getName()
				},
				new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetFilmFullPaymentConfirmations_By_CI =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetFilmFullPaymentConfirmations_By_CI",
				new String[] {String.class.getName()}, new String[] {"caseId"},
				true);

		_finderPathCountBygetFilmFullPaymentConfirmations_By_CI =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"countBygetFilmFullPaymentConfirmations_By_CI",
				new String[] {String.class.getName()}, new String[] {"caseId"},
				false);

		FilmPaymentConfirmationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		FilmPaymentConfirmationUtil.setPersistence(null);

		entityCache.removeCache(FilmPaymentConfirmationImpl.class.getName());
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

	private static final String _SQL_SELECT_FILMPAYMENTCONFIRMATION =
		"SELECT filmPaymentConfirmation FROM FilmPaymentConfirmation filmPaymentConfirmation";

	private static final String _SQL_SELECT_FILMPAYMENTCONFIRMATION_WHERE =
		"SELECT filmPaymentConfirmation FROM FilmPaymentConfirmation filmPaymentConfirmation WHERE ";

	private static final String _SQL_COUNT_FILMPAYMENTCONFIRMATION =
		"SELECT COUNT(filmPaymentConfirmation) FROM FilmPaymentConfirmation filmPaymentConfirmation";

	private static final String _SQL_COUNT_FILMPAYMENTCONFIRMATION_WHERE =
		"SELECT COUNT(filmPaymentConfirmation) FROM FilmPaymentConfirmation filmPaymentConfirmation WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"filmPaymentConfirmation.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FilmPaymentConfirmation exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FilmPaymentConfirmation exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FilmPaymentConfirmationPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"comment"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}