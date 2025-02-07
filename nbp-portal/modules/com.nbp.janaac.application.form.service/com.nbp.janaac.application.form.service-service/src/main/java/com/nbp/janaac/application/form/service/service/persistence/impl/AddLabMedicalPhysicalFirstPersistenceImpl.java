/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence.impl;

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

import com.nbp.janaac.application.form.service.exception.NoSuchAddLabMedicalPhysicalFirstException;
import com.nbp.janaac.application.form.service.model.AddLabMedicalPhysicalFirst;
import com.nbp.janaac.application.form.service.model.AddLabMedicalPhysicalFirstTable;
import com.nbp.janaac.application.form.service.model.impl.AddLabMedicalPhysicalFirstImpl;
import com.nbp.janaac.application.form.service.model.impl.AddLabMedicalPhysicalFirstModelImpl;
import com.nbp.janaac.application.form.service.service.persistence.AddLabMedicalPhysicalFirstPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddLabMedicalPhysicalFirstUtil;
import com.nbp.janaac.application.form.service.service.persistence.impl.constants.JANAAC_APPLICATION_FORMPersistenceConstants;

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
 * The persistence implementation for the add lab medical physical first service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AddLabMedicalPhysicalFirstPersistence.class)
public class AddLabMedicalPhysicalFirstPersistenceImpl
	extends BasePersistenceImpl<AddLabMedicalPhysicalFirst>
	implements AddLabMedicalPhysicalFirstPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AddLabMedicalPhysicalFirstUtil</code> to access the add lab medical physical first persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AddLabMedicalPhysicalFirstImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetJanaacById;
	private FinderPath _finderPathWithoutPaginationFindBygetJanaacById;
	private FinderPath _finderPathCountBygetJanaacById;

	/**
	 * Returns all the add lab medical physical firsts where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add lab medical physical firsts
	 */
	@Override
	public List<AddLabMedicalPhysicalFirst> findBygetJanaacById(
		long janaacApplicationId) {

		return findBygetJanaacById(
			janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add lab medical physical firsts where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalPhysicalFirstModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab medical physical firsts
	 * @param end the upper bound of the range of add lab medical physical firsts (not inclusive)
	 * @return the range of matching add lab medical physical firsts
	 */
	@Override
	public List<AddLabMedicalPhysicalFirst> findBygetJanaacById(
		long janaacApplicationId, int start, int end) {

		return findBygetJanaacById(janaacApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the add lab medical physical firsts where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalPhysicalFirstModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab medical physical firsts
	 * @param end the upper bound of the range of add lab medical physical firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add lab medical physical firsts
	 */
	@Override
	public List<AddLabMedicalPhysicalFirst> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddLabMedicalPhysicalFirst> orderByComparator) {

		return findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add lab medical physical firsts where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalPhysicalFirstModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab medical physical firsts
	 * @param end the upper bound of the range of add lab medical physical firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add lab medical physical firsts
	 */
	@Override
	public List<AddLabMedicalPhysicalFirst> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddLabMedicalPhysicalFirst> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetJanaacById;
				finderArgs = new Object[] {janaacApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetJanaacById;
			finderArgs = new Object[] {
				janaacApplicationId, start, end, orderByComparator
			};
		}

		List<AddLabMedicalPhysicalFirst> list = null;

		if (useFinderCache) {
			list = (List<AddLabMedicalPhysicalFirst>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AddLabMedicalPhysicalFirst addLabMedicalPhysicalFirst :
						list) {

					if (janaacApplicationId !=
							addLabMedicalPhysicalFirst.
								getJanaacApplicationId()) {

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

			sb.append(_SQL_SELECT_ADDLABMEDICALPHYSICALFIRST_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AddLabMedicalPhysicalFirstModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(janaacApplicationId);

				list = (List<AddLabMedicalPhysicalFirst>)QueryUtil.list(
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
	 * Returns the first add lab medical physical first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab medical physical first
	 * @throws NoSuchAddLabMedicalPhysicalFirstException if a matching add lab medical physical first could not be found
	 */
	@Override
	public AddLabMedicalPhysicalFirst findBygetJanaacById_First(
			long janaacApplicationId,
			OrderByComparator<AddLabMedicalPhysicalFirst> orderByComparator)
		throws NoSuchAddLabMedicalPhysicalFirstException {

		AddLabMedicalPhysicalFirst addLabMedicalPhysicalFirst =
			fetchBygetJanaacById_First(janaacApplicationId, orderByComparator);

		if (addLabMedicalPhysicalFirst != null) {
			return addLabMedicalPhysicalFirst;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddLabMedicalPhysicalFirstException(sb.toString());
	}

	/**
	 * Returns the first add lab medical physical first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab medical physical first, or <code>null</code> if a matching add lab medical physical first could not be found
	 */
	@Override
	public AddLabMedicalPhysicalFirst fetchBygetJanaacById_First(
		long janaacApplicationId,
		OrderByComparator<AddLabMedicalPhysicalFirst> orderByComparator) {

		List<AddLabMedicalPhysicalFirst> list = findBygetJanaacById(
			janaacApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last add lab medical physical first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab medical physical first
	 * @throws NoSuchAddLabMedicalPhysicalFirstException if a matching add lab medical physical first could not be found
	 */
	@Override
	public AddLabMedicalPhysicalFirst findBygetJanaacById_Last(
			long janaacApplicationId,
			OrderByComparator<AddLabMedicalPhysicalFirst> orderByComparator)
		throws NoSuchAddLabMedicalPhysicalFirstException {

		AddLabMedicalPhysicalFirst addLabMedicalPhysicalFirst =
			fetchBygetJanaacById_Last(janaacApplicationId, orderByComparator);

		if (addLabMedicalPhysicalFirst != null) {
			return addLabMedicalPhysicalFirst;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddLabMedicalPhysicalFirstException(sb.toString());
	}

	/**
	 * Returns the last add lab medical physical first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab medical physical first, or <code>null</code> if a matching add lab medical physical first could not be found
	 */
	@Override
	public AddLabMedicalPhysicalFirst fetchBygetJanaacById_Last(
		long janaacApplicationId,
		OrderByComparator<AddLabMedicalPhysicalFirst> orderByComparator) {

		int count = countBygetJanaacById(janaacApplicationId);

		if (count == 0) {
			return null;
		}

		List<AddLabMedicalPhysicalFirst> list = findBygetJanaacById(
			janaacApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the add lab medical physical firsts before and after the current add lab medical physical first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addLabMedicalPhysicalFirstId the primary key of the current add lab medical physical first
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add lab medical physical first
	 * @throws NoSuchAddLabMedicalPhysicalFirstException if a add lab medical physical first with the primary key could not be found
	 */
	@Override
	public AddLabMedicalPhysicalFirst[] findBygetJanaacById_PrevAndNext(
			long addLabMedicalPhysicalFirstId, long janaacApplicationId,
			OrderByComparator<AddLabMedicalPhysicalFirst> orderByComparator)
		throws NoSuchAddLabMedicalPhysicalFirstException {

		AddLabMedicalPhysicalFirst addLabMedicalPhysicalFirst =
			findByPrimaryKey(addLabMedicalPhysicalFirstId);

		Session session = null;

		try {
			session = openSession();

			AddLabMedicalPhysicalFirst[] array =
				new AddLabMedicalPhysicalFirstImpl[3];

			array[0] = getBygetJanaacById_PrevAndNext(
				session, addLabMedicalPhysicalFirst, janaacApplicationId,
				orderByComparator, true);

			array[1] = addLabMedicalPhysicalFirst;

			array[2] = getBygetJanaacById_PrevAndNext(
				session, addLabMedicalPhysicalFirst, janaacApplicationId,
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

	protected AddLabMedicalPhysicalFirst getBygetJanaacById_PrevAndNext(
		Session session, AddLabMedicalPhysicalFirst addLabMedicalPhysicalFirst,
		long janaacApplicationId,
		OrderByComparator<AddLabMedicalPhysicalFirst> orderByComparator,
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

		sb.append(_SQL_SELECT_ADDLABMEDICALPHYSICALFIRST_WHERE);

		sb.append(_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2);

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
			sb.append(AddLabMedicalPhysicalFirstModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(janaacApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						addLabMedicalPhysicalFirst)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AddLabMedicalPhysicalFirst> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the add lab medical physical firsts where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	@Override
	public void removeBygetJanaacById(long janaacApplicationId) {
		for (AddLabMedicalPhysicalFirst addLabMedicalPhysicalFirst :
				findBygetJanaacById(
					janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(addLabMedicalPhysicalFirst);
		}
	}

	/**
	 * Returns the number of add lab medical physical firsts where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add lab medical physical firsts
	 */
	@Override
	public int countBygetJanaacById(long janaacApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJanaacById;

		Object[] finderArgs = new Object[] {janaacApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ADDLABMEDICALPHYSICALFIRST_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(janaacApplicationId);

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
		_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2 =
			"addLabMedicalPhysicalFirst.janaacApplicationId = ?";

	public AddLabMedicalPhysicalFirstPersistenceImpl() {
		setModelClass(AddLabMedicalPhysicalFirst.class);

		setModelImplClass(AddLabMedicalPhysicalFirstImpl.class);
		setModelPKClass(long.class);

		setTable(AddLabMedicalPhysicalFirstTable.INSTANCE);
	}

	/**
	 * Caches the add lab medical physical first in the entity cache if it is enabled.
	 *
	 * @param addLabMedicalPhysicalFirst the add lab medical physical first
	 */
	@Override
	public void cacheResult(
		AddLabMedicalPhysicalFirst addLabMedicalPhysicalFirst) {

		entityCache.putResult(
			AddLabMedicalPhysicalFirstImpl.class,
			addLabMedicalPhysicalFirst.getPrimaryKey(),
			addLabMedicalPhysicalFirst);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the add lab medical physical firsts in the entity cache if it is enabled.
	 *
	 * @param addLabMedicalPhysicalFirsts the add lab medical physical firsts
	 */
	@Override
	public void cacheResult(
		List<AddLabMedicalPhysicalFirst> addLabMedicalPhysicalFirsts) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (addLabMedicalPhysicalFirsts.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AddLabMedicalPhysicalFirst addLabMedicalPhysicalFirst :
				addLabMedicalPhysicalFirsts) {

			if (entityCache.getResult(
					AddLabMedicalPhysicalFirstImpl.class,
					addLabMedicalPhysicalFirst.getPrimaryKey()) == null) {

				cacheResult(addLabMedicalPhysicalFirst);
			}
		}
	}

	/**
	 * Clears the cache for all add lab medical physical firsts.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AddLabMedicalPhysicalFirstImpl.class);

		finderCache.clearCache(AddLabMedicalPhysicalFirstImpl.class);
	}

	/**
	 * Clears the cache for the add lab medical physical first.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		AddLabMedicalPhysicalFirst addLabMedicalPhysicalFirst) {

		entityCache.removeResult(
			AddLabMedicalPhysicalFirstImpl.class, addLabMedicalPhysicalFirst);
	}

	@Override
	public void clearCache(
		List<AddLabMedicalPhysicalFirst> addLabMedicalPhysicalFirsts) {

		for (AddLabMedicalPhysicalFirst addLabMedicalPhysicalFirst :
				addLabMedicalPhysicalFirsts) {

			entityCache.removeResult(
				AddLabMedicalPhysicalFirstImpl.class,
				addLabMedicalPhysicalFirst);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AddLabMedicalPhysicalFirstImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AddLabMedicalPhysicalFirstImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new add lab medical physical first with the primary key. Does not add the add lab medical physical first to the database.
	 *
	 * @param addLabMedicalPhysicalFirstId the primary key for the new add lab medical physical first
	 * @return the new add lab medical physical first
	 */
	@Override
	public AddLabMedicalPhysicalFirst create(
		long addLabMedicalPhysicalFirstId) {

		AddLabMedicalPhysicalFirst addLabMedicalPhysicalFirst =
			new AddLabMedicalPhysicalFirstImpl();

		addLabMedicalPhysicalFirst.setNew(true);
		addLabMedicalPhysicalFirst.setPrimaryKey(addLabMedicalPhysicalFirstId);

		addLabMedicalPhysicalFirst.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return addLabMedicalPhysicalFirst;
	}

	/**
	 * Removes the add lab medical physical first with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addLabMedicalPhysicalFirstId the primary key of the add lab medical physical first
	 * @return the add lab medical physical first that was removed
	 * @throws NoSuchAddLabMedicalPhysicalFirstException if a add lab medical physical first with the primary key could not be found
	 */
	@Override
	public AddLabMedicalPhysicalFirst remove(long addLabMedicalPhysicalFirstId)
		throws NoSuchAddLabMedicalPhysicalFirstException {

		return remove((Serializable)addLabMedicalPhysicalFirstId);
	}

	/**
	 * Removes the add lab medical physical first with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the add lab medical physical first
	 * @return the add lab medical physical first that was removed
	 * @throws NoSuchAddLabMedicalPhysicalFirstException if a add lab medical physical first with the primary key could not be found
	 */
	@Override
	public AddLabMedicalPhysicalFirst remove(Serializable primaryKey)
		throws NoSuchAddLabMedicalPhysicalFirstException {

		Session session = null;

		try {
			session = openSession();

			AddLabMedicalPhysicalFirst addLabMedicalPhysicalFirst =
				(AddLabMedicalPhysicalFirst)session.get(
					AddLabMedicalPhysicalFirstImpl.class, primaryKey);

			if (addLabMedicalPhysicalFirst == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAddLabMedicalPhysicalFirstException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(addLabMedicalPhysicalFirst);
		}
		catch (NoSuchAddLabMedicalPhysicalFirstException
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
	protected AddLabMedicalPhysicalFirst removeImpl(
		AddLabMedicalPhysicalFirst addLabMedicalPhysicalFirst) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(addLabMedicalPhysicalFirst)) {
				addLabMedicalPhysicalFirst =
					(AddLabMedicalPhysicalFirst)session.get(
						AddLabMedicalPhysicalFirstImpl.class,
						addLabMedicalPhysicalFirst.getPrimaryKeyObj());
			}

			if (addLabMedicalPhysicalFirst != null) {
				session.delete(addLabMedicalPhysicalFirst);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (addLabMedicalPhysicalFirst != null) {
			clearCache(addLabMedicalPhysicalFirst);
		}

		return addLabMedicalPhysicalFirst;
	}

	@Override
	public AddLabMedicalPhysicalFirst updateImpl(
		AddLabMedicalPhysicalFirst addLabMedicalPhysicalFirst) {

		boolean isNew = addLabMedicalPhysicalFirst.isNew();

		if (!(addLabMedicalPhysicalFirst instanceof
				AddLabMedicalPhysicalFirstModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(addLabMedicalPhysicalFirst.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					addLabMedicalPhysicalFirst);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in addLabMedicalPhysicalFirst proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AddLabMedicalPhysicalFirst implementation " +
					addLabMedicalPhysicalFirst.getClass());
		}

		AddLabMedicalPhysicalFirstModelImpl
			addLabMedicalPhysicalFirstModelImpl =
				(AddLabMedicalPhysicalFirstModelImpl)addLabMedicalPhysicalFirst;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (addLabMedicalPhysicalFirst.getCreateDate() == null)) {
			if (serviceContext == null) {
				addLabMedicalPhysicalFirst.setCreateDate(date);
			}
			else {
				addLabMedicalPhysicalFirst.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!addLabMedicalPhysicalFirstModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				addLabMedicalPhysicalFirst.setModifiedDate(date);
			}
			else {
				addLabMedicalPhysicalFirst.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(addLabMedicalPhysicalFirst);
			}
			else {
				addLabMedicalPhysicalFirst =
					(AddLabMedicalPhysicalFirst)session.merge(
						addLabMedicalPhysicalFirst);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AddLabMedicalPhysicalFirstImpl.class,
			addLabMedicalPhysicalFirstModelImpl, false, true);

		if (isNew) {
			addLabMedicalPhysicalFirst.setNew(false);
		}

		addLabMedicalPhysicalFirst.resetOriginalValues();

		return addLabMedicalPhysicalFirst;
	}

	/**
	 * Returns the add lab medical physical first with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the add lab medical physical first
	 * @return the add lab medical physical first
	 * @throws NoSuchAddLabMedicalPhysicalFirstException if a add lab medical physical first with the primary key could not be found
	 */
	@Override
	public AddLabMedicalPhysicalFirst findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAddLabMedicalPhysicalFirstException {

		AddLabMedicalPhysicalFirst addLabMedicalPhysicalFirst =
			fetchByPrimaryKey(primaryKey);

		if (addLabMedicalPhysicalFirst == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAddLabMedicalPhysicalFirstException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return addLabMedicalPhysicalFirst;
	}

	/**
	 * Returns the add lab medical physical first with the primary key or throws a <code>NoSuchAddLabMedicalPhysicalFirstException</code> if it could not be found.
	 *
	 * @param addLabMedicalPhysicalFirstId the primary key of the add lab medical physical first
	 * @return the add lab medical physical first
	 * @throws NoSuchAddLabMedicalPhysicalFirstException if a add lab medical physical first with the primary key could not be found
	 */
	@Override
	public AddLabMedicalPhysicalFirst findByPrimaryKey(
			long addLabMedicalPhysicalFirstId)
		throws NoSuchAddLabMedicalPhysicalFirstException {

		return findByPrimaryKey((Serializable)addLabMedicalPhysicalFirstId);
	}

	/**
	 * Returns the add lab medical physical first with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addLabMedicalPhysicalFirstId the primary key of the add lab medical physical first
	 * @return the add lab medical physical first, or <code>null</code> if a add lab medical physical first with the primary key could not be found
	 */
	@Override
	public AddLabMedicalPhysicalFirst fetchByPrimaryKey(
		long addLabMedicalPhysicalFirstId) {

		return fetchByPrimaryKey((Serializable)addLabMedicalPhysicalFirstId);
	}

	/**
	 * Returns all the add lab medical physical firsts.
	 *
	 * @return the add lab medical physical firsts
	 */
	@Override
	public List<AddLabMedicalPhysicalFirst> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add lab medical physical firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalPhysicalFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab medical physical firsts
	 * @param end the upper bound of the range of add lab medical physical firsts (not inclusive)
	 * @return the range of add lab medical physical firsts
	 */
	@Override
	public List<AddLabMedicalPhysicalFirst> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the add lab medical physical firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalPhysicalFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab medical physical firsts
	 * @param end the upper bound of the range of add lab medical physical firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add lab medical physical firsts
	 */
	@Override
	public List<AddLabMedicalPhysicalFirst> findAll(
		int start, int end,
		OrderByComparator<AddLabMedicalPhysicalFirst> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add lab medical physical firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalPhysicalFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab medical physical firsts
	 * @param end the upper bound of the range of add lab medical physical firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add lab medical physical firsts
	 */
	@Override
	public List<AddLabMedicalPhysicalFirst> findAll(
		int start, int end,
		OrderByComparator<AddLabMedicalPhysicalFirst> orderByComparator,
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

		List<AddLabMedicalPhysicalFirst> list = null;

		if (useFinderCache) {
			list = (List<AddLabMedicalPhysicalFirst>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ADDLABMEDICALPHYSICALFIRST);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ADDLABMEDICALPHYSICALFIRST;

				sql = sql.concat(
					AddLabMedicalPhysicalFirstModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AddLabMedicalPhysicalFirst>)QueryUtil.list(
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
	 * Removes all the add lab medical physical firsts from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AddLabMedicalPhysicalFirst addLabMedicalPhysicalFirst :
				findAll()) {

			remove(addLabMedicalPhysicalFirst);
		}
	}

	/**
	 * Returns the number of add lab medical physical firsts.
	 *
	 * @return the number of add lab medical physical firsts
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
					_SQL_COUNT_ADDLABMEDICALPHYSICALFIRST);

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
		return "addLabMedicalPhysicalFirstId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ADDLABMEDICALPHYSICALFIRST;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AddLabMedicalPhysicalFirstModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the add lab medical physical first persistence.
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

		_finderPathWithPaginationFindBygetJanaacById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetJanaacById",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"janaacApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetJanaacById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetJanaacById",
			new String[] {Long.class.getName()},
			new String[] {"janaacApplicationId"}, true);

		_finderPathCountBygetJanaacById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetJanaacById",
			new String[] {Long.class.getName()},
			new String[] {"janaacApplicationId"}, false);

		AddLabMedicalPhysicalFirstUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AddLabMedicalPhysicalFirstUtil.setPersistence(null);

		entityCache.removeCache(AddLabMedicalPhysicalFirstImpl.class.getName());
	}

	@Override
	@Reference(
		target = JANAAC_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = JANAAC_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = JANAAC_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_ADDLABMEDICALPHYSICALFIRST =
		"SELECT addLabMedicalPhysicalFirst FROM AddLabMedicalPhysicalFirst addLabMedicalPhysicalFirst";

	private static final String _SQL_SELECT_ADDLABMEDICALPHYSICALFIRST_WHERE =
		"SELECT addLabMedicalPhysicalFirst FROM AddLabMedicalPhysicalFirst addLabMedicalPhysicalFirst WHERE ";

	private static final String _SQL_COUNT_ADDLABMEDICALPHYSICALFIRST =
		"SELECT COUNT(addLabMedicalPhysicalFirst) FROM AddLabMedicalPhysicalFirst addLabMedicalPhysicalFirst";

	private static final String _SQL_COUNT_ADDLABMEDICALPHYSICALFIRST_WHERE =
		"SELECT COUNT(addLabMedicalPhysicalFirst) FROM AddLabMedicalPhysicalFirst addLabMedicalPhysicalFirst WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"addLabMedicalPhysicalFirst.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AddLabMedicalPhysicalFirst exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AddLabMedicalPhysicalFirst exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AddLabMedicalPhysicalFirstPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}