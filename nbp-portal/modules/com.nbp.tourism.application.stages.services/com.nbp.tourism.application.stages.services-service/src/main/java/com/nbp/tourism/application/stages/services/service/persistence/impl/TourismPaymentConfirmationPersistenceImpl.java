/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.stages.services.service.persistence.impl;

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

import com.nbp.tourism.application.stages.services.exception.NoSuchTourismPaymentConfirmationException;
import com.nbp.tourism.application.stages.services.model.TourismPaymentConfirmation;
import com.nbp.tourism.application.stages.services.model.TourismPaymentConfirmationTable;
import com.nbp.tourism.application.stages.services.model.impl.TourismPaymentConfirmationImpl;
import com.nbp.tourism.application.stages.services.model.impl.TourismPaymentConfirmationModelImpl;
import com.nbp.tourism.application.stages.services.service.persistence.TourismPaymentConfirmationPersistence;
import com.nbp.tourism.application.stages.services.service.persistence.TourismPaymentConfirmationUtil;
import com.nbp.tourism.application.stages.services.service.persistence.impl.constants.TOURISM_STAGESPersistenceConstants;

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
 * The persistence implementation for the tourism payment confirmation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = TourismPaymentConfirmationPersistence.class)
public class TourismPaymentConfirmationPersistenceImpl
	extends BasePersistenceImpl<TourismPaymentConfirmation>
	implements TourismPaymentConfirmationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>TourismPaymentConfirmationUtil</code> to access the tourism payment confirmation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		TourismPaymentConfirmationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetTourismPaymentConfirmationBy_CI;
	private FinderPath _finderPathCountBygetTourismPaymentConfirmationBy_CI;

	/**
	 * Returns the tourism payment confirmation where caseId = &#63; or throws a <code>NoSuchTourismPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching tourism payment confirmation
	 * @throws NoSuchTourismPaymentConfirmationException if a matching tourism payment confirmation could not be found
	 */
	@Override
	public TourismPaymentConfirmation findBygetTourismPaymentConfirmationBy_CI(
			String caseId)
		throws NoSuchTourismPaymentConfirmationException {

		TourismPaymentConfirmation tourismPaymentConfirmation =
			fetchBygetTourismPaymentConfirmationBy_CI(caseId);

		if (tourismPaymentConfirmation == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchTourismPaymentConfirmationException(sb.toString());
		}

		return tourismPaymentConfirmation;
	}

	/**
	 * Returns the tourism payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching tourism payment confirmation, or <code>null</code> if a matching tourism payment confirmation could not be found
	 */
	@Override
	public TourismPaymentConfirmation fetchBygetTourismPaymentConfirmationBy_CI(
		String caseId) {

		return fetchBygetTourismPaymentConfirmationBy_CI(caseId, true);
	}

	/**
	 * Returns the tourism payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism payment confirmation, or <code>null</code> if a matching tourism payment confirmation could not be found
	 */
	@Override
	public TourismPaymentConfirmation fetchBygetTourismPaymentConfirmationBy_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetTourismPaymentConfirmationBy_CI,
				finderArgs, this);
		}

		if (result instanceof TourismPaymentConfirmation) {
			TourismPaymentConfirmation tourismPaymentConfirmation =
				(TourismPaymentConfirmation)result;

			if (!Objects.equals(
					caseId, tourismPaymentConfirmation.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_TOURISMPAYMENTCONFIRMATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETTOURISMPAYMENTCONFIRMATIONBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETTOURISMPAYMENTCONFIRMATIONBY_CI_CASEID_2);
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

				List<TourismPaymentConfirmation> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetTourismPaymentConfirmationBy_CI,
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
								"TourismPaymentConfirmationPersistenceImpl.fetchBygetTourismPaymentConfirmationBy_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					TourismPaymentConfirmation tourismPaymentConfirmation =
						list.get(0);

					result = tourismPaymentConfirmation;

					cacheResult(tourismPaymentConfirmation);
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
			return (TourismPaymentConfirmation)result;
		}
	}

	/**
	 * Removes the tourism payment confirmation where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the tourism payment confirmation that was removed
	 */
	@Override
	public TourismPaymentConfirmation
			removeBygetTourismPaymentConfirmationBy_CI(String caseId)
		throws NoSuchTourismPaymentConfirmationException {

		TourismPaymentConfirmation tourismPaymentConfirmation =
			findBygetTourismPaymentConfirmationBy_CI(caseId);

		return remove(tourismPaymentConfirmation);
	}

	/**
	 * Returns the number of tourism payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching tourism payment confirmations
	 */
	@Override
	public int countBygetTourismPaymentConfirmationBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath =
			_finderPathCountBygetTourismPaymentConfirmationBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TOURISMPAYMENTCONFIRMATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETTOURISMPAYMENTCONFIRMATIONBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETTOURISMPAYMENTCONFIRMATIONBY_CI_CASEID_2);
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
		_FINDER_COLUMN_GETTOURISMPAYMENTCONFIRMATIONBY_CI_CASEID_2 =
			"tourismPaymentConfirmation.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETTOURISMPAYMENTCONFIRMATIONBY_CI_CASEID_3 =
			"(tourismPaymentConfirmation.caseId IS NULL OR tourismPaymentConfirmation.caseId = '')";

	private FinderPath
		_finderPathWithPaginationFindBygetTourismPaymentConfirmations_By_CI;
	private FinderPath
		_finderPathWithoutPaginationFindBygetTourismPaymentConfirmations_By_CI;
	private FinderPath _finderPathCountBygetTourismPaymentConfirmations_By_CI;

	/**
	 * Returns all the tourism payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching tourism payment confirmations
	 */
	@Override
	public List<TourismPaymentConfirmation>
		findBygetTourismPaymentConfirmations_By_CI(String caseId) {

		return findBygetTourismPaymentConfirmations_By_CI(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tourism payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of tourism payment confirmations
	 * @param end the upper bound of the range of tourism payment confirmations (not inclusive)
	 * @return the range of matching tourism payment confirmations
	 */
	@Override
	public List<TourismPaymentConfirmation>
		findBygetTourismPaymentConfirmations_By_CI(
			String caseId, int start, int end) {

		return findBygetTourismPaymentConfirmations_By_CI(
			caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tourism payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of tourism payment confirmations
	 * @param end the upper bound of the range of tourism payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tourism payment confirmations
	 */
	@Override
	public List<TourismPaymentConfirmation>
		findBygetTourismPaymentConfirmations_By_CI(
			String caseId, int start, int end,
			OrderByComparator<TourismPaymentConfirmation> orderByComparator) {

		return findBygetTourismPaymentConfirmations_By_CI(
			caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tourism payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of tourism payment confirmations
	 * @param end the upper bound of the range of tourism payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching tourism payment confirmations
	 */
	@Override
	public List<TourismPaymentConfirmation>
		findBygetTourismPaymentConfirmations_By_CI(
			String caseId, int start, int end,
			OrderByComparator<TourismPaymentConfirmation> orderByComparator,
			boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetTourismPaymentConfirmations_By_CI;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetTourismPaymentConfirmations_By_CI;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<TourismPaymentConfirmation> list = null;

		if (useFinderCache) {
			list = (List<TourismPaymentConfirmation>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (TourismPaymentConfirmation tourismPaymentConfirmation :
						list) {

					if (!caseId.equals(
							tourismPaymentConfirmation.getCaseId())) {

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

			sb.append(_SQL_SELECT_TOURISMPAYMENTCONFIRMATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETTOURISMPAYMENTCONFIRMATIONS_BY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETTOURISMPAYMENTCONFIRMATIONS_BY_CI_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(TourismPaymentConfirmationModelImpl.ORDER_BY_JPQL);
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

				list = (List<TourismPaymentConfirmation>)QueryUtil.list(
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
	 * Returns the first tourism payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism payment confirmation
	 * @throws NoSuchTourismPaymentConfirmationException if a matching tourism payment confirmation could not be found
	 */
	@Override
	public TourismPaymentConfirmation
			findBygetTourismPaymentConfirmations_By_CI_First(
				String caseId,
				OrderByComparator<TourismPaymentConfirmation> orderByComparator)
		throws NoSuchTourismPaymentConfirmationException {

		TourismPaymentConfirmation tourismPaymentConfirmation =
			fetchBygetTourismPaymentConfirmations_By_CI_First(
				caseId, orderByComparator);

		if (tourismPaymentConfirmation != null) {
			return tourismPaymentConfirmation;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchTourismPaymentConfirmationException(sb.toString());
	}

	/**
	 * Returns the first tourism payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism payment confirmation, or <code>null</code> if a matching tourism payment confirmation could not be found
	 */
	@Override
	public TourismPaymentConfirmation
		fetchBygetTourismPaymentConfirmations_By_CI_First(
			String caseId,
			OrderByComparator<TourismPaymentConfirmation> orderByComparator) {

		List<TourismPaymentConfirmation> list =
			findBygetTourismPaymentConfirmations_By_CI(
				caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tourism payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism payment confirmation
	 * @throws NoSuchTourismPaymentConfirmationException if a matching tourism payment confirmation could not be found
	 */
	@Override
	public TourismPaymentConfirmation
			findBygetTourismPaymentConfirmations_By_CI_Last(
				String caseId,
				OrderByComparator<TourismPaymentConfirmation> orderByComparator)
		throws NoSuchTourismPaymentConfirmationException {

		TourismPaymentConfirmation tourismPaymentConfirmation =
			fetchBygetTourismPaymentConfirmations_By_CI_Last(
				caseId, orderByComparator);

		if (tourismPaymentConfirmation != null) {
			return tourismPaymentConfirmation;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchTourismPaymentConfirmationException(sb.toString());
	}

	/**
	 * Returns the last tourism payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism payment confirmation, or <code>null</code> if a matching tourism payment confirmation could not be found
	 */
	@Override
	public TourismPaymentConfirmation
		fetchBygetTourismPaymentConfirmations_By_CI_Last(
			String caseId,
			OrderByComparator<TourismPaymentConfirmation> orderByComparator) {

		int count = countBygetTourismPaymentConfirmations_By_CI(caseId);

		if (count == 0) {
			return null;
		}

		List<TourismPaymentConfirmation> list =
			findBygetTourismPaymentConfirmations_By_CI(
				caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tourism payment confirmations before and after the current tourism payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param tourismPaymentId the primary key of the current tourism payment confirmation
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tourism payment confirmation
	 * @throws NoSuchTourismPaymentConfirmationException if a tourism payment confirmation with the primary key could not be found
	 */
	@Override
	public TourismPaymentConfirmation[]
			findBygetTourismPaymentConfirmations_By_CI_PrevAndNext(
				long tourismPaymentId, String caseId,
				OrderByComparator<TourismPaymentConfirmation> orderByComparator)
		throws NoSuchTourismPaymentConfirmationException {

		caseId = Objects.toString(caseId, "");

		TourismPaymentConfirmation tourismPaymentConfirmation =
			findByPrimaryKey(tourismPaymentId);

		Session session = null;

		try {
			session = openSession();

			TourismPaymentConfirmation[] array =
				new TourismPaymentConfirmationImpl[3];

			array[0] = getBygetTourismPaymentConfirmations_By_CI_PrevAndNext(
				session, tourismPaymentConfirmation, caseId, orderByComparator,
				true);

			array[1] = tourismPaymentConfirmation;

			array[2] = getBygetTourismPaymentConfirmations_By_CI_PrevAndNext(
				session, tourismPaymentConfirmation, caseId, orderByComparator,
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

	protected TourismPaymentConfirmation
		getBygetTourismPaymentConfirmations_By_CI_PrevAndNext(
			Session session,
			TourismPaymentConfirmation tourismPaymentConfirmation,
			String caseId,
			OrderByComparator<TourismPaymentConfirmation> orderByComparator,
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

		sb.append(_SQL_SELECT_TOURISMPAYMENTCONFIRMATION_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(
				_FINDER_COLUMN_GETTOURISMPAYMENTCONFIRMATIONS_BY_CI_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(
				_FINDER_COLUMN_GETTOURISMPAYMENTCONFIRMATIONS_BY_CI_CASEID_2);
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
			sb.append(TourismPaymentConfirmationModelImpl.ORDER_BY_JPQL);
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
						tourismPaymentConfirmation)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<TourismPaymentConfirmation> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tourism payment confirmations where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetTourismPaymentConfirmations_By_CI(String caseId) {
		for (TourismPaymentConfirmation tourismPaymentConfirmation :
				findBygetTourismPaymentConfirmations_By_CI(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(tourismPaymentConfirmation);
		}
	}

	/**
	 * Returns the number of tourism payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching tourism payment confirmations
	 */
	@Override
	public int countBygetTourismPaymentConfirmations_By_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath =
			_finderPathCountBygetTourismPaymentConfirmations_By_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TOURISMPAYMENTCONFIRMATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETTOURISMPAYMENTCONFIRMATIONS_BY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETTOURISMPAYMENTCONFIRMATIONS_BY_CI_CASEID_2);
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
		_FINDER_COLUMN_GETTOURISMPAYMENTCONFIRMATIONS_BY_CI_CASEID_2 =
			"tourismPaymentConfirmation.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETTOURISMPAYMENTCONFIRMATIONS_BY_CI_CASEID_3 =
			"(tourismPaymentConfirmation.caseId IS NULL OR tourismPaymentConfirmation.caseId = '')";

	public TourismPaymentConfirmationPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("comment", "comment_");

		setDBColumnNames(dbColumnNames);

		setModelClass(TourismPaymentConfirmation.class);

		setModelImplClass(TourismPaymentConfirmationImpl.class);
		setModelPKClass(long.class);

		setTable(TourismPaymentConfirmationTable.INSTANCE);
	}

	/**
	 * Caches the tourism payment confirmation in the entity cache if it is enabled.
	 *
	 * @param tourismPaymentConfirmation the tourism payment confirmation
	 */
	@Override
	public void cacheResult(
		TourismPaymentConfirmation tourismPaymentConfirmation) {

		entityCache.putResult(
			TourismPaymentConfirmationImpl.class,
			tourismPaymentConfirmation.getPrimaryKey(),
			tourismPaymentConfirmation);

		finderCache.putResult(
			_finderPathFetchBygetTourismPaymentConfirmationBy_CI,
			new Object[] {tourismPaymentConfirmation.getCaseId()},
			tourismPaymentConfirmation);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the tourism payment confirmations in the entity cache if it is enabled.
	 *
	 * @param tourismPaymentConfirmations the tourism payment confirmations
	 */
	@Override
	public void cacheResult(
		List<TourismPaymentConfirmation> tourismPaymentConfirmations) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (tourismPaymentConfirmations.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (TourismPaymentConfirmation tourismPaymentConfirmation :
				tourismPaymentConfirmations) {

			if (entityCache.getResult(
					TourismPaymentConfirmationImpl.class,
					tourismPaymentConfirmation.getPrimaryKey()) == null) {

				cacheResult(tourismPaymentConfirmation);
			}
		}
	}

	/**
	 * Clears the cache for all tourism payment confirmations.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TourismPaymentConfirmationImpl.class);

		finderCache.clearCache(TourismPaymentConfirmationImpl.class);
	}

	/**
	 * Clears the cache for the tourism payment confirmation.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		TourismPaymentConfirmation tourismPaymentConfirmation) {

		entityCache.removeResult(
			TourismPaymentConfirmationImpl.class, tourismPaymentConfirmation);
	}

	@Override
	public void clearCache(
		List<TourismPaymentConfirmation> tourismPaymentConfirmations) {

		for (TourismPaymentConfirmation tourismPaymentConfirmation :
				tourismPaymentConfirmations) {

			entityCache.removeResult(
				TourismPaymentConfirmationImpl.class,
				tourismPaymentConfirmation);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(TourismPaymentConfirmationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				TourismPaymentConfirmationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		TourismPaymentConfirmationModelImpl
			tourismPaymentConfirmationModelImpl) {

		Object[] args = new Object[] {
			tourismPaymentConfirmationModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetTourismPaymentConfirmationBy_CI, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetTourismPaymentConfirmationBy_CI, args,
			tourismPaymentConfirmationModelImpl);
	}

	/**
	 * Creates a new tourism payment confirmation with the primary key. Does not add the tourism payment confirmation to the database.
	 *
	 * @param tourismPaymentId the primary key for the new tourism payment confirmation
	 * @return the new tourism payment confirmation
	 */
	@Override
	public TourismPaymentConfirmation create(long tourismPaymentId) {
		TourismPaymentConfirmation tourismPaymentConfirmation =
			new TourismPaymentConfirmationImpl();

		tourismPaymentConfirmation.setNew(true);
		tourismPaymentConfirmation.setPrimaryKey(tourismPaymentId);

		tourismPaymentConfirmation.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return tourismPaymentConfirmation;
	}

	/**
	 * Removes the tourism payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismPaymentId the primary key of the tourism payment confirmation
	 * @return the tourism payment confirmation that was removed
	 * @throws NoSuchTourismPaymentConfirmationException if a tourism payment confirmation with the primary key could not be found
	 */
	@Override
	public TourismPaymentConfirmation remove(long tourismPaymentId)
		throws NoSuchTourismPaymentConfirmationException {

		return remove((Serializable)tourismPaymentId);
	}

	/**
	 * Removes the tourism payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tourism payment confirmation
	 * @return the tourism payment confirmation that was removed
	 * @throws NoSuchTourismPaymentConfirmationException if a tourism payment confirmation with the primary key could not be found
	 */
	@Override
	public TourismPaymentConfirmation remove(Serializable primaryKey)
		throws NoSuchTourismPaymentConfirmationException {

		Session session = null;

		try {
			session = openSession();

			TourismPaymentConfirmation tourismPaymentConfirmation =
				(TourismPaymentConfirmation)session.get(
					TourismPaymentConfirmationImpl.class, primaryKey);

			if (tourismPaymentConfirmation == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTourismPaymentConfirmationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(tourismPaymentConfirmation);
		}
		catch (NoSuchTourismPaymentConfirmationException
					noSuchEntityException) {

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
	protected TourismPaymentConfirmation removeImpl(
		TourismPaymentConfirmation tourismPaymentConfirmation) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tourismPaymentConfirmation)) {
				tourismPaymentConfirmation =
					(TourismPaymentConfirmation)session.get(
						TourismPaymentConfirmationImpl.class,
						tourismPaymentConfirmation.getPrimaryKeyObj());
			}

			if (tourismPaymentConfirmation != null) {
				session.delete(tourismPaymentConfirmation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (tourismPaymentConfirmation != null) {
			clearCache(tourismPaymentConfirmation);
		}

		return tourismPaymentConfirmation;
	}

	@Override
	public TourismPaymentConfirmation updateImpl(
		TourismPaymentConfirmation tourismPaymentConfirmation) {

		boolean isNew = tourismPaymentConfirmation.isNew();

		if (!(tourismPaymentConfirmation instanceof
				TourismPaymentConfirmationModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(tourismPaymentConfirmation.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					tourismPaymentConfirmation);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in tourismPaymentConfirmation proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom TourismPaymentConfirmation implementation " +
					tourismPaymentConfirmation.getClass());
		}

		TourismPaymentConfirmationModelImpl
			tourismPaymentConfirmationModelImpl =
				(TourismPaymentConfirmationModelImpl)tourismPaymentConfirmation;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (tourismPaymentConfirmation.getCreateDate() == null)) {
			if (serviceContext == null) {
				tourismPaymentConfirmation.setCreateDate(date);
			}
			else {
				tourismPaymentConfirmation.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!tourismPaymentConfirmationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				tourismPaymentConfirmation.setModifiedDate(date);
			}
			else {
				tourismPaymentConfirmation.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(tourismPaymentConfirmation);
			}
			else {
				tourismPaymentConfirmation =
					(TourismPaymentConfirmation)session.merge(
						tourismPaymentConfirmation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			TourismPaymentConfirmationImpl.class,
			tourismPaymentConfirmationModelImpl, false, true);

		cacheUniqueFindersCache(tourismPaymentConfirmationModelImpl);

		if (isNew) {
			tourismPaymentConfirmation.setNew(false);
		}

		tourismPaymentConfirmation.resetOriginalValues();

		return tourismPaymentConfirmation;
	}

	/**
	 * Returns the tourism payment confirmation with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tourism payment confirmation
	 * @return the tourism payment confirmation
	 * @throws NoSuchTourismPaymentConfirmationException if a tourism payment confirmation with the primary key could not be found
	 */
	@Override
	public TourismPaymentConfirmation findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTourismPaymentConfirmationException {

		TourismPaymentConfirmation tourismPaymentConfirmation =
			fetchByPrimaryKey(primaryKey);

		if (tourismPaymentConfirmation == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTourismPaymentConfirmationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return tourismPaymentConfirmation;
	}

	/**
	 * Returns the tourism payment confirmation with the primary key or throws a <code>NoSuchTourismPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param tourismPaymentId the primary key of the tourism payment confirmation
	 * @return the tourism payment confirmation
	 * @throws NoSuchTourismPaymentConfirmationException if a tourism payment confirmation with the primary key could not be found
	 */
	@Override
	public TourismPaymentConfirmation findByPrimaryKey(long tourismPaymentId)
		throws NoSuchTourismPaymentConfirmationException {

		return findByPrimaryKey((Serializable)tourismPaymentId);
	}

	/**
	 * Returns the tourism payment confirmation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismPaymentId the primary key of the tourism payment confirmation
	 * @return the tourism payment confirmation, or <code>null</code> if a tourism payment confirmation with the primary key could not be found
	 */
	@Override
	public TourismPaymentConfirmation fetchByPrimaryKey(long tourismPaymentId) {
		return fetchByPrimaryKey((Serializable)tourismPaymentId);
	}

	/**
	 * Returns all the tourism payment confirmations.
	 *
	 * @return the tourism payment confirmations
	 */
	@Override
	public List<TourismPaymentConfirmation> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tourism payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism payment confirmations
	 * @param end the upper bound of the range of tourism payment confirmations (not inclusive)
	 * @return the range of tourism payment confirmations
	 */
	@Override
	public List<TourismPaymentConfirmation> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tourism payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism payment confirmations
	 * @param end the upper bound of the range of tourism payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism payment confirmations
	 */
	@Override
	public List<TourismPaymentConfirmation> findAll(
		int start, int end,
		OrderByComparator<TourismPaymentConfirmation> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tourism payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism payment confirmations
	 * @param end the upper bound of the range of tourism payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism payment confirmations
	 */
	@Override
	public List<TourismPaymentConfirmation> findAll(
		int start, int end,
		OrderByComparator<TourismPaymentConfirmation> orderByComparator,
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

		List<TourismPaymentConfirmation> list = null;

		if (useFinderCache) {
			list = (List<TourismPaymentConfirmation>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_TOURISMPAYMENTCONFIRMATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_TOURISMPAYMENTCONFIRMATION;

				sql = sql.concat(
					TourismPaymentConfirmationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<TourismPaymentConfirmation>)QueryUtil.list(
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
	 * Removes all the tourism payment confirmations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TourismPaymentConfirmation tourismPaymentConfirmation :
				findAll()) {

			remove(tourismPaymentConfirmation);
		}
	}

	/**
	 * Returns the number of tourism payment confirmations.
	 *
	 * @return the number of tourism payment confirmations
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
					_SQL_COUNT_TOURISMPAYMENTCONFIRMATION);

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
		return "tourismPaymentId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_TOURISMPAYMENTCONFIRMATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TourismPaymentConfirmationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the tourism payment confirmation persistence.
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

		_finderPathFetchBygetTourismPaymentConfirmationBy_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY,
			"fetchBygetTourismPaymentConfirmationBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetTourismPaymentConfirmationBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetTourismPaymentConfirmationBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetTourismPaymentConfirmations_By_CI =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetTourismPaymentConfirmations_By_CI",
				new String[] {
					String.class.getName(), Integer.class.getName(),
					Integer.class.getName(), OrderByComparator.class.getName()
				},
				new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetTourismPaymentConfirmations_By_CI =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetTourismPaymentConfirmations_By_CI",
				new String[] {String.class.getName()}, new String[] {"caseId"},
				true);

		_finderPathCountBygetTourismPaymentConfirmations_By_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetTourismPaymentConfirmations_By_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		TourismPaymentConfirmationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		TourismPaymentConfirmationUtil.setPersistence(null);

		entityCache.removeCache(TourismPaymentConfirmationImpl.class.getName());
	}

	@Override
	@Reference(
		target = TOURISM_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = TOURISM_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = TOURISM_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_TOURISMPAYMENTCONFIRMATION =
		"SELECT tourismPaymentConfirmation FROM TourismPaymentConfirmation tourismPaymentConfirmation";

	private static final String _SQL_SELECT_TOURISMPAYMENTCONFIRMATION_WHERE =
		"SELECT tourismPaymentConfirmation FROM TourismPaymentConfirmation tourismPaymentConfirmation WHERE ";

	private static final String _SQL_COUNT_TOURISMPAYMENTCONFIRMATION =
		"SELECT COUNT(tourismPaymentConfirmation) FROM TourismPaymentConfirmation tourismPaymentConfirmation";

	private static final String _SQL_COUNT_TOURISMPAYMENTCONFIRMATION_WHERE =
		"SELECT COUNT(tourismPaymentConfirmation) FROM TourismPaymentConfirmation tourismPaymentConfirmation WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"tourismPaymentConfirmation.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No TourismPaymentConfirmation exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No TourismPaymentConfirmation exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		TourismPaymentConfirmationPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"comment"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}