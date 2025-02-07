/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service.persistence.impl;

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

import com.nbp.acquire.stages.service.exception.NoSuchAcquirePaymentConfirmationException;
import com.nbp.acquire.stages.service.model.AcquirePaymentConfirmation;
import com.nbp.acquire.stages.service.model.AcquirePaymentConfirmationTable;
import com.nbp.acquire.stages.service.model.impl.AcquirePaymentConfirmationImpl;
import com.nbp.acquire.stages.service.model.impl.AcquirePaymentConfirmationModelImpl;
import com.nbp.acquire.stages.service.service.persistence.AcquirePaymentConfirmationPersistence;
import com.nbp.acquire.stages.service.service.persistence.AcquirePaymentConfirmationUtil;
import com.nbp.acquire.stages.service.service.persistence.impl.constants.NBP_ACQUIREPersistenceConstants;

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
 * The persistence implementation for the acquire payment confirmation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AcquirePaymentConfirmationPersistence.class)
public class AcquirePaymentConfirmationPersistenceImpl
	extends BasePersistenceImpl<AcquirePaymentConfirmation>
	implements AcquirePaymentConfirmationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AcquirePaymentConfirmationUtil</code> to access the acquire payment confirmation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AcquirePaymentConfirmationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetAcquirePaymentConfirmationBy_CI;
	private FinderPath _finderPathCountBygetAcquirePaymentConfirmationBy_CI;

	/**
	 * Returns the acquire payment confirmation where caseId = &#63; or throws a <code>NoSuchAcquirePaymentConfirmationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire payment confirmation
	 * @throws NoSuchAcquirePaymentConfirmationException if a matching acquire payment confirmation could not be found
	 */
	@Override
	public AcquirePaymentConfirmation findBygetAcquirePaymentConfirmationBy_CI(
			String caseId)
		throws NoSuchAcquirePaymentConfirmationException {

		AcquirePaymentConfirmation acquirePaymentConfirmation =
			fetchBygetAcquirePaymentConfirmationBy_CI(caseId);

		if (acquirePaymentConfirmation == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAcquirePaymentConfirmationException(sb.toString());
		}

		return acquirePaymentConfirmation;
	}

	/**
	 * Returns the acquire payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire payment confirmation, or <code>null</code> if a matching acquire payment confirmation could not be found
	 */
	@Override
	public AcquirePaymentConfirmation fetchBygetAcquirePaymentConfirmationBy_CI(
		String caseId) {

		return fetchBygetAcquirePaymentConfirmationBy_CI(caseId, true);
	}

	/**
	 * Returns the acquire payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire payment confirmation, or <code>null</code> if a matching acquire payment confirmation could not be found
	 */
	@Override
	public AcquirePaymentConfirmation fetchBygetAcquirePaymentConfirmationBy_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetAcquirePaymentConfirmationBy_CI,
				finderArgs, this);
		}

		if (result instanceof AcquirePaymentConfirmation) {
			AcquirePaymentConfirmation acquirePaymentConfirmation =
				(AcquirePaymentConfirmation)result;

			if (!Objects.equals(
					caseId, acquirePaymentConfirmation.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_ACQUIREPAYMENTCONFIRMATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETACQUIREPAYMENTCONFIRMATIONBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETACQUIREPAYMENTCONFIRMATIONBY_CI_CASEID_2);
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

				List<AcquirePaymentConfirmation> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetAcquirePaymentConfirmationBy_CI,
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
								"AcquirePaymentConfirmationPersistenceImpl.fetchBygetAcquirePaymentConfirmationBy_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AcquirePaymentConfirmation acquirePaymentConfirmation =
						list.get(0);

					result = acquirePaymentConfirmation;

					cacheResult(acquirePaymentConfirmation);
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
			return (AcquirePaymentConfirmation)result;
		}
	}

	/**
	 * Removes the acquire payment confirmation where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the acquire payment confirmation that was removed
	 */
	@Override
	public AcquirePaymentConfirmation
			removeBygetAcquirePaymentConfirmationBy_CI(String caseId)
		throws NoSuchAcquirePaymentConfirmationException {

		AcquirePaymentConfirmation acquirePaymentConfirmation =
			findBygetAcquirePaymentConfirmationBy_CI(caseId);

		return remove(acquirePaymentConfirmation);
	}

	/**
	 * Returns the number of acquire payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching acquire payment confirmations
	 */
	@Override
	public int countBygetAcquirePaymentConfirmationBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath =
			_finderPathCountBygetAcquirePaymentConfirmationBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ACQUIREPAYMENTCONFIRMATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETACQUIREPAYMENTCONFIRMATIONBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETACQUIREPAYMENTCONFIRMATIONBY_CI_CASEID_2);
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
		_FINDER_COLUMN_GETACQUIREPAYMENTCONFIRMATIONBY_CI_CASEID_2 =
			"acquirePaymentConfirmation.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETACQUIREPAYMENTCONFIRMATIONBY_CI_CASEID_3 =
			"(acquirePaymentConfirmation.caseId IS NULL OR acquirePaymentConfirmation.caseId = '')";

	private FinderPath
		_finderPathWithPaginationFindBygetAcquirePaymentConfirmations_By_CI;
	private FinderPath
		_finderPathWithoutPaginationFindBygetAcquirePaymentConfirmations_By_CI;
	private FinderPath _finderPathCountBygetAcquirePaymentConfirmations_By_CI;

	/**
	 * Returns all the acquire payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire payment confirmations
	 */
	@Override
	public List<AcquirePaymentConfirmation>
		findBygetAcquirePaymentConfirmations_By_CI(String caseId) {

		return findBygetAcquirePaymentConfirmations_By_CI(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acquire payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquirePaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of acquire payment confirmations
	 * @param end the upper bound of the range of acquire payment confirmations (not inclusive)
	 * @return the range of matching acquire payment confirmations
	 */
	@Override
	public List<AcquirePaymentConfirmation>
		findBygetAcquirePaymentConfirmations_By_CI(
			String caseId, int start, int end) {

		return findBygetAcquirePaymentConfirmations_By_CI(
			caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the acquire payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquirePaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of acquire payment confirmations
	 * @param end the upper bound of the range of acquire payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acquire payment confirmations
	 */
	@Override
	public List<AcquirePaymentConfirmation>
		findBygetAcquirePaymentConfirmations_By_CI(
			String caseId, int start, int end,
			OrderByComparator<AcquirePaymentConfirmation> orderByComparator) {

		return findBygetAcquirePaymentConfirmations_By_CI(
			caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acquire payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquirePaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of acquire payment confirmations
	 * @param end the upper bound of the range of acquire payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acquire payment confirmations
	 */
	@Override
	public List<AcquirePaymentConfirmation>
		findBygetAcquirePaymentConfirmations_By_CI(
			String caseId, int start, int end,
			OrderByComparator<AcquirePaymentConfirmation> orderByComparator,
			boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetAcquirePaymentConfirmations_By_CI;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetAcquirePaymentConfirmations_By_CI;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<AcquirePaymentConfirmation> list = null;

		if (useFinderCache) {
			list = (List<AcquirePaymentConfirmation>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AcquirePaymentConfirmation acquirePaymentConfirmation :
						list) {

					if (!caseId.equals(
							acquirePaymentConfirmation.getCaseId())) {

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

			sb.append(_SQL_SELECT_ACQUIREPAYMENTCONFIRMATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETACQUIREPAYMENTCONFIRMATIONS_BY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETACQUIREPAYMENTCONFIRMATIONS_BY_CI_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AcquirePaymentConfirmationModelImpl.ORDER_BY_JPQL);
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

				list = (List<AcquirePaymentConfirmation>)QueryUtil.list(
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
	 * Returns the first acquire payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire payment confirmation
	 * @throws NoSuchAcquirePaymentConfirmationException if a matching acquire payment confirmation could not be found
	 */
	@Override
	public AcquirePaymentConfirmation
			findBygetAcquirePaymentConfirmations_By_CI_First(
				String caseId,
				OrderByComparator<AcquirePaymentConfirmation> orderByComparator)
		throws NoSuchAcquirePaymentConfirmationException {

		AcquirePaymentConfirmation acquirePaymentConfirmation =
			fetchBygetAcquirePaymentConfirmations_By_CI_First(
				caseId, orderByComparator);

		if (acquirePaymentConfirmation != null) {
			return acquirePaymentConfirmation;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchAcquirePaymentConfirmationException(sb.toString());
	}

	/**
	 * Returns the first acquire payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire payment confirmation, or <code>null</code> if a matching acquire payment confirmation could not be found
	 */
	@Override
	public AcquirePaymentConfirmation
		fetchBygetAcquirePaymentConfirmations_By_CI_First(
			String caseId,
			OrderByComparator<AcquirePaymentConfirmation> orderByComparator) {

		List<AcquirePaymentConfirmation> list =
			findBygetAcquirePaymentConfirmations_By_CI(
				caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last acquire payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire payment confirmation
	 * @throws NoSuchAcquirePaymentConfirmationException if a matching acquire payment confirmation could not be found
	 */
	@Override
	public AcquirePaymentConfirmation
			findBygetAcquirePaymentConfirmations_By_CI_Last(
				String caseId,
				OrderByComparator<AcquirePaymentConfirmation> orderByComparator)
		throws NoSuchAcquirePaymentConfirmationException {

		AcquirePaymentConfirmation acquirePaymentConfirmation =
			fetchBygetAcquirePaymentConfirmations_By_CI_Last(
				caseId, orderByComparator);

		if (acquirePaymentConfirmation != null) {
			return acquirePaymentConfirmation;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchAcquirePaymentConfirmationException(sb.toString());
	}

	/**
	 * Returns the last acquire payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire payment confirmation, or <code>null</code> if a matching acquire payment confirmation could not be found
	 */
	@Override
	public AcquirePaymentConfirmation
		fetchBygetAcquirePaymentConfirmations_By_CI_Last(
			String caseId,
			OrderByComparator<AcquirePaymentConfirmation> orderByComparator) {

		int count = countBygetAcquirePaymentConfirmations_By_CI(caseId);

		if (count == 0) {
			return null;
		}

		List<AcquirePaymentConfirmation> list =
			findBygetAcquirePaymentConfirmations_By_CI(
				caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the acquire payment confirmations before and after the current acquire payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param acquirePaymentId the primary key of the current acquire payment confirmation
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acquire payment confirmation
	 * @throws NoSuchAcquirePaymentConfirmationException if a acquire payment confirmation with the primary key could not be found
	 */
	@Override
	public AcquirePaymentConfirmation[]
			findBygetAcquirePaymentConfirmations_By_CI_PrevAndNext(
				long acquirePaymentId, String caseId,
				OrderByComparator<AcquirePaymentConfirmation> orderByComparator)
		throws NoSuchAcquirePaymentConfirmationException {

		caseId = Objects.toString(caseId, "");

		AcquirePaymentConfirmation acquirePaymentConfirmation =
			findByPrimaryKey(acquirePaymentId);

		Session session = null;

		try {
			session = openSession();

			AcquirePaymentConfirmation[] array =
				new AcquirePaymentConfirmationImpl[3];

			array[0] = getBygetAcquirePaymentConfirmations_By_CI_PrevAndNext(
				session, acquirePaymentConfirmation, caseId, orderByComparator,
				true);

			array[1] = acquirePaymentConfirmation;

			array[2] = getBygetAcquirePaymentConfirmations_By_CI_PrevAndNext(
				session, acquirePaymentConfirmation, caseId, orderByComparator,
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

	protected AcquirePaymentConfirmation
		getBygetAcquirePaymentConfirmations_By_CI_PrevAndNext(
			Session session,
			AcquirePaymentConfirmation acquirePaymentConfirmation,
			String caseId,
			OrderByComparator<AcquirePaymentConfirmation> orderByComparator,
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

		sb.append(_SQL_SELECT_ACQUIREPAYMENTCONFIRMATION_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(
				_FINDER_COLUMN_GETACQUIREPAYMENTCONFIRMATIONS_BY_CI_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(
				_FINDER_COLUMN_GETACQUIREPAYMENTCONFIRMATIONS_BY_CI_CASEID_2);
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
			sb.append(AcquirePaymentConfirmationModelImpl.ORDER_BY_JPQL);
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
						acquirePaymentConfirmation)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AcquirePaymentConfirmation> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the acquire payment confirmations where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetAcquirePaymentConfirmations_By_CI(String caseId) {
		for (AcquirePaymentConfirmation acquirePaymentConfirmation :
				findBygetAcquirePaymentConfirmations_By_CI(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(acquirePaymentConfirmation);
		}
	}

	/**
	 * Returns the number of acquire payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching acquire payment confirmations
	 */
	@Override
	public int countBygetAcquirePaymentConfirmations_By_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath =
			_finderPathCountBygetAcquirePaymentConfirmations_By_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ACQUIREPAYMENTCONFIRMATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETACQUIREPAYMENTCONFIRMATIONS_BY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETACQUIREPAYMENTCONFIRMATIONS_BY_CI_CASEID_2);
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
		_FINDER_COLUMN_GETACQUIREPAYMENTCONFIRMATIONS_BY_CI_CASEID_2 =
			"acquirePaymentConfirmation.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETACQUIREPAYMENTCONFIRMATIONS_BY_CI_CASEID_3 =
			"(acquirePaymentConfirmation.caseId IS NULL OR acquirePaymentConfirmation.caseId = '')";

	public AcquirePaymentConfirmationPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("comment", "comment_");

		setDBColumnNames(dbColumnNames);

		setModelClass(AcquirePaymentConfirmation.class);

		setModelImplClass(AcquirePaymentConfirmationImpl.class);
		setModelPKClass(long.class);

		setTable(AcquirePaymentConfirmationTable.INSTANCE);
	}

	/**
	 * Caches the acquire payment confirmation in the entity cache if it is enabled.
	 *
	 * @param acquirePaymentConfirmation the acquire payment confirmation
	 */
	@Override
	public void cacheResult(
		AcquirePaymentConfirmation acquirePaymentConfirmation) {

		entityCache.putResult(
			AcquirePaymentConfirmationImpl.class,
			acquirePaymentConfirmation.getPrimaryKey(),
			acquirePaymentConfirmation);

		finderCache.putResult(
			_finderPathFetchBygetAcquirePaymentConfirmationBy_CI,
			new Object[] {acquirePaymentConfirmation.getCaseId()},
			acquirePaymentConfirmation);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the acquire payment confirmations in the entity cache if it is enabled.
	 *
	 * @param acquirePaymentConfirmations the acquire payment confirmations
	 */
	@Override
	public void cacheResult(
		List<AcquirePaymentConfirmation> acquirePaymentConfirmations) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (acquirePaymentConfirmations.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AcquirePaymentConfirmation acquirePaymentConfirmation :
				acquirePaymentConfirmations) {

			if (entityCache.getResult(
					AcquirePaymentConfirmationImpl.class,
					acquirePaymentConfirmation.getPrimaryKey()) == null) {

				cacheResult(acquirePaymentConfirmation);
			}
		}
	}

	/**
	 * Clears the cache for all acquire payment confirmations.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AcquirePaymentConfirmationImpl.class);

		finderCache.clearCache(AcquirePaymentConfirmationImpl.class);
	}

	/**
	 * Clears the cache for the acquire payment confirmation.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		AcquirePaymentConfirmation acquirePaymentConfirmation) {

		entityCache.removeResult(
			AcquirePaymentConfirmationImpl.class, acquirePaymentConfirmation);
	}

	@Override
	public void clearCache(
		List<AcquirePaymentConfirmation> acquirePaymentConfirmations) {

		for (AcquirePaymentConfirmation acquirePaymentConfirmation :
				acquirePaymentConfirmations) {

			entityCache.removeResult(
				AcquirePaymentConfirmationImpl.class,
				acquirePaymentConfirmation);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AcquirePaymentConfirmationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AcquirePaymentConfirmationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AcquirePaymentConfirmationModelImpl
			acquirePaymentConfirmationModelImpl) {

		Object[] args = new Object[] {
			acquirePaymentConfirmationModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetAcquirePaymentConfirmationBy_CI, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetAcquirePaymentConfirmationBy_CI, args,
			acquirePaymentConfirmationModelImpl);
	}

	/**
	 * Creates a new acquire payment confirmation with the primary key. Does not add the acquire payment confirmation to the database.
	 *
	 * @param acquirePaymentId the primary key for the new acquire payment confirmation
	 * @return the new acquire payment confirmation
	 */
	@Override
	public AcquirePaymentConfirmation create(long acquirePaymentId) {
		AcquirePaymentConfirmation acquirePaymentConfirmation =
			new AcquirePaymentConfirmationImpl();

		acquirePaymentConfirmation.setNew(true);
		acquirePaymentConfirmation.setPrimaryKey(acquirePaymentId);

		acquirePaymentConfirmation.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return acquirePaymentConfirmation;
	}

	/**
	 * Removes the acquire payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquirePaymentId the primary key of the acquire payment confirmation
	 * @return the acquire payment confirmation that was removed
	 * @throws NoSuchAcquirePaymentConfirmationException if a acquire payment confirmation with the primary key could not be found
	 */
	@Override
	public AcquirePaymentConfirmation remove(long acquirePaymentId)
		throws NoSuchAcquirePaymentConfirmationException {

		return remove((Serializable)acquirePaymentId);
	}

	/**
	 * Removes the acquire payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the acquire payment confirmation
	 * @return the acquire payment confirmation that was removed
	 * @throws NoSuchAcquirePaymentConfirmationException if a acquire payment confirmation with the primary key could not be found
	 */
	@Override
	public AcquirePaymentConfirmation remove(Serializable primaryKey)
		throws NoSuchAcquirePaymentConfirmationException {

		Session session = null;

		try {
			session = openSession();

			AcquirePaymentConfirmation acquirePaymentConfirmation =
				(AcquirePaymentConfirmation)session.get(
					AcquirePaymentConfirmationImpl.class, primaryKey);

			if (acquirePaymentConfirmation == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAcquirePaymentConfirmationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(acquirePaymentConfirmation);
		}
		catch (NoSuchAcquirePaymentConfirmationException
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
	protected AcquirePaymentConfirmation removeImpl(
		AcquirePaymentConfirmation acquirePaymentConfirmation) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(acquirePaymentConfirmation)) {
				acquirePaymentConfirmation =
					(AcquirePaymentConfirmation)session.get(
						AcquirePaymentConfirmationImpl.class,
						acquirePaymentConfirmation.getPrimaryKeyObj());
			}

			if (acquirePaymentConfirmation != null) {
				session.delete(acquirePaymentConfirmation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (acquirePaymentConfirmation != null) {
			clearCache(acquirePaymentConfirmation);
		}

		return acquirePaymentConfirmation;
	}

	@Override
	public AcquirePaymentConfirmation updateImpl(
		AcquirePaymentConfirmation acquirePaymentConfirmation) {

		boolean isNew = acquirePaymentConfirmation.isNew();

		if (!(acquirePaymentConfirmation instanceof
				AcquirePaymentConfirmationModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(acquirePaymentConfirmation.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					acquirePaymentConfirmation);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in acquirePaymentConfirmation proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AcquirePaymentConfirmation implementation " +
					acquirePaymentConfirmation.getClass());
		}

		AcquirePaymentConfirmationModelImpl
			acquirePaymentConfirmationModelImpl =
				(AcquirePaymentConfirmationModelImpl)acquirePaymentConfirmation;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (acquirePaymentConfirmation.getCreateDate() == null)) {
			if (serviceContext == null) {
				acquirePaymentConfirmation.setCreateDate(date);
			}
			else {
				acquirePaymentConfirmation.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!acquirePaymentConfirmationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				acquirePaymentConfirmation.setModifiedDate(date);
			}
			else {
				acquirePaymentConfirmation.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(acquirePaymentConfirmation);
			}
			else {
				acquirePaymentConfirmation =
					(AcquirePaymentConfirmation)session.merge(
						acquirePaymentConfirmation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AcquirePaymentConfirmationImpl.class,
			acquirePaymentConfirmationModelImpl, false, true);

		cacheUniqueFindersCache(acquirePaymentConfirmationModelImpl);

		if (isNew) {
			acquirePaymentConfirmation.setNew(false);
		}

		acquirePaymentConfirmation.resetOriginalValues();

		return acquirePaymentConfirmation;
	}

	/**
	 * Returns the acquire payment confirmation with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the acquire payment confirmation
	 * @return the acquire payment confirmation
	 * @throws NoSuchAcquirePaymentConfirmationException if a acquire payment confirmation with the primary key could not be found
	 */
	@Override
	public AcquirePaymentConfirmation findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAcquirePaymentConfirmationException {

		AcquirePaymentConfirmation acquirePaymentConfirmation =
			fetchByPrimaryKey(primaryKey);

		if (acquirePaymentConfirmation == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAcquirePaymentConfirmationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return acquirePaymentConfirmation;
	}

	/**
	 * Returns the acquire payment confirmation with the primary key or throws a <code>NoSuchAcquirePaymentConfirmationException</code> if it could not be found.
	 *
	 * @param acquirePaymentId the primary key of the acquire payment confirmation
	 * @return the acquire payment confirmation
	 * @throws NoSuchAcquirePaymentConfirmationException if a acquire payment confirmation with the primary key could not be found
	 */
	@Override
	public AcquirePaymentConfirmation findByPrimaryKey(long acquirePaymentId)
		throws NoSuchAcquirePaymentConfirmationException {

		return findByPrimaryKey((Serializable)acquirePaymentId);
	}

	/**
	 * Returns the acquire payment confirmation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquirePaymentId the primary key of the acquire payment confirmation
	 * @return the acquire payment confirmation, or <code>null</code> if a acquire payment confirmation with the primary key could not be found
	 */
	@Override
	public AcquirePaymentConfirmation fetchByPrimaryKey(long acquirePaymentId) {
		return fetchByPrimaryKey((Serializable)acquirePaymentId);
	}

	/**
	 * Returns all the acquire payment confirmations.
	 *
	 * @return the acquire payment confirmations
	 */
	@Override
	public List<AcquirePaymentConfirmation> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acquire payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquirePaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire payment confirmations
	 * @param end the upper bound of the range of acquire payment confirmations (not inclusive)
	 * @return the range of acquire payment confirmations
	 */
	@Override
	public List<AcquirePaymentConfirmation> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the acquire payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquirePaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire payment confirmations
	 * @param end the upper bound of the range of acquire payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire payment confirmations
	 */
	@Override
	public List<AcquirePaymentConfirmation> findAll(
		int start, int end,
		OrderByComparator<AcquirePaymentConfirmation> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acquire payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquirePaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire payment confirmations
	 * @param end the upper bound of the range of acquire payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire payment confirmations
	 */
	@Override
	public List<AcquirePaymentConfirmation> findAll(
		int start, int end,
		OrderByComparator<AcquirePaymentConfirmation> orderByComparator,
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

		List<AcquirePaymentConfirmation> list = null;

		if (useFinderCache) {
			list = (List<AcquirePaymentConfirmation>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ACQUIREPAYMENTCONFIRMATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ACQUIREPAYMENTCONFIRMATION;

				sql = sql.concat(
					AcquirePaymentConfirmationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AcquirePaymentConfirmation>)QueryUtil.list(
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
	 * Removes all the acquire payment confirmations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AcquirePaymentConfirmation acquirePaymentConfirmation :
				findAll()) {

			remove(acquirePaymentConfirmation);
		}
	}

	/**
	 * Returns the number of acquire payment confirmations.
	 *
	 * @return the number of acquire payment confirmations
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
					_SQL_COUNT_ACQUIREPAYMENTCONFIRMATION);

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
		return "acquirePaymentId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ACQUIREPAYMENTCONFIRMATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AcquirePaymentConfirmationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the acquire payment confirmation persistence.
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

		_finderPathFetchBygetAcquirePaymentConfirmationBy_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY,
			"fetchBygetAcquirePaymentConfirmationBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetAcquirePaymentConfirmationBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetAcquirePaymentConfirmationBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetAcquirePaymentConfirmations_By_CI =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetAcquirePaymentConfirmations_By_CI",
				new String[] {
					String.class.getName(), Integer.class.getName(),
					Integer.class.getName(), OrderByComparator.class.getName()
				},
				new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetAcquirePaymentConfirmations_By_CI =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetAcquirePaymentConfirmations_By_CI",
				new String[] {String.class.getName()}, new String[] {"caseId"},
				true);

		_finderPathCountBygetAcquirePaymentConfirmations_By_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetAcquirePaymentConfirmations_By_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		AcquirePaymentConfirmationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AcquirePaymentConfirmationUtil.setPersistence(null);

		entityCache.removeCache(AcquirePaymentConfirmationImpl.class.getName());
	}

	@Override
	@Reference(
		target = NBP_ACQUIREPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = NBP_ACQUIREPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = NBP_ACQUIREPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_ACQUIREPAYMENTCONFIRMATION =
		"SELECT acquirePaymentConfirmation FROM AcquirePaymentConfirmation acquirePaymentConfirmation";

	private static final String _SQL_SELECT_ACQUIREPAYMENTCONFIRMATION_WHERE =
		"SELECT acquirePaymentConfirmation FROM AcquirePaymentConfirmation acquirePaymentConfirmation WHERE ";

	private static final String _SQL_COUNT_ACQUIREPAYMENTCONFIRMATION =
		"SELECT COUNT(acquirePaymentConfirmation) FROM AcquirePaymentConfirmation acquirePaymentConfirmation";

	private static final String _SQL_COUNT_ACQUIREPAYMENTCONFIRMATION_WHERE =
		"SELECT COUNT(acquirePaymentConfirmation) FROM AcquirePaymentConfirmation acquirePaymentConfirmation WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"acquirePaymentConfirmation.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AcquirePaymentConfirmation exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AcquirePaymentConfirmation exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AcquirePaymentConfirmationPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"comment"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}