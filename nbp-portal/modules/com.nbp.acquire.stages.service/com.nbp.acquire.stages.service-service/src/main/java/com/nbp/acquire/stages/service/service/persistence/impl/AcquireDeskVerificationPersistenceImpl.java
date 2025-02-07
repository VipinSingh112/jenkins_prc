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

import com.nbp.acquire.stages.service.exception.NoSuchAcquireDeskVerificationException;
import com.nbp.acquire.stages.service.model.AcquireDeskVerification;
import com.nbp.acquire.stages.service.model.AcquireDeskVerificationTable;
import com.nbp.acquire.stages.service.model.impl.AcquireDeskVerificationImpl;
import com.nbp.acquire.stages.service.model.impl.AcquireDeskVerificationModelImpl;
import com.nbp.acquire.stages.service.service.persistence.AcquireDeskVerificationPersistence;
import com.nbp.acquire.stages.service.service.persistence.AcquireDeskVerificationUtil;
import com.nbp.acquire.stages.service.service.persistence.impl.constants.NBP_ACQUIREPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the acquire desk verification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AcquireDeskVerificationPersistence.class)
public class AcquireDeskVerificationPersistenceImpl
	extends BasePersistenceImpl<AcquireDeskVerification>
	implements AcquireDeskVerificationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AcquireDeskVerificationUtil</code> to access the acquire desk verification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AcquireDeskVerificationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath
		_finderPathWithPaginationFindBygetDeskVerificationAcquireById;
	private FinderPath
		_finderPathWithoutPaginationFindBygetDeskVerificationAcquireById;
	private FinderPath _finderPathCountBygetDeskVerificationAcquireById;

	/**
	 * Returns all the acquire desk verifications where acquireApplicationId = &#63;.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire desk verifications
	 */
	@Override
	public List<AcquireDeskVerification> findBygetDeskVerificationAcquireById(
		long acquireApplicationId) {

		return findBygetDeskVerificationAcquireById(
			acquireApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acquire desk verifications where acquireApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @param start the lower bound of the range of acquire desk verifications
	 * @param end the upper bound of the range of acquire desk verifications (not inclusive)
	 * @return the range of matching acquire desk verifications
	 */
	@Override
	public List<AcquireDeskVerification> findBygetDeskVerificationAcquireById(
		long acquireApplicationId, int start, int end) {

		return findBygetDeskVerificationAcquireById(
			acquireApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the acquire desk verifications where acquireApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @param start the lower bound of the range of acquire desk verifications
	 * @param end the upper bound of the range of acquire desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acquire desk verifications
	 */
	@Override
	public List<AcquireDeskVerification> findBygetDeskVerificationAcquireById(
		long acquireApplicationId, int start, int end,
		OrderByComparator<AcquireDeskVerification> orderByComparator) {

		return findBygetDeskVerificationAcquireById(
			acquireApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acquire desk verifications where acquireApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @param start the lower bound of the range of acquire desk verifications
	 * @param end the upper bound of the range of acquire desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acquire desk verifications
	 */
	@Override
	public List<AcquireDeskVerification> findBygetDeskVerificationAcquireById(
		long acquireApplicationId, int start, int end,
		OrderByComparator<AcquireDeskVerification> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetDeskVerificationAcquireById;
				finderArgs = new Object[] {acquireApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetDeskVerificationAcquireById;
			finderArgs = new Object[] {
				acquireApplicationId, start, end, orderByComparator
			};
		}

		List<AcquireDeskVerification> list = null;

		if (useFinderCache) {
			list = (List<AcquireDeskVerification>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AcquireDeskVerification acquireDeskVerification : list) {
					if (acquireApplicationId !=
							acquireDeskVerification.getAcquireApplicationId()) {

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

			sb.append(_SQL_SELECT_ACQUIREDESKVERIFICATION_WHERE);

			sb.append(
				_FINDER_COLUMN_GETDESKVERIFICATIONACQUIREBYID_ACQUIREAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AcquireDeskVerificationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(acquireApplicationId);

				list = (List<AcquireDeskVerification>)QueryUtil.list(
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
	 * Returns the first acquire desk verification in the ordered set where acquireApplicationId = &#63;.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire desk verification
	 * @throws NoSuchAcquireDeskVerificationException if a matching acquire desk verification could not be found
	 */
	@Override
	public AcquireDeskVerification findBygetDeskVerificationAcquireById_First(
			long acquireApplicationId,
			OrderByComparator<AcquireDeskVerification> orderByComparator)
		throws NoSuchAcquireDeskVerificationException {

		AcquireDeskVerification acquireDeskVerification =
			fetchBygetDeskVerificationAcquireById_First(
				acquireApplicationId, orderByComparator);

		if (acquireDeskVerification != null) {
			return acquireDeskVerification;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("acquireApplicationId=");
		sb.append(acquireApplicationId);

		sb.append("}");

		throw new NoSuchAcquireDeskVerificationException(sb.toString());
	}

	/**
	 * Returns the first acquire desk verification in the ordered set where acquireApplicationId = &#63;.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire desk verification, or <code>null</code> if a matching acquire desk verification could not be found
	 */
	@Override
	public AcquireDeskVerification fetchBygetDeskVerificationAcquireById_First(
		long acquireApplicationId,
		OrderByComparator<AcquireDeskVerification> orderByComparator) {

		List<AcquireDeskVerification> list =
			findBygetDeskVerificationAcquireById(
				acquireApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last acquire desk verification in the ordered set where acquireApplicationId = &#63;.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire desk verification
	 * @throws NoSuchAcquireDeskVerificationException if a matching acquire desk verification could not be found
	 */
	@Override
	public AcquireDeskVerification findBygetDeskVerificationAcquireById_Last(
			long acquireApplicationId,
			OrderByComparator<AcquireDeskVerification> orderByComparator)
		throws NoSuchAcquireDeskVerificationException {

		AcquireDeskVerification acquireDeskVerification =
			fetchBygetDeskVerificationAcquireById_Last(
				acquireApplicationId, orderByComparator);

		if (acquireDeskVerification != null) {
			return acquireDeskVerification;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("acquireApplicationId=");
		sb.append(acquireApplicationId);

		sb.append("}");

		throw new NoSuchAcquireDeskVerificationException(sb.toString());
	}

	/**
	 * Returns the last acquire desk verification in the ordered set where acquireApplicationId = &#63;.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire desk verification, or <code>null</code> if a matching acquire desk verification could not be found
	 */
	@Override
	public AcquireDeskVerification fetchBygetDeskVerificationAcquireById_Last(
		long acquireApplicationId,
		OrderByComparator<AcquireDeskVerification> orderByComparator) {

		int count = countBygetDeskVerificationAcquireById(acquireApplicationId);

		if (count == 0) {
			return null;
		}

		List<AcquireDeskVerification> list =
			findBygetDeskVerificationAcquireById(
				acquireApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the acquire desk verifications before and after the current acquire desk verification in the ordered set where acquireApplicationId = &#63;.
	 *
	 * @param acquireDeskVerificationId the primary key of the current acquire desk verification
	 * @param acquireApplicationId the acquire application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acquire desk verification
	 * @throws NoSuchAcquireDeskVerificationException if a acquire desk verification with the primary key could not be found
	 */
	@Override
	public AcquireDeskVerification[]
			findBygetDeskVerificationAcquireById_PrevAndNext(
				long acquireDeskVerificationId, long acquireApplicationId,
				OrderByComparator<AcquireDeskVerification> orderByComparator)
		throws NoSuchAcquireDeskVerificationException {

		AcquireDeskVerification acquireDeskVerification = findByPrimaryKey(
			acquireDeskVerificationId);

		Session session = null;

		try {
			session = openSession();

			AcquireDeskVerification[] array =
				new AcquireDeskVerificationImpl[3];

			array[0] = getBygetDeskVerificationAcquireById_PrevAndNext(
				session, acquireDeskVerification, acquireApplicationId,
				orderByComparator, true);

			array[1] = acquireDeskVerification;

			array[2] = getBygetDeskVerificationAcquireById_PrevAndNext(
				session, acquireDeskVerification, acquireApplicationId,
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

	protected AcquireDeskVerification
		getBygetDeskVerificationAcquireById_PrevAndNext(
			Session session, AcquireDeskVerification acquireDeskVerification,
			long acquireApplicationId,
			OrderByComparator<AcquireDeskVerification> orderByComparator,
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

		sb.append(_SQL_SELECT_ACQUIREDESKVERIFICATION_WHERE);

		sb.append(
			_FINDER_COLUMN_GETDESKVERIFICATIONACQUIREBYID_ACQUIREAPPLICATIONID_2);

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
			sb.append(AcquireDeskVerificationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(acquireApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						acquireDeskVerification)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AcquireDeskVerification> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the acquire desk verifications where acquireApplicationId = &#63; from the database.
	 *
	 * @param acquireApplicationId the acquire application ID
	 */
	@Override
	public void removeBygetDeskVerificationAcquireById(
		long acquireApplicationId) {

		for (AcquireDeskVerification acquireDeskVerification :
				findBygetDeskVerificationAcquireById(
					acquireApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(acquireDeskVerification);
		}
	}

	/**
	 * Returns the number of acquire desk verifications where acquireApplicationId = &#63;.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the number of matching acquire desk verifications
	 */
	@Override
	public int countBygetDeskVerificationAcquireById(
		long acquireApplicationId) {

		FinderPath finderPath =
			_finderPathCountBygetDeskVerificationAcquireById;

		Object[] finderArgs = new Object[] {acquireApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ACQUIREDESKVERIFICATION_WHERE);

			sb.append(
				_FINDER_COLUMN_GETDESKVERIFICATIONACQUIREBYID_ACQUIREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(acquireApplicationId);

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
		_FINDER_COLUMN_GETDESKVERIFICATIONACQUIREBYID_ACQUIREAPPLICATIONID_2 =
			"acquireDeskVerification.acquireApplicationId = ?";

	public AcquireDeskVerificationPersistenceImpl() {
		setModelClass(AcquireDeskVerification.class);

		setModelImplClass(AcquireDeskVerificationImpl.class);
		setModelPKClass(long.class);

		setTable(AcquireDeskVerificationTable.INSTANCE);
	}

	/**
	 * Caches the acquire desk verification in the entity cache if it is enabled.
	 *
	 * @param acquireDeskVerification the acquire desk verification
	 */
	@Override
	public void cacheResult(AcquireDeskVerification acquireDeskVerification) {
		entityCache.putResult(
			AcquireDeskVerificationImpl.class,
			acquireDeskVerification.getPrimaryKey(), acquireDeskVerification);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the acquire desk verifications in the entity cache if it is enabled.
	 *
	 * @param acquireDeskVerifications the acquire desk verifications
	 */
	@Override
	public void cacheResult(
		List<AcquireDeskVerification> acquireDeskVerifications) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (acquireDeskVerifications.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AcquireDeskVerification acquireDeskVerification :
				acquireDeskVerifications) {

			if (entityCache.getResult(
					AcquireDeskVerificationImpl.class,
					acquireDeskVerification.getPrimaryKey()) == null) {

				cacheResult(acquireDeskVerification);
			}
		}
	}

	/**
	 * Clears the cache for all acquire desk verifications.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AcquireDeskVerificationImpl.class);

		finderCache.clearCache(AcquireDeskVerificationImpl.class);
	}

	/**
	 * Clears the cache for the acquire desk verification.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AcquireDeskVerification acquireDeskVerification) {
		entityCache.removeResult(
			AcquireDeskVerificationImpl.class, acquireDeskVerification);
	}

	@Override
	public void clearCache(
		List<AcquireDeskVerification> acquireDeskVerifications) {

		for (AcquireDeskVerification acquireDeskVerification :
				acquireDeskVerifications) {

			entityCache.removeResult(
				AcquireDeskVerificationImpl.class, acquireDeskVerification);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AcquireDeskVerificationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AcquireDeskVerificationImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new acquire desk verification with the primary key. Does not add the acquire desk verification to the database.
	 *
	 * @param acquireDeskVerificationId the primary key for the new acquire desk verification
	 * @return the new acquire desk verification
	 */
	@Override
	public AcquireDeskVerification create(long acquireDeskVerificationId) {
		AcquireDeskVerification acquireDeskVerification =
			new AcquireDeskVerificationImpl();

		acquireDeskVerification.setNew(true);
		acquireDeskVerification.setPrimaryKey(acquireDeskVerificationId);

		acquireDeskVerification.setCompanyId(CompanyThreadLocal.getCompanyId());

		return acquireDeskVerification;
	}

	/**
	 * Removes the acquire desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquireDeskVerificationId the primary key of the acquire desk verification
	 * @return the acquire desk verification that was removed
	 * @throws NoSuchAcquireDeskVerificationException if a acquire desk verification with the primary key could not be found
	 */
	@Override
	public AcquireDeskVerification remove(long acquireDeskVerificationId)
		throws NoSuchAcquireDeskVerificationException {

		return remove((Serializable)acquireDeskVerificationId);
	}

	/**
	 * Removes the acquire desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the acquire desk verification
	 * @return the acquire desk verification that was removed
	 * @throws NoSuchAcquireDeskVerificationException if a acquire desk verification with the primary key could not be found
	 */
	@Override
	public AcquireDeskVerification remove(Serializable primaryKey)
		throws NoSuchAcquireDeskVerificationException {

		Session session = null;

		try {
			session = openSession();

			AcquireDeskVerification acquireDeskVerification =
				(AcquireDeskVerification)session.get(
					AcquireDeskVerificationImpl.class, primaryKey);

			if (acquireDeskVerification == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAcquireDeskVerificationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(acquireDeskVerification);
		}
		catch (NoSuchAcquireDeskVerificationException noSuchEntityException) {
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
	protected AcquireDeskVerification removeImpl(
		AcquireDeskVerification acquireDeskVerification) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(acquireDeskVerification)) {
				acquireDeskVerification = (AcquireDeskVerification)session.get(
					AcquireDeskVerificationImpl.class,
					acquireDeskVerification.getPrimaryKeyObj());
			}

			if (acquireDeskVerification != null) {
				session.delete(acquireDeskVerification);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (acquireDeskVerification != null) {
			clearCache(acquireDeskVerification);
		}

		return acquireDeskVerification;
	}

	@Override
	public AcquireDeskVerification updateImpl(
		AcquireDeskVerification acquireDeskVerification) {

		boolean isNew = acquireDeskVerification.isNew();

		if (!(acquireDeskVerification instanceof
				AcquireDeskVerificationModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(acquireDeskVerification.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					acquireDeskVerification);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in acquireDeskVerification proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AcquireDeskVerification implementation " +
					acquireDeskVerification.getClass());
		}

		AcquireDeskVerificationModelImpl acquireDeskVerificationModelImpl =
			(AcquireDeskVerificationModelImpl)acquireDeskVerification;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (acquireDeskVerification.getCreateDate() == null)) {
			if (serviceContext == null) {
				acquireDeskVerification.setCreateDate(date);
			}
			else {
				acquireDeskVerification.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!acquireDeskVerificationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				acquireDeskVerification.setModifiedDate(date);
			}
			else {
				acquireDeskVerification.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(acquireDeskVerification);
			}
			else {
				acquireDeskVerification =
					(AcquireDeskVerification)session.merge(
						acquireDeskVerification);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AcquireDeskVerificationImpl.class, acquireDeskVerificationModelImpl,
			false, true);

		if (isNew) {
			acquireDeskVerification.setNew(false);
		}

		acquireDeskVerification.resetOriginalValues();

		return acquireDeskVerification;
	}

	/**
	 * Returns the acquire desk verification with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the acquire desk verification
	 * @return the acquire desk verification
	 * @throws NoSuchAcquireDeskVerificationException if a acquire desk verification with the primary key could not be found
	 */
	@Override
	public AcquireDeskVerification findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAcquireDeskVerificationException {

		AcquireDeskVerification acquireDeskVerification = fetchByPrimaryKey(
			primaryKey);

		if (acquireDeskVerification == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAcquireDeskVerificationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return acquireDeskVerification;
	}

	/**
	 * Returns the acquire desk verification with the primary key or throws a <code>NoSuchAcquireDeskVerificationException</code> if it could not be found.
	 *
	 * @param acquireDeskVerificationId the primary key of the acquire desk verification
	 * @return the acquire desk verification
	 * @throws NoSuchAcquireDeskVerificationException if a acquire desk verification with the primary key could not be found
	 */
	@Override
	public AcquireDeskVerification findByPrimaryKey(
			long acquireDeskVerificationId)
		throws NoSuchAcquireDeskVerificationException {

		return findByPrimaryKey((Serializable)acquireDeskVerificationId);
	}

	/**
	 * Returns the acquire desk verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquireDeskVerificationId the primary key of the acquire desk verification
	 * @return the acquire desk verification, or <code>null</code> if a acquire desk verification with the primary key could not be found
	 */
	@Override
	public AcquireDeskVerification fetchByPrimaryKey(
		long acquireDeskVerificationId) {

		return fetchByPrimaryKey((Serializable)acquireDeskVerificationId);
	}

	/**
	 * Returns all the acquire desk verifications.
	 *
	 * @return the acquire desk verifications
	 */
	@Override
	public List<AcquireDeskVerification> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acquire desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire desk verifications
	 * @param end the upper bound of the range of acquire desk verifications (not inclusive)
	 * @return the range of acquire desk verifications
	 */
	@Override
	public List<AcquireDeskVerification> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the acquire desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire desk verifications
	 * @param end the upper bound of the range of acquire desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire desk verifications
	 */
	@Override
	public List<AcquireDeskVerification> findAll(
		int start, int end,
		OrderByComparator<AcquireDeskVerification> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acquire desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire desk verifications
	 * @param end the upper bound of the range of acquire desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire desk verifications
	 */
	@Override
	public List<AcquireDeskVerification> findAll(
		int start, int end,
		OrderByComparator<AcquireDeskVerification> orderByComparator,
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

		List<AcquireDeskVerification> list = null;

		if (useFinderCache) {
			list = (List<AcquireDeskVerification>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ACQUIREDESKVERIFICATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ACQUIREDESKVERIFICATION;

				sql = sql.concat(
					AcquireDeskVerificationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AcquireDeskVerification>)QueryUtil.list(
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
	 * Removes all the acquire desk verifications from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AcquireDeskVerification acquireDeskVerification : findAll()) {
			remove(acquireDeskVerification);
		}
	}

	/**
	 * Returns the number of acquire desk verifications.
	 *
	 * @return the number of acquire desk verifications
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
					_SQL_COUNT_ACQUIREDESKVERIFICATION);

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
		return "acquireDeskVerificationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ACQUIREDESKVERIFICATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AcquireDeskVerificationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the acquire desk verification persistence.
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

		_finderPathWithPaginationFindBygetDeskVerificationAcquireById =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetDeskVerificationAcquireById",
				new String[] {
					Long.class.getName(), Integer.class.getName(),
					Integer.class.getName(), OrderByComparator.class.getName()
				},
				new String[] {"acquireApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetDeskVerificationAcquireById =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetDeskVerificationAcquireById",
				new String[] {Long.class.getName()},
				new String[] {"acquireApplicationId"}, true);

		_finderPathCountBygetDeskVerificationAcquireById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetDeskVerificationAcquireById",
			new String[] {Long.class.getName()},
			new String[] {"acquireApplicationId"}, false);

		AcquireDeskVerificationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AcquireDeskVerificationUtil.setPersistence(null);

		entityCache.removeCache(AcquireDeskVerificationImpl.class.getName());
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

	private static final String _SQL_SELECT_ACQUIREDESKVERIFICATION =
		"SELECT acquireDeskVerification FROM AcquireDeskVerification acquireDeskVerification";

	private static final String _SQL_SELECT_ACQUIREDESKVERIFICATION_WHERE =
		"SELECT acquireDeskVerification FROM AcquireDeskVerification acquireDeskVerification WHERE ";

	private static final String _SQL_COUNT_ACQUIREDESKVERIFICATION =
		"SELECT COUNT(acquireDeskVerification) FROM AcquireDeskVerification acquireDeskVerification";

	private static final String _SQL_COUNT_ACQUIREDESKVERIFICATION_WHERE =
		"SELECT COUNT(acquireDeskVerification) FROM AcquireDeskVerification acquireDeskVerification WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"acquireDeskVerification.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AcquireDeskVerification exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AcquireDeskVerification exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AcquireDeskVerificationPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}