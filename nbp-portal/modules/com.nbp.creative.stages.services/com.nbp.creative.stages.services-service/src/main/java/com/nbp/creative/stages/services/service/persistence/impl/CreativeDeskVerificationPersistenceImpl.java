/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.stages.services.service.persistence.impl;

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

import com.nbp.creative.stages.services.exception.NoSuchCreativeDeskVerificationException;
import com.nbp.creative.stages.services.model.CreativeDeskVerification;
import com.nbp.creative.stages.services.model.CreativeDeskVerificationTable;
import com.nbp.creative.stages.services.model.impl.CreativeDeskVerificationImpl;
import com.nbp.creative.stages.services.model.impl.CreativeDeskVerificationModelImpl;
import com.nbp.creative.stages.services.service.persistence.CreativeDeskVerificationPersistence;
import com.nbp.creative.stages.services.service.persistence.CreativeDeskVerificationUtil;
import com.nbp.creative.stages.services.service.persistence.impl.constants.CREATIVE_STAGESPersistenceConstants;

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
 * The persistence implementation for the creative desk verification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CreativeDeskVerificationPersistence.class)
public class CreativeDeskVerificationPersistenceImpl
	extends BasePersistenceImpl<CreativeDeskVerification>
	implements CreativeDeskVerificationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CreativeDeskVerificationUtil</code> to access the creative desk verification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CreativeDeskVerificationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetDeskVerCreativeById;
	private FinderPath _finderPathWithoutPaginationFindBygetDeskVerCreativeById;
	private FinderPath _finderPathCountBygetDeskVerCreativeById;

	/**
	 * Returns all the creative desk verifications where creativeApplicationId = &#63;.
	 *
	 * @param creativeApplicationId the creative application ID
	 * @return the matching creative desk verifications
	 */
	@Override
	public List<CreativeDeskVerification> findBygetDeskVerCreativeById(
		long creativeApplicationId) {

		return findBygetDeskVerCreativeById(
			creativeApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the creative desk verifications where creativeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param creativeApplicationId the creative application ID
	 * @param start the lower bound of the range of creative desk verifications
	 * @param end the upper bound of the range of creative desk verifications (not inclusive)
	 * @return the range of matching creative desk verifications
	 */
	@Override
	public List<CreativeDeskVerification> findBygetDeskVerCreativeById(
		long creativeApplicationId, int start, int end) {

		return findBygetDeskVerCreativeById(
			creativeApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the creative desk verifications where creativeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param creativeApplicationId the creative application ID
	 * @param start the lower bound of the range of creative desk verifications
	 * @param end the upper bound of the range of creative desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching creative desk verifications
	 */
	@Override
	public List<CreativeDeskVerification> findBygetDeskVerCreativeById(
		long creativeApplicationId, int start, int end,
		OrderByComparator<CreativeDeskVerification> orderByComparator) {

		return findBygetDeskVerCreativeById(
			creativeApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the creative desk verifications where creativeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param creativeApplicationId the creative application ID
	 * @param start the lower bound of the range of creative desk verifications
	 * @param end the upper bound of the range of creative desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching creative desk verifications
	 */
	@Override
	public List<CreativeDeskVerification> findBygetDeskVerCreativeById(
		long creativeApplicationId, int start, int end,
		OrderByComparator<CreativeDeskVerification> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetDeskVerCreativeById;
				finderArgs = new Object[] {creativeApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetDeskVerCreativeById;
			finderArgs = new Object[] {
				creativeApplicationId, start, end, orderByComparator
			};
		}

		List<CreativeDeskVerification> list = null;

		if (useFinderCache) {
			list = (List<CreativeDeskVerification>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CreativeDeskVerification creativeDeskVerification : list) {
					if (creativeApplicationId !=
							creativeDeskVerification.
								getCreativeApplicationId()) {

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

			sb.append(_SQL_SELECT_CREATIVEDESKVERIFICATION_WHERE);

			sb.append(
				_FINDER_COLUMN_GETDESKVERCREATIVEBYID_CREATIVEAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(CreativeDeskVerificationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(creativeApplicationId);

				list = (List<CreativeDeskVerification>)QueryUtil.list(
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
	 * Returns the first creative desk verification in the ordered set where creativeApplicationId = &#63;.
	 *
	 * @param creativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative desk verification
	 * @throws NoSuchCreativeDeskVerificationException if a matching creative desk verification could not be found
	 */
	@Override
	public CreativeDeskVerification findBygetDeskVerCreativeById_First(
			long creativeApplicationId,
			OrderByComparator<CreativeDeskVerification> orderByComparator)
		throws NoSuchCreativeDeskVerificationException {

		CreativeDeskVerification creativeDeskVerification =
			fetchBygetDeskVerCreativeById_First(
				creativeApplicationId, orderByComparator);

		if (creativeDeskVerification != null) {
			return creativeDeskVerification;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("creativeApplicationId=");
		sb.append(creativeApplicationId);

		sb.append("}");

		throw new NoSuchCreativeDeskVerificationException(sb.toString());
	}

	/**
	 * Returns the first creative desk verification in the ordered set where creativeApplicationId = &#63;.
	 *
	 * @param creativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative desk verification, or <code>null</code> if a matching creative desk verification could not be found
	 */
	@Override
	public CreativeDeskVerification fetchBygetDeskVerCreativeById_First(
		long creativeApplicationId,
		OrderByComparator<CreativeDeskVerification> orderByComparator) {

		List<CreativeDeskVerification> list = findBygetDeskVerCreativeById(
			creativeApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last creative desk verification in the ordered set where creativeApplicationId = &#63;.
	 *
	 * @param creativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative desk verification
	 * @throws NoSuchCreativeDeskVerificationException if a matching creative desk verification could not be found
	 */
	@Override
	public CreativeDeskVerification findBygetDeskVerCreativeById_Last(
			long creativeApplicationId,
			OrderByComparator<CreativeDeskVerification> orderByComparator)
		throws NoSuchCreativeDeskVerificationException {

		CreativeDeskVerification creativeDeskVerification =
			fetchBygetDeskVerCreativeById_Last(
				creativeApplicationId, orderByComparator);

		if (creativeDeskVerification != null) {
			return creativeDeskVerification;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("creativeApplicationId=");
		sb.append(creativeApplicationId);

		sb.append("}");

		throw new NoSuchCreativeDeskVerificationException(sb.toString());
	}

	/**
	 * Returns the last creative desk verification in the ordered set where creativeApplicationId = &#63;.
	 *
	 * @param creativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative desk verification, or <code>null</code> if a matching creative desk verification could not be found
	 */
	@Override
	public CreativeDeskVerification fetchBygetDeskVerCreativeById_Last(
		long creativeApplicationId,
		OrderByComparator<CreativeDeskVerification> orderByComparator) {

		int count = countBygetDeskVerCreativeById(creativeApplicationId);

		if (count == 0) {
			return null;
		}

		List<CreativeDeskVerification> list = findBygetDeskVerCreativeById(
			creativeApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the creative desk verifications before and after the current creative desk verification in the ordered set where creativeApplicationId = &#63;.
	 *
	 * @param creativeDeskVerificationId the primary key of the current creative desk verification
	 * @param creativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next creative desk verification
	 * @throws NoSuchCreativeDeskVerificationException if a creative desk verification with the primary key could not be found
	 */
	@Override
	public CreativeDeskVerification[] findBygetDeskVerCreativeById_PrevAndNext(
			long creativeDeskVerificationId, long creativeApplicationId,
			OrderByComparator<CreativeDeskVerification> orderByComparator)
		throws NoSuchCreativeDeskVerificationException {

		CreativeDeskVerification creativeDeskVerification = findByPrimaryKey(
			creativeDeskVerificationId);

		Session session = null;

		try {
			session = openSession();

			CreativeDeskVerification[] array =
				new CreativeDeskVerificationImpl[3];

			array[0] = getBygetDeskVerCreativeById_PrevAndNext(
				session, creativeDeskVerification, creativeApplicationId,
				orderByComparator, true);

			array[1] = creativeDeskVerification;

			array[2] = getBygetDeskVerCreativeById_PrevAndNext(
				session, creativeDeskVerification, creativeApplicationId,
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

	protected CreativeDeskVerification getBygetDeskVerCreativeById_PrevAndNext(
		Session session, CreativeDeskVerification creativeDeskVerification,
		long creativeApplicationId,
		OrderByComparator<CreativeDeskVerification> orderByComparator,
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

		sb.append(_SQL_SELECT_CREATIVEDESKVERIFICATION_WHERE);

		sb.append(
			_FINDER_COLUMN_GETDESKVERCREATIVEBYID_CREATIVEAPPLICATIONID_2);

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
			sb.append(CreativeDeskVerificationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(creativeApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						creativeDeskVerification)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CreativeDeskVerification> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the creative desk verifications where creativeApplicationId = &#63; from the database.
	 *
	 * @param creativeApplicationId the creative application ID
	 */
	@Override
	public void removeBygetDeskVerCreativeById(long creativeApplicationId) {
		for (CreativeDeskVerification creativeDeskVerification :
				findBygetDeskVerCreativeById(
					creativeApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(creativeDeskVerification);
		}
	}

	/**
	 * Returns the number of creative desk verifications where creativeApplicationId = &#63;.
	 *
	 * @param creativeApplicationId the creative application ID
	 * @return the number of matching creative desk verifications
	 */
	@Override
	public int countBygetDeskVerCreativeById(long creativeApplicationId) {
		FinderPath finderPath = _finderPathCountBygetDeskVerCreativeById;

		Object[] finderArgs = new Object[] {creativeApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CREATIVEDESKVERIFICATION_WHERE);

			sb.append(
				_FINDER_COLUMN_GETDESKVERCREATIVEBYID_CREATIVEAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(creativeApplicationId);

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
		_FINDER_COLUMN_GETDESKVERCREATIVEBYID_CREATIVEAPPLICATIONID_2 =
			"creativeDeskVerification.creativeApplicationId = ?";

	public CreativeDeskVerificationPersistenceImpl() {
		setModelClass(CreativeDeskVerification.class);

		setModelImplClass(CreativeDeskVerificationImpl.class);
		setModelPKClass(long.class);

		setTable(CreativeDeskVerificationTable.INSTANCE);
	}

	/**
	 * Caches the creative desk verification in the entity cache if it is enabled.
	 *
	 * @param creativeDeskVerification the creative desk verification
	 */
	@Override
	public void cacheResult(CreativeDeskVerification creativeDeskVerification) {
		entityCache.putResult(
			CreativeDeskVerificationImpl.class,
			creativeDeskVerification.getPrimaryKey(), creativeDeskVerification);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the creative desk verifications in the entity cache if it is enabled.
	 *
	 * @param creativeDeskVerifications the creative desk verifications
	 */
	@Override
	public void cacheResult(
		List<CreativeDeskVerification> creativeDeskVerifications) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (creativeDeskVerifications.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (CreativeDeskVerification creativeDeskVerification :
				creativeDeskVerifications) {

			if (entityCache.getResult(
					CreativeDeskVerificationImpl.class,
					creativeDeskVerification.getPrimaryKey()) == null) {

				cacheResult(creativeDeskVerification);
			}
		}
	}

	/**
	 * Clears the cache for all creative desk verifications.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CreativeDeskVerificationImpl.class);

		finderCache.clearCache(CreativeDeskVerificationImpl.class);
	}

	/**
	 * Clears the cache for the creative desk verification.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CreativeDeskVerification creativeDeskVerification) {
		entityCache.removeResult(
			CreativeDeskVerificationImpl.class, creativeDeskVerification);
	}

	@Override
	public void clearCache(
		List<CreativeDeskVerification> creativeDeskVerifications) {

		for (CreativeDeskVerification creativeDeskVerification :
				creativeDeskVerifications) {

			entityCache.removeResult(
				CreativeDeskVerificationImpl.class, creativeDeskVerification);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(CreativeDeskVerificationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				CreativeDeskVerificationImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new creative desk verification with the primary key. Does not add the creative desk verification to the database.
	 *
	 * @param creativeDeskVerificationId the primary key for the new creative desk verification
	 * @return the new creative desk verification
	 */
	@Override
	public CreativeDeskVerification create(long creativeDeskVerificationId) {
		CreativeDeskVerification creativeDeskVerification =
			new CreativeDeskVerificationImpl();

		creativeDeskVerification.setNew(true);
		creativeDeskVerification.setPrimaryKey(creativeDeskVerificationId);

		creativeDeskVerification.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return creativeDeskVerification;
	}

	/**
	 * Removes the creative desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param creativeDeskVerificationId the primary key of the creative desk verification
	 * @return the creative desk verification that was removed
	 * @throws NoSuchCreativeDeskVerificationException if a creative desk verification with the primary key could not be found
	 */
	@Override
	public CreativeDeskVerification remove(long creativeDeskVerificationId)
		throws NoSuchCreativeDeskVerificationException {

		return remove((Serializable)creativeDeskVerificationId);
	}

	/**
	 * Removes the creative desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the creative desk verification
	 * @return the creative desk verification that was removed
	 * @throws NoSuchCreativeDeskVerificationException if a creative desk verification with the primary key could not be found
	 */
	@Override
	public CreativeDeskVerification remove(Serializable primaryKey)
		throws NoSuchCreativeDeskVerificationException {

		Session session = null;

		try {
			session = openSession();

			CreativeDeskVerification creativeDeskVerification =
				(CreativeDeskVerification)session.get(
					CreativeDeskVerificationImpl.class, primaryKey);

			if (creativeDeskVerification == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCreativeDeskVerificationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(creativeDeskVerification);
		}
		catch (NoSuchCreativeDeskVerificationException noSuchEntityException) {
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
	protected CreativeDeskVerification removeImpl(
		CreativeDeskVerification creativeDeskVerification) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(creativeDeskVerification)) {
				creativeDeskVerification =
					(CreativeDeskVerification)session.get(
						CreativeDeskVerificationImpl.class,
						creativeDeskVerification.getPrimaryKeyObj());
			}

			if (creativeDeskVerification != null) {
				session.delete(creativeDeskVerification);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (creativeDeskVerification != null) {
			clearCache(creativeDeskVerification);
		}

		return creativeDeskVerification;
	}

	@Override
	public CreativeDeskVerification updateImpl(
		CreativeDeskVerification creativeDeskVerification) {

		boolean isNew = creativeDeskVerification.isNew();

		if (!(creativeDeskVerification instanceof
				CreativeDeskVerificationModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(creativeDeskVerification.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					creativeDeskVerification);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in creativeDeskVerification proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CreativeDeskVerification implementation " +
					creativeDeskVerification.getClass());
		}

		CreativeDeskVerificationModelImpl creativeDeskVerificationModelImpl =
			(CreativeDeskVerificationModelImpl)creativeDeskVerification;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (creativeDeskVerification.getCreateDate() == null)) {
			if (serviceContext == null) {
				creativeDeskVerification.setCreateDate(date);
			}
			else {
				creativeDeskVerification.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!creativeDeskVerificationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				creativeDeskVerification.setModifiedDate(date);
			}
			else {
				creativeDeskVerification.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(creativeDeskVerification);
			}
			else {
				creativeDeskVerification =
					(CreativeDeskVerification)session.merge(
						creativeDeskVerification);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CreativeDeskVerificationImpl.class,
			creativeDeskVerificationModelImpl, false, true);

		if (isNew) {
			creativeDeskVerification.setNew(false);
		}

		creativeDeskVerification.resetOriginalValues();

		return creativeDeskVerification;
	}

	/**
	 * Returns the creative desk verification with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the creative desk verification
	 * @return the creative desk verification
	 * @throws NoSuchCreativeDeskVerificationException if a creative desk verification with the primary key could not be found
	 */
	@Override
	public CreativeDeskVerification findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCreativeDeskVerificationException {

		CreativeDeskVerification creativeDeskVerification = fetchByPrimaryKey(
			primaryKey);

		if (creativeDeskVerification == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCreativeDeskVerificationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return creativeDeskVerification;
	}

	/**
	 * Returns the creative desk verification with the primary key or throws a <code>NoSuchCreativeDeskVerificationException</code> if it could not be found.
	 *
	 * @param creativeDeskVerificationId the primary key of the creative desk verification
	 * @return the creative desk verification
	 * @throws NoSuchCreativeDeskVerificationException if a creative desk verification with the primary key could not be found
	 */
	@Override
	public CreativeDeskVerification findByPrimaryKey(
			long creativeDeskVerificationId)
		throws NoSuchCreativeDeskVerificationException {

		return findByPrimaryKey((Serializable)creativeDeskVerificationId);
	}

	/**
	 * Returns the creative desk verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param creativeDeskVerificationId the primary key of the creative desk verification
	 * @return the creative desk verification, or <code>null</code> if a creative desk verification with the primary key could not be found
	 */
	@Override
	public CreativeDeskVerification fetchByPrimaryKey(
		long creativeDeskVerificationId) {

		return fetchByPrimaryKey((Serializable)creativeDeskVerificationId);
	}

	/**
	 * Returns all the creative desk verifications.
	 *
	 * @return the creative desk verifications
	 */
	@Override
	public List<CreativeDeskVerification> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the creative desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative desk verifications
	 * @param end the upper bound of the range of creative desk verifications (not inclusive)
	 * @return the range of creative desk verifications
	 */
	@Override
	public List<CreativeDeskVerification> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the creative desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative desk verifications
	 * @param end the upper bound of the range of creative desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of creative desk verifications
	 */
	@Override
	public List<CreativeDeskVerification> findAll(
		int start, int end,
		OrderByComparator<CreativeDeskVerification> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the creative desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative desk verifications
	 * @param end the upper bound of the range of creative desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of creative desk verifications
	 */
	@Override
	public List<CreativeDeskVerification> findAll(
		int start, int end,
		OrderByComparator<CreativeDeskVerification> orderByComparator,
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

		List<CreativeDeskVerification> list = null;

		if (useFinderCache) {
			list = (List<CreativeDeskVerification>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CREATIVEDESKVERIFICATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CREATIVEDESKVERIFICATION;

				sql = sql.concat(
					CreativeDeskVerificationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<CreativeDeskVerification>)QueryUtil.list(
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
	 * Removes all the creative desk verifications from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CreativeDeskVerification creativeDeskVerification : findAll()) {
			remove(creativeDeskVerification);
		}
	}

	/**
	 * Returns the number of creative desk verifications.
	 *
	 * @return the number of creative desk verifications
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
					_SQL_COUNT_CREATIVEDESKVERIFICATION);

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
		return "creativeDeskVerificationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CREATIVEDESKVERIFICATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CreativeDeskVerificationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the creative desk verification persistence.
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

		_finderPathWithPaginationFindBygetDeskVerCreativeById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBygetDeskVerCreativeById",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"creativeApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetDeskVerCreativeById =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetDeskVerCreativeById",
				new String[] {Long.class.getName()},
				new String[] {"creativeApplicationId"}, true);

		_finderPathCountBygetDeskVerCreativeById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetDeskVerCreativeById",
			new String[] {Long.class.getName()},
			new String[] {"creativeApplicationId"}, false);

		CreativeDeskVerificationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		CreativeDeskVerificationUtil.setPersistence(null);

		entityCache.removeCache(CreativeDeskVerificationImpl.class.getName());
	}

	@Override
	@Reference(
		target = CREATIVE_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = CREATIVE_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = CREATIVE_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_CREATIVEDESKVERIFICATION =
		"SELECT creativeDeskVerification FROM CreativeDeskVerification creativeDeskVerification";

	private static final String _SQL_SELECT_CREATIVEDESKVERIFICATION_WHERE =
		"SELECT creativeDeskVerification FROM CreativeDeskVerification creativeDeskVerification WHERE ";

	private static final String _SQL_COUNT_CREATIVEDESKVERIFICATION =
		"SELECT COUNT(creativeDeskVerification) FROM CreativeDeskVerification creativeDeskVerification";

	private static final String _SQL_COUNT_CREATIVEDESKVERIFICATION_WHERE =
		"SELECT COUNT(creativeDeskVerification) FROM CreativeDeskVerification creativeDeskVerification WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"creativeDeskVerification.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CreativeDeskVerification exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CreativeDeskVerification exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CreativeDeskVerificationPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}